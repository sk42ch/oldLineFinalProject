package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinition.SharedSD;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class DarkSkyNet extends BasePage {
    private By darkSkyApi = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By signUp = By.xpath("//a[@class='button filled']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By hoursLocator = By.xpath("//div[1]/div[1]/div[3]/span/span");
    private By timeLineTempratureLocator = By.xpath("//div[@class='temps']//span/span");
    private By currentTemplocator = By.xpath("//span[@class='summary swap']");
    private By todayTimelinelocator = By.xpath("//a[1]//span[2]//span[2]");
    private By moveTomiddle = By.xpath("//a[7]//span[2]//span[2]");
    private By todayExpenddLowTemp = By.xpath("//*[@id=\"week\"]/a[1]/span[2]/span[1]");
    private By todayExpandHightTemp = By.xpath("//*[@id=\"week\"]/a[1]/span[2]/span[3]");
    private By todaydisplaylowTemp = By.xpath("//*[@id=\"week\"]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]");
    private By todayDisplayHighTemp = By.xpath("//*[@id=\"week\"]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");

    public List  alltheHoursfromTimeline() {


        List<WebElement> timelist = SharedSD.getDriver().findElements(hoursLocator);
        List<String> listOfhourfromWebelement = new ArrayList();
        int i;
        for (i=1; i<11;i++) {

            String s = timelist.get(i).getText().toUpperCase();
           // s.replaceAll("Now", "");
            listOfhourfromWebelement.add(s);

            //System.out.println(s);
            //System.out.println(element.getText());


        }
        return listOfhourfromWebelement;
    }

    public void assertIncrementHours() {

        Assert.assertEquals(alltheHoursfromTimeline(),incremetnTimefromSystem(),"Time is increment are correctly");
    }

    public List incremetnTimefromSystem() {
        List<String> listOfhourLocalTIme = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        calendar.getTime();
//        String now = sdf.format( calendar.getTime() );
//        System.out.println(now);
        int incrementHours = 11;
        for (int i = 1; i < incrementHours; ) {
            calendar.add(Calendar.HOUR_OF_DAY, 2);
            String expectedHours = sdf.format(calendar.getTime());
            listOfhourLocalTIme.add(expectedHours);

            i++;
            System.out.println(expectedHours);

        }
        return listOfhourLocalTIme;
    }


    public void goToDarkSkyAPI() {
        clickOn(darkSkyApi);
    }

    public void goToSignUp() {
        clickOn(signUp);
    }

    public void clickOnRegisterButton() throws InterruptedException {
        clickOn(registerButton);
    }

    public void verifyErrorRegisterPage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky API: Register", "Invalid Register Error Page");
    }

    public void navigateToDarkSkynet() {
        SharedSD.getDriver().navigate().to("http://darksky.net");

    }

    public void currentTempratureVerfy() {
        String currentTempraturefromWeb = SharedSD.getDriver().findElement(currentTemplocator).getText().substring(0, 2);
        int currentTemp = Integer.parseInt(currentTempraturefromWeb);
        List<WebElement> tempratureLine = SharedSD.getDriver().findElements(timeLineTempratureLocator);
        List<String> stringTemp = new ArrayList<String>();
        for (WebElement timeLineTemp : tempratureLine) {
            stringTemp.add(timeLineTemp.getText().substring(0, 2));
        }
        Collections.sort(stringTemp);
        String stringMaxtemp = Collections.max(stringTemp);
        String stringMintemp = Collections.min(stringTemp);
        int maxTemp = Integer.parseInt(stringMaxtemp);
        int minTemp = Integer.parseInt(stringMintemp);
        boolean isValid = true;
        if (currentTemp > maxTemp || currentTemp < minTemp) {
            isValid = false;
            System.out.println("Temprature is not displayed correctly");
        } else {
            System.out.println("Assertion test pass, Temprature displayed correctly");
        }
        Assert.assertTrue(isValid);


    }


    public void moveToTodayExpendElement() throws InterruptedException {



        WebElement targetTo = SharedSD.getDriver().findElement(moveTomiddle);
        Thread.sleep(4000);
        Actions actions = new Actions(SharedSD.getDriver());
        actions.moveToElement(targetTo);
        actions.perform();
        Thread.sleep(4000);
        SharedSD.getDriver().findElement(todayTimelinelocator).click();

    }

    public void displayTempVerify() {
        String displayHighTemp = SharedSD.getDriver().findElement(todayExpandHightTemp).getText();
        String displayLowTemp = SharedSD.getDriver().findElement(todayExpenddLowTemp).getText();
        String expendLowTemp = SharedSD.getDriver().findElement(todaydisplaylowTemp).getText();
        String expendHightTemp = SharedSD.getDriver().findElement(todayDisplayHighTemp).getText();
        boolean isValid = true;
        if (!displayHighTemp.matches(expendHightTemp)|| !displayLowTemp.matches(expendLowTemp)) {
            isValid = false;
            System.out.println("Test Faild, Display Temprature not showing currectly.");
        } else {
            System.out.println("Test Pass");
        }
        Assert.assertEquals(displayHighTemp,expendHightTemp,"TestFaild");
        Assert.assertTrue(isValid);
    }

}
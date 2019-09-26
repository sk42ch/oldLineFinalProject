package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepdefinition.SharedSD;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class psvm {
    private By times = By.xpath("//div[1]/div[1]/div[3]/span/span");


    @Test
    public void hello() {
        SharedSD.getDriver().navigate().to("http://darksky.net");
        foo();
        System.out.println("Total increment hour from System " + incremetnTimefromSystem());
        System.out.println("Total hours from Webelemnt" + foo());
        Assert.assertEquals(incremetnTimefromSystem(), foo(), " Perfect matcho");


    }

    public String incremetnTimefromSystem() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        calendar.getTime();
//        String now = sdf.format( calendar.getTime() );
//        System.out.println(now);
        int incrementHours = 11;
        for (int i = 0; i < incrementHours; ) {
            calendar.add(Calendar.HOUR_OF_DAY, 2);
            String expectedHours = sdf.format(calendar.getTime());
            i++;
            System.out.println(expectedHours);

        }
        return incremetnTimefromSystem();
    }



    private String foo() {

        List<WebElement> timelist = SharedSD.getDriver().findElements(times);
        int i = 12;
        for (WebElement element : timelist) {
            element.getText();

            String s = element.getText();
            s = s.replaceAll("Now", "");

            //System.out.println(s);
            //System.out.println(element.getText());
            i++;


        }
return null;
    }
}

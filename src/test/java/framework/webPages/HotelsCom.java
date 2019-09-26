package framework.webPages;

import cucumber.api.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelsCom extends BasePage{

    private By popUp = By.xpath("//button[@class='cta widget-overlay-close']");
    private By destinationField = By.xpath("//input[@id='qf-0q-destination']");
    private By selectNewYorkNework = By.xpath("//tr[@id='citysqm-asi0-s0']//div[text()=', New York, United States of America']");
    private By searchButton = By.xpath("//button[@class='cta cta-strong']");
    private By clickstar3 = By.xpath("//input[@id='f-star-rating-3']");
    private By clickstar4 = By.xpath("//input[@id='f-star-rating-4']");
    private By clickstar5 = By.xpath("//input[@id='f-star-rating-5']");
    private By star3hotels = By.xpath("//*[@class='star-rating-text']");
    private By star4hotels = By.xpath("//*[@class='star-rating-text star-rating-text-strong']");
    private By star5hotels = By.xpath("//*[@class='star-rating-text star-rating-text-strong']");

    private By star1Element = By.xpath("//span[contains(text(),'1-star')]");
    private By rediusMiles = By.xpath("//*[@class='property-landmarks']//li[1]");


public void goTo() {
    SharedSD.getDriver().navigate().to("http://hotels.com");
}
public void clickOnsearch () throws InterruptedException {
      clickOn(popUp);
    setValue(destinationField,"New York, New York");
    Thread.sleep(3000);
    clickOn(selectNewYorkNework);
    clickOn(searchButton);
}
public void scroleToelement () throws InterruptedException {
    moveToElement(star1Element);
}
public void clickStar3 ()throws InterruptedException {
    scroleToelement();
    clickOn(clickstar3);
}
public void clickStar4 ()throws InterruptedException {
    scroleToelement();
    clickOn(clickstar4);
}
public void clickStar5() throws InterruptedException {
    scroleToelement();
    clickOn(clickstar5);
}

public void scroolUpto50Hotels () throws InterruptedException {
        for (int second = 0; ; second++) {
        if (second >= 25) {
            break;
        }
        ((JavascriptExecutor) SharedSD.getDriver()).executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(4000);
    }
}

    public void stars3() {
        List<String> starString = new ArrayList();
        List<WebElement> alltheStar = SharedSD.getDriver().findElements(star3hotels);
        for (int i = 0; i < alltheStar.size(); i++) {
            String s = alltheStar.get(i).getText();
            String c = s.substring(0,s.length()-5);
            starString.add(c);
        }
        Collections.sort(starString);
        String minium = Collections.min(starString);
        String maximum = Collections.max(starString);
        double miniumRatings = Double.parseDouble(minium);
        double maxmiumRatings = Double.parseDouble(maximum);

        boolean isValid = false;
        if (miniumRatings >=3.0 && maxmiumRatings <=3.9) {
            System.out.println("All the star are showing correctly 3-Stars");
            isValid = true;
        } else {
            System.out.println("Ratings not showing correct assertion Faild");
        }
        Assert.assertTrue(isValid,"Ratings not match, Test Faild");

    }


    public void stars4() {
        List<String> starString = new ArrayList();
        List<WebElement> alltheStar = SharedSD.getDriver().findElements(star4hotels);
        for (int i = 0; i < alltheStar.size(); i++) {
            String s = alltheStar.get(i).getText();
            String c = s.substring(0,s.length()-5);
            starString.add(c);
        }
        Collections.sort(starString);
        String minium = Collections.min(starString);
        String maximum = Collections.max(starString);
        double miniumRatings = Double.parseDouble(minium);
        double maxmiumRatings = Double.parseDouble(maximum);

        boolean isValid = false;
        if (miniumRatings >=4.0 && maxmiumRatings <= 4.9) {
            System.out.println("Ratings showing currect 4-Stars");
            isValid = true;
        } else {
            System.out.println("Ratings not showing correct assertion Faild");
        }
        Assert.assertTrue(isValid,"Ratings not match, Test Faild");

    }

    public void stars5() {
        List<String> starString = new ArrayList();
        List<WebElement> alltheStar = SharedSD.getDriver().findElements(star5hotels);
        for (int i = 0; i < alltheStar.size(); i++) {
            String s = alltheStar.get(i).getText();
            String c = s.substring(0,s.length()-5);
            starString.add(c);
        }
        Collections.sort(starString);
        String minium = Collections.min(starString);
        String maximum = Collections.max(starString);
        double miniumRatings = Double.parseDouble(minium);
        double maxmiumRatings = Double.parseDouble(maximum);

        boolean isValid = false;
        if (miniumRatings >=5 && maxmiumRatings <=5) {
            System.out.println("Rating showing correctly 5-stars");
            isValid = true;
        } else {
            System.out.println("Ratings not showing correct assertion Faild");
        }
        Assert.assertTrue(isValid,"Ratings not match, Test Faild");

    }
    public void hotelsMileCheeking() {
        List<String> alltheHotelsMiles = new ArrayList();
        List<WebElement> miles = SharedSD.getDriver().findElements(rediusMiles);
        for (int i = 0; i < miles.size(); i++) {
            String s = miles.get(i).getText();
            String c = s.substring(0, s.length() - 21);
            alltheHotelsMiles.add(c);
        }
        Collections.sort(alltheHotelsMiles);
        String maxim = Collections.max(alltheHotelsMiles);
        double maximum = Double.parseDouble(maxim);
        String mini = Collections.min(alltheHotelsMiles);
        double minimum = Double.parseDouble(mini);
        boolean isValid = false;
        if (minimum >= 0.00 && maximum <= 10.0) {
            isValid = true;
            System.out.println("first 50 hotels in under 10 miles");
        }else System.out.println("Test Faild, Hotels is not in under 10 miles, please cheek back later");
        Assert.assertTrue(isValid,"Test Faild");
    }

}
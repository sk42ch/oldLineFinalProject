package framework.webPages;

import cucumber.api.java.ca.I;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import stepdefinition.SharedSD;

public class MessengerPage extends BasePage{
    private String facebookurl = "http://facebook.com";
    private String pinteresturl = "http://pinterest.com";
    private String instragramurl = "http://instragram.com";
    private String youtubeurl = "http://youtube.com";
    private String soundcloudurl = "http://soundcloud.com";

//Addmefast Account information
    private By email = By.xpath("//input[@placeholder='Email']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By loginButton = By.xpath("//input[@name='login_button']");



    public void addmefastEmail (String value) {
        setValue(email,value);
    }

    public void addmefastPassowd(String value){
        setValue(password,value);
    }

    public void addmefastClikonButton () {
        clickOn(loginButton);
    }


    public void toAddmefast() {
        SharedSD.getDriver().navigate().to("");
    }

   public void navigateToFacebook(){
        SharedSD.getDriver().navigate().to(facebookurl);
   }
   public void navigateToPinterest(){
        SharedSD.getDriver().navigate().to(pinteresturl);
   }
public void navigateToYoutube(){
        SharedSD.getDriver().navigate().to(youtubeurl);
}
public void navigateToInstragram() {
        SharedSD.getDriver().navigate().to(instragramurl);
}
public void navigateToSoundCloud(){
        SharedSD.getDriver().navigate().to(soundcloudurl);
}
}

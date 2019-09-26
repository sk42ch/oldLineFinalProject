package framework.webPages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;

import java.util.PrimitiveIterator;

public class Youtube extends BasePage {

    private By singinButton = By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//paper-button[@id='button']");
    private By emailAddress = By.xpath("//input[@id='identifierId']");
    private By password = By.xpath("//input[@name='password']");
    private By nextButton = By.xpath("//span[@class='RveJvd snByac']");
    private By userPicButton = By.xpath("//button[@id='avatar-btn']");
    private By switchAccount = By.xpath("//yt-formatted-string[contains(text(),'Switch account')]");
    private By channel001  = By.xpath("//yt-formatted-string[contains(text(),'Youtube001')]");
    private By channel002  = By.xpath("//yt-formatted-string[contains(text(),'Youtube002')]");
    private By channel003  = By.xpath("//yt-formatted-string[contains(text(),'Youtube003')]");
    private By channel004  = By.xpath("//yt-formatted-string[contains(text(),'Youtube004')]");
    private By channel005  = By.xpath("//yt-formatted-string[contains(text(),'Youtube005')]");
    private By channel006  = By.xpath("//yt-formatted-string[contains(text(),'Youtube006')]");
    private By channel007  = By.xpath("//yt-formatted-string[contains(text(),'Youtube007')]");
    private By channel008  = By.xpath("//yt-formatted-string[contains(text(),'Youtube008')]");
    private By channel009  = By.xpath("//yt-formatted-string[contains(text(),'Youtube009')]");
    private By channel010  = By.xpath("//yt-formatted-string[contains(text(),'Youtube010')]");
    private By channel011  = By.xpath("//yt-formatted-string[contains(text(),'Youtube011')]");
    private By channel012  = By.xpath("//yt-formatted-string[contains(text(),'Youtube012')]");




    public void youtubeLogin()throws InterruptedException {
        clickOn(singinButton);
        Thread.sleep(5000);
        setValue(emailAddress,"rashedaakter.akter@gmail.com");
        clickOn(nextButton);
        Thread.sleep(5000);
        setValue(password,"1814078069");
        clickOn(nextButton);
        Thread.sleep(5000);
    }

    public void gotoChannale() throws InterruptedException {
        clickOn(userPicButton);
        Thread.sleep(5000);
        clickOn(switchAccount);
        Thread.sleep(5000);

    }

    public void channel11 ()throws InterruptedException{
        clickOn(channel011);
        Thread.sleep(5000);
    }
    public void channel9 ()throws InterruptedException{
        clickOn(channel009);
        Thread.sleep(5000);
    }
    public void channel8 ()throws InterruptedException{
        clickOn(channel008);
        Thread.sleep(5000);
    }
    public void channel6 ()throws InterruptedException{
        clickOn(channel006);
        Thread.sleep(5000);
    }
    public void channel7 ()throws InterruptedException{
        clickOn(channel007);
        Thread.sleep(5000);
    }
    public void channel4 ()throws InterruptedException{
        clickOn(channel004);
        Thread.sleep(5000);
    }

}

package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.MessengerLoginPage;
import framework.webPages.MessengerPage;
import framework.webPages.Youtube;
import org.testng.Assert;

public class MessengerSD {


    private MessengerPage messengerPage = new MessengerPage();
    private Youtube youtube = new Youtube();


    @Given("^I am on AF home page$")
    public void toAddmefast() throws InterruptedException {
    }


    @When("^I enter (.+) into (email|password) text field on add mefast home screen$")
    public void messengetTextField(String value, String textField) throws InterruptedException {
        SharedSD.getDriver().manage().deleteAllCookies();
        SharedSD.getDriver().navigate().to("http://addmefast.com");
        Thread.sleep(30000);

        switch (textField) {
            case "email":
                messengerPage.addmefastEmail(value);
                break;
            case "password":
                messengerPage.addmefastPassowd(value);
                break;
        }

    }

    @And("^I click on addmefast LoginButon$")
    public void clickOnLoginButton() throws InterruptedException {
        messengerPage.addmefastClikonButton();
    }
  @When("^I navagite into (facebook|instragram|youtube|pinterest|soundcloud) browser$")
  public void navagatioN(String textField){
        switch (textField){
            case "facebook":
                messengerPage.navigateToFacebook();
                break;
            case "pinterest":
                messengerPage.navigateToPinterest();
                break;
            case "youtube":
                messengerPage.navigateToYoutube();
                break;
            case "instragram":
                messengerPage.navigateToInstragram();
                break;
            case "soundcloud":
                messengerPage.navigateToSoundCloud();
                break;
        }

  }
@Then("^I logn youtube and jumpt to the YT channel (001|002|003|004|005|006|007|008|009|010|011|012)$")
    public void youtubelogin( String channel)throws InterruptedException {
        youtube.youtubeLogin();
        youtube.gotoChannale();
        switch (channel){
            case "011":
                youtube.channel11();
                break;
            case"002":
                youtube.channel4();
        }


}




}

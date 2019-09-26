package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyNet;
import org.testng.Assert;

public class DarkskySD {

    DarkSkyNet homePage = new DarkSkyNet();


    @Given("^I am on Darksky HomePage$")
    public void imOnWeb() {
        //For not to change url from config.file.
        SharedSD.getDriver().navigate().to("http://darksky.net");

    }


    @When("^I am on the darksky Register page$")
    public void registerPage () {
        homePage.goToDarkSkyAPI();
        homePage.goToSignUp();
    }
    @Then("^I click on Register button$")
    public void registerButtonPage ()throws InterruptedException {
        homePage.clickOnRegisterButton();
    }
    @Then("^I verify im still on register page$")
    public void registerPageverifiy () {
        homePage.verifyErrorRegisterPage();
    }

    @Given("^I am on the DarkSky Home Page$")
    public void gotoDarkskynet () {
        homePage.navigateToDarkSkynet();
    }
    @Then ("^I verify current temp is not greater or less then temps from daily timeline$")
    public void veriFyTemprature () {
        homePage.currentTempratureVerfy();
    }


    @When ("^I expand todays timeline$")
    public void expendTodayTimeline () throws InterruptedException {
        homePage.moveToTodayExpendElement();

    }
    @Then ("^I verify lowest and highest temp is displayed correctly$")
    public void displayedTempreture () {
        homePage.displayTempVerify();

    }
    @Then ("^I verify timeline is displayed with two hours incremented$")
    public void incrementHours() {
        homePage.alltheHoursfromTimeline();
        homePage.incremetnTimefromSystem();
        homePage.assertIncrementHours();
    }
}

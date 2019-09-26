package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.AddmeFast;
import org.testng.Assert;

public class AddmefastSD {

    AddmeFast homePage = new AddmeFast();


    @Given("^I am on Addmefast 5HomePage5$")
    public void imOnWeb() {
    }

    @When("^I enter addmefast 5email into email field$")
    public void emailAddress(String value) {
        //homePage.addmefastEmail("rtrack2019@gmail.com");
    }


    @Then("^i enter addmefast 5passwrd into password field$")
    public void passwrod (String value) {
        //homePage.addmefastPassowd("sohel224078");
    }

    @When("^i click on loging 5button$")
    public void addmefastLoginbutton () throws InterruptedException {
       // homePage.addmefastClikonButton();
        Thread.sleep(10000);
    }
}

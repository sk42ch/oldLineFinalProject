package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsCom;
import org.testng.Assert;

public class HotelsSD {

    private HotelsCom homepage = new HotelsCom();

    @Then ("^I verify first 50 hotels within the radius.$")
    public void verify50Hotels ()throws InterruptedException {
        homepage.scroolUpto50Hotels();
        homepage.hotelsMileCheeking();
    }


    @Given("^I am on Hotels home page$")
    public void iAmOnSearchResultScreen()throws InterruptedException {
        homepage.goTo();
        String homepage =SharedSD.getDriver().getTitle();
        System.out.println(homepage);
    }

    @Then("^I am navigating to search screen$")
    public void searchLocaton () throws InterruptedException {
        homepage.clickOnsearch();
    }

//   @When("^I am on hotel search page and I click on 3 start field to see all the 3 star hotels$")
//    public void iAmOnHotelPageAndIClickOn3StarButton() throws InterruptedException {
//       hotelLoginPage.clickOnStarThree();
//      hotelLoginPage.scroll();
//       hotelLoginPage.allThree();
//       hotelLoginPage.aassertionForThree();
//       hotelLoginPage.assertionThree();
//       Thread.sleep(2000);
//
//   }
//
    @When("^I select property class (5 stars|4 stars|3 stars)$")
    public void selectPropertyClass(String stars) throws InterruptedException {
        switch (stars){
            case "5 stars":
                homepage.clickStar5();
                break;
            case "4 stars":
               homepage.clickStar4();
                break;
            case "3 stars":
                homepage.clickStar3();
                break;

        }
    }
//
//
//
//
    @Then("^I verify system displays only (5 stars|4 stars|3 stars) hotels on search result$")
    public void verifyDisplayStars(String stars) throws InterruptedException {
        switch (stars){
            case "5 stars":
                homepage.scroolUpto50Hotels();
                homepage.stars5();
                break;
            case "4 stars":
               homepage.scroolUpto50Hotels();
               homepage.stars4();
                break;
            case "3 stars":
               homepage.scroolUpto50Hotels();
               homepage.stars3();
               break;

        }
    }
}

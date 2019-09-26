@web @regression @darksky
Feature:

  Background:
    Given I am on Darksky HomePage

  @darksky-1
  Scenario: Verify invalid signup error message
  Given I am on the darksky Register page
  When I click on Register button
  Then I verify im still on register page

  @darksky-2
  Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Given I am on the DarkSky Home Page
    Then I verify current temp is not greater or less then temps from daily timeline



  @darksky-3
  Scenario: Verify individual day temp timeline
    Given I am on the DarkSky Home Page
    When I expand todays timeline
    Then I verify lowest and highest temp is displayed correctly

  @darksky-4
  Scenario: Verify timline is displayed in correct format
    Given I am on the DarkSky Home Page
    Then I verify timeline is displayed with two hours incremented
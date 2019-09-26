@web @regression @hotels
Feature:

  Background:
    Given I am on Hotels home page




@hotels-1
Scenario: Verify First 50 hotels is under 10miles from City Center
  Given I am navigating to search screen
  Then I verify first 50 hotels within the radius.


@hotels-3
Scenario Outline: Verify user can only view the result by selected property class
  Given I am navigating to search screen
  When I select property class <stars>
  Then I verify system displays only <stars> hotels on search result

Examples:
| stars   |
| 5 stars |
| 4 stars |
| 3 stars |
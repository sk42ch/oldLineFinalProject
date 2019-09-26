@add @web @regression @messenger
Feature: Messenger Feature

  Background:
    Given I am on AF home page

  @add-1
  Scenario: Verify invalid login from messenger page
    When I enter rtrack2019@gmail.com into email text field on add mefast home screen
    Then I enter sohel224078 into password text field on add mefast home screen
    And I click on addmefast LoginButon


    @add-2
    Scenario: login to Youtube
      When I navagite into youtube browser
      Then I logn youtube and jumpt to the YT channel 011
3
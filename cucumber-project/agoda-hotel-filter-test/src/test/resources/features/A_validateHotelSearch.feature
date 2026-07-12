@hotelSearch
Feature: Search hotels on Agoda

  Scenario: Search for hotels in Chennai and verify results are displayed
    Given user is on agoda home page
    When user enters destination "Chennai" and selects it from suggestions
    And user clicks the search button
    Then hotel results are displayed

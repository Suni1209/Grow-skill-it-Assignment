@priceFilter
Feature: Validate hotel price filter functionality

  Scenario: Search hotels in Chennai and validate price filter
    Given user is on agoda home page
    When user enters destination "Chennai" and selects it from suggestions
    And user clicks the search button
    Then hotel results are displayed
    When user applies price filter with min "10000" and max "50000"
    Then all displayed hotel prices are within "10000" and "50000"

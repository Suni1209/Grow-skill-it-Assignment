@saveWishlist
Feature: Save best hotel to wishlist

  Scenario: Search, apply filter and save cheapest hotel to wishlist
    Given user is on agoda home page
    When user enters destination "Chennai" and selects it from suggestions
    And user clicks the search button
    Then hotel results are displayed
    When user applies price filter with min "10000" and max "50000"
    Then all displayed hotel prices are within "10000" and "50000"
    When user saves the best priced hotel to wishlist
    Then the wishlist confirmation is shown

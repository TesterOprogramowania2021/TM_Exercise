Feature: Search functionality with parameters and item selection


  @Test
  Scenario: User searches for the iphone and selects the first one from the list
    Given The user enters the given URL  https://allegro.pl
    When  The user enters the iphon item in the search field and clicks the search button nad accept privacy
    And The user selects the search criteria
    And The user selects the first product from the list
    Then The user verifies whether the name in the offer matches the name of the first item on the list


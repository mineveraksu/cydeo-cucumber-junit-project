Feature: Etsy search functionality
  agile story: user should be able to type any keyword and see relevant information

  Scenario: Etsy Title Verification
    Given User is on the Etsy home page
    Then user sees the tiltle is as expected

    #ecpedted title:Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user is on the Etsy homepage
    When user types wooden spoon in the search box
    And user clicks on the Etsy search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on the Etsy homepage
    When user types "wooden spoon" in the search box
    And user clicks on the Etsy search button
    Then User sees "Wooden spoon" is in the title

Feature: Bing Search functionality

  Agile story: As a user,when i am on the Google search page
  i should be able to search anything and see relevant result
  @wip
  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters orange in the Bing search box
    Then user should see oragne in the title
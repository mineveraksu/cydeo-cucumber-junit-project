Feature: Google Search functionality

  Agile story: As a user,when i am on the Google search page
  i should be able to search anything and see relevant result

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google

    # windows:control+option+L


  Scenario: Search result title verification
    Given user is on the Google search page
    When user searches for apple
    Then user should see apple in the tilte
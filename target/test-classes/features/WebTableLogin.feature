Feature: web table app login functionality
  agile story:user shuold be able to login with correct credentials
  @a
  Scenario:Positive Login scenario
    Given user is on the Web Table app login page
    When user enters correct username
    And user enters correct password
    And user clicks to login button
    Then user should see orders word in the URL
  @b
  Scenario:Positive Login scenario
    Given user is on the Web Table app login page
    When user enters "Test" username "Tester" password
    And user clicks to login button
    Then user should see orders word in the URL
  @c
  Scenario:Positive Login scenario
    Given user is on the Web Table app login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And user clicks to login button
    Then user should see orders word in the URL


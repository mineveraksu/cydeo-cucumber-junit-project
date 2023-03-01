Feature:verifying buttons feature of the application

  Scenario: check
    Given navigate to "buttons" page
    When  Click "Double click" button
    Then  Verify text :"You have done a double click" should be visible
    And   Click "Right click" button
    Then  Verify text :"You have done a right click" should be visible
    And   Click "Click me" button
    Then  Verify text :"You have done a dynamic click" should be visible
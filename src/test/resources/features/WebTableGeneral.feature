Feature:Some of the general functionality verifications

  Scenario: : Dropdown options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: payment options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees Visa as enabled payment option
    Then user sees Mastercard as enabled payment option
    Then user sees American Express as enabled payment option
   @b
    Scenario: order placement scenario
      Given user is already logged in to The Web table app
      When user is on the “Order” page
      And user enters quantity "2"
      Then user clicks to the calculate button
      And user enters customer name "Jane Doe"
      And user enters street "7th Street"
      And user enters city "New York"
      And user enters state "New York"
      And user enters zip "99999"
      And user selects payment option "Visa"
      And user enters credit card number "1111222233334444"
      And user enters expiration date "12/25"
      And user clicks to process order button
      Then user should see "Jane Doe" in the first row of the web table



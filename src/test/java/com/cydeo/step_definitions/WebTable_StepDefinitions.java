package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {
    WT_LoginPage wt_loginPage = new WT_LoginPage();

    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");

    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        wt_loginPage.inputUsername.sendKeys("Test");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        wt_loginPage.inputPassword.sendKeys("Tester");
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        wt_loginPage.loginButton.click();

    }

    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        //  BrowserUtils.verifyTitleContains("orders");
        String expectedInUrl = "orders";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedInUrl));
    }


    @When("user enters {string} username {string} password")
    public void userEntersUsernamePassword(String userName, String passWord) {

        wt_loginPage.inputUsername.sendKeys(userName);
        wt_loginPage.inputPassword.sendKeys(passWord);

    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {
        wt_loginPage.inputUsername.sendKeys(credentials.get("username"));
        wt_loginPage.inputPassword.sendKeys(credentials.get("password"));
    }

    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        wt_loginPage.login();

    }

    WT_OrderPage orderPage = new WT_OrderPage();

    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {

        orderPage.ordersLink.click();
        BrowserUtils.sleep(2);
    }

    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(orderPage.productDropdown);
        Assert.assertEquals(actualOptions, expectedOptions);
    }

    @Then("user sees Visa as enabled payment option")
    public void user_sees_visa_as_enabled_payment_option() {
        Assert.assertTrue(orderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees Mastercard as enabled payment option")
    public void user_sees_mastercard_as_enabled_payment_option() {
        Assert.assertTrue(orderPage.masterCardButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void user_sees_american_express_as_enabled_payment_option() {
        Assert.assertTrue(orderPage.americanExpressRadioButton.isEnabled());
    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String quentitiy) {
        orderPage.inputQuantity.clear();
        orderPage.inputQuantity.sendKeys(quentitiy);
    }


    @Then("user clicks to the calculate button")
    public void user_clicks_to_the_calculate_button() {
        orderPage.calculateButton.click();
    }

    @Then("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
    }

    @Then("user enters street {string}")
    public void user_enters_street(String string) {

    }

    @Then("user enters city {string}")
    public void user_enters_city(String string) {

    }

    @Then("user enters state {string}")
    public void user_enters_state(String string) {

    }

    @Then("user enters zip {string}")
    public void user_enters_zip(String string) {

    }

    @Then("user selects payment option {string}")
    public void user_selects_payment_option(String string) {

    }

    @Then("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }

    @Then("user enters expiration date {string}")
    public void user_enters_expiration_date(String string) {
    }

    @Then("user clicks to process order button")
    public void user_clicks_to_process_order_button() {
    }

    @Then("user should see {string} in the first row of the web table")
    public void user_should_see_in_the_first_row_of_the_web_table(String string) {


    }
}
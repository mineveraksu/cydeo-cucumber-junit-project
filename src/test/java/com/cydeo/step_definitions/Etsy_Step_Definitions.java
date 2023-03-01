package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyHomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_Step_Definitions {

    EtsyHomePage etsyHomePage=new EtsyHomePage();

    @Given("User is on the Etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user sees the tiltle is as expected")
    public void user_sees_the_tiltle_is_as_expected() {
        String expectedTitle="Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

                BrowserUtils.verifyTitle(expectedTitle);

    }

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {

    }
    @When("user types wooden spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

    }
    @When("user clicks on the Etsy search button")
    public void user_clicks_on_the_etsy_search_button() {

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String Keyword) {
        etsyHomePage.searchBox.sendKeys(Keyword);


    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }
}

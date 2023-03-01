package com.cydeo.step_definitions;

import com.cydeo.pages.demoQa.ButtonPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DemoQASteps {

    String baseurl= ConfigurationReader.getProperty("baseUrl");

    @Given("navigate to {string} page")
    public void navigate_to_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    ButtonPage buttonPage=new ButtonPage();
    @When("Click {string} button")
    public void click_button(String buttonName) {
        Actions actions=new Actions((Driver.getDriver());
        

        switch (buttonName){
            case "Double click":
                actions.doubleClick((buttonPage.dblclkBtn)).perform();
                break;
            case "Right click":
                actions.contextClick(buttonPage.rightClickBtn).perform();
                break;
            case "Click me":
                buttonPage.clickMeBtn.click();
                break;
            default:
                System.out.println("There are no steps with this input");

        }


    }
    @Then("Verify text :{string} should be visible")
    public void verify_text_should_be_visible(String expectedInText) {
        if (expectedInText.contains("double")) {
            System.out.println("buttonPage.dblclkMsg.getText() = " + buttonPage.dblclkMsg.getText());
            Assert.assertEquals(expectedInText,buttonPage.dblclkMsg.getText());
        }else if (expectedInText.contains("right")){
        System.out.println("buttonPage.rightclkMsg.getText() = " + buttonPage.rightclkMsg.getText());
            Assert.assertEquals(expectedInText,buttonPage.rightclkMsg.getText());
        }else if(expectedInText.contains("dynamic")){
            //  System.out.println("buttonPage.dynmcClkMsg.getText() = " + buttonPage.dynmcClkMsg.getText());
            Assert.assertEquals(expectedInText,buttonPage.dynmcClkMsg.getText());
        }else{
            System.out.println("Provide wrong text");
        }
            
        }

    }
        
    }




}

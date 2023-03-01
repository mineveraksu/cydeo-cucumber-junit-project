package com.cydeo.pages.demoQa;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DemoQA_BasePage {

    public DemoQA_BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}

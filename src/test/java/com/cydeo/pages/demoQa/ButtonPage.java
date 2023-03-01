package com.cydeo.pages.demoQa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends DemoQA_BasePage{
    //locaters of button page

    @FindBy(id = "doubleClickBtn")
    public WebElement dblclkBtn;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(xpath = "//button[.='Click Me']")
    public WebElement clickMeBtn;

    @FindBy(id="doubleClickMessage")
    public WebElement dblclkMsg;

    @FindBy(id="dynamicClickMessage")
    public WebElement rightclkMsg;

    @FindBy(id="")
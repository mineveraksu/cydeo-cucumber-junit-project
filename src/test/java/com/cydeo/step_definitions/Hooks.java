package com.cydeo.step_definitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    /* in this class we will be able to create "pre" and "post" condition
     for All the SCENARIOS and even STEPS
     */
    @Before
    public void setUpMethod(){
        System.out.println("--->@Before:RUNNING BEFORE EACH SCENARIO");
    }
    @After
    public void tearDownMethod(){
        System.out.println("--->@After:RUNNING AFTER EACH SCENARIO");
    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("--->@BeforeSTEP:Running before each step");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("--->@AfterSTEP:Running after each step");
    }
}

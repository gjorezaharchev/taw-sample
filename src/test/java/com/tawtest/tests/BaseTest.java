package com.tawtest.tests;


import com.taw.common.elements.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Actions {

    // vm options -Dbrowser=chrome -Denvironment=TEST


    @BeforeMethod(groups = {"smoketests", "logintests"})
    public void set_up(){

        browser.open();
        browser.maximize();
        navigate.to($("URL"));
    }

    @BeforeMethod(groups = {"sometest", "someother"})
    public void set_up1(){
        System.out.println("Beforesuite for specific groups");
    }

    @AfterMethod
    public void tear_down(){
        browser.close();
    }

    public String return_something(){
        return "something";
    }
}

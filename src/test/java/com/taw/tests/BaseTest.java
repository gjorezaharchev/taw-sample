package com.taw.tests;

import com.taw.common.elements.Actions;
import com.taw.objects.web.HomePage;
import com.taw.objects.web.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Actions {

    // vm options -Dbrowser=chrome -Denvironment=TEST


    @BeforeMethod
    public void set_up(){
        browser.open();
        browser.maximize();
        navigate.to($("URL"));
    }

    @AfterMethod
    public void tear_down(){
        browser.close();
    }

    public String return_something(){
        return "something";
    }
}

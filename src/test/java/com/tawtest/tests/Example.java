package com.tawtest.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {


    @BeforeMethod(onlyForGroups = "smoke", alwaysRun = true)
    public void beforeSmoke(){
        System.out.println("Smoke before");
    }

    @BeforeMethod(onlyForGroups = "regression", alwaysRun = true)
    public void beforeregression(){
        System.out.println("regression before");
    }

    @Test(groups = "smoke")
    public void test1(){
        System.out.println("Smoke");
    }
}

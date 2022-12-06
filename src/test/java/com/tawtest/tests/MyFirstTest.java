package com.tawtest.tests;


import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

    @Test(groups = {"regressiontests"})
    public void test1(){
        /*wait.presenceOfElement(homePage.search);
        input.type(homePage.search, "tshirt");
        wait.sleep(5000);*/
        System.out.println(return_something());

    }
}

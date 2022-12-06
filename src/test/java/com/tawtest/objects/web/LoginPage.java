package com.tawtest.objects.web;

import org.openqa.selenium.By;

public class LoginPage {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginBtn = By.name("loginBtn");
    public static By errorMesage = By.xpath("//*[@attributeName='value']");

}

package com.taw.objects.web;

import org.openqa.selenium.By;

public class LoginPage {
    public By username = By.id("username");
    public By password = By.id("password");
    public By loginBtn = By.name("loginBtn");
    public By errorMesage = By.xpath("//*[@attributeName='value']");
}

package com.tawtest.objects.web;

import com.taw.common.Global;
import org.openqa.selenium.By;

public class MobileApp extends Global {

    public static By username = By.id(appPackage + ":id/login_user_name");
    public static By password = By.id(appPackage + ":id/login_password");
    public static By loginBtn = By.id(appPackage + ":id/button_login");

    public static By search = By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]");
    public static By searchText = By.id(appPackage + ":id/search_edit_text");
    public static By searchQuery = By.id(appPackage + ":id/search_query");
    public static By video1 = By.xpath("//android.view.ViewGroup[@content-desc=\"Effective Test Automation using a Pattern Object Model by Gjore Zaharchev - 34 minutes - Go to channel - DATA MINER - 19 views - 3 months ago - play video\"]/android.widget.ImageView[1]");
    public static By videoTitle = By.id(appPackage + ":id/title");
}

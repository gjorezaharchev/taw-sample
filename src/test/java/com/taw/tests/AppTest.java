package com.taw.tests;

import com.taw.common.elements.Elements;
import com.taw.objects.web.MobileApp;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppTest extends Elements {


    //-ea -Dbrowser=android -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk -DappPackage=com.app -DappActivity=com.app.LoginActivity
    //-ea -Dbrowser=ios -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/raw/master/sample/sample.ipa -DiosPlatformVersion=11.0 -DxcodeOrgId=test -DxcodeSigningId=test -Dudid=udid -DupdatedWDABundleId=test
    protected MobileApp mobileApp = new MobileApp();

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
        browser.open();
    }

    @AfterSuite
    public void uninstallApp() throws InterruptedException {
        //androidDriver.removeApp($("android.package"));
        androidDriver.quit();
    }

    @BeforeMethod
    public void start_app() {
        androidDriver.resetApp();
    }

    @Test(enabled = true)
    public void myFirstTest() throws InterruptedException {
        input.type(mobileApp.username, "abc");
        input.type(mobileApp.password, "efg");
        button.click(mobileApp.loginBtn);
    }
}
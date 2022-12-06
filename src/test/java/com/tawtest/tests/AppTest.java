package com.tawtest.tests;

import com.google.common.collect.ImmutableMap;
import com.taw.common.elements.Elements;
import com.tawtest.objects.web.MobileApp;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest extends Elements {


    //-ea -Dbrowser=android -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/blob/main/sample/sample.apk -DappPackage=com.app -DappActivity=com.app.LoginActivity
    //-ea -Dbrowser=android -Denvironment=TEST -Ddevice=emulator-5554 -DappPackage=com.google.android.youtube -DappActivity=com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity

    //-ea -Dbrowser=ios -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/raw/master/sample/sample.ipa -DiosPlatformVersion=11.0 -DxcodeOrgId=test -DxcodeSigningId=test -Dudid=udid -DupdatedWDABundleId=test
    //-ea -Dbrowser=android -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk -DappPackage=com.app -DappActivity=com.app.LoginActivity
    //-ea -Dbrowser=ios -Denvironment=TEST -Ddevice=2a1d0de31b047ece -Dapp=https://github.com/afollestad/material-dialogs/raw/master/sample/sample.ipa -DiosPlatformVersion=11.0 -DxcodeOrgId=test -DxcodeSigningId=test -Dudid=udid -DupdatedWDABundleId=test
    /* check app package and activity
    adb shell
    dumpsys window | grep -E 'mCurrentFocus'

     */

    By a = By.id("sff");

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
        browser.open();
        //navigate.to("google.com");

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
        SoftAssertions sa = new SoftAssertions();
        String searchTerm = "Gjore Zaharchev";
        button.click(MobileApp.search);
        input.type(MobileApp.searchText, searchTerm );
        androidDriver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        assertThat(extract.elementValue(MobileApp.searchQuery)).isEqualTo(searchTerm);
        link.click(MobileApp.video1);
        sa.assertThat(extract.elementValue(MobileApp.videoTitle)).isEqualTo("Effective Test Automation using a Pattern Object Model by Gjore Zaharchev");
        wait.sleep(15000);
        sa.assertAll();
    }
}
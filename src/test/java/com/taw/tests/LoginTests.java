package com.taw.tests;

import com.taw.objects.web.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTests extends BaseTest {

    @Test
    public void login_test_1(){
        input.type(LoginPage.username, $("USERNAME"));
        input.type(LoginPage.username, $("PASSWORD"));
        button.click(LoginPage.loginBtn);
        assertThat(extract.elementValue(LoginPage.errorMesage)).isEqualTo("Login Successfull!");
    }

    @DataProvider(name = "users")
    public Object[][] users(){
        return dataSources.excel("src/test/resources/Data/Data.xlsx", "users");
    }

    @Test(dataProvider = "users")
    public void login_test_2(String username, String password, String message){
        input.type(LoginPage.username, username);
        input.type(LoginPage.username, password);
        button.click(LoginPage.loginBtn);
        assertThat(extract.elementValue(LoginPage.errorMesage)).isEqualTo(message);
    }

    @DataProvider(name = "users1")
    public Object[][] users1(){
        return dataSources.excel("src/test/resources/Data/Data.xlsx", "users",3, 8 );
    }

    @Test(dataProvider = "users1")
    public void login_test_3(String username, String password, String message){
        input.type(LoginPage.username, username);
        input.type(LoginPage.username, password);
        button.click(LoginPage.loginBtn);
        assertThat(extract.elementValue(LoginPage.errorMesage)).isEqualTo(message);
    }
}

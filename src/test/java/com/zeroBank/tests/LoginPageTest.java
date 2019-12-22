package com.zeroBank.tests;

import com.zeroBank.pages.LoginPage;
import com.zeroBank.pages.PageBase;
import com.zeroBank.utilities.Driver;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class LoginPageTest extends PageBase {

    LoginPage loginPage = new LoginPage();
    @Test
    public void loginTest(){
        loginPage.login();
        Driver.get().quit();
    }


}

package com.zeroBank.pages;

import com.zeroBank.utilities.BrowserUtils;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  PageBase {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement singinButton;

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(id = "submit")
    public WebElement submitbutton;


    public void login(){
        Driver.get().get(ConfigurationReader.get("url"));
        singinButton.click();
        BrowserUtils.waitForClickablility(this.username,5);
        BrowserUtils.waitForClickablility(this.password,5);
        this.username.sendKeys(ConfigurationReader.get("username"));
        this.username.sendKeys(ConfigurationReader.get("password"));
        submitbutton.click();
    }
}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends commonApi {
    public LoginPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='need-help-signin-link']")
    WebElement signinButton;















}

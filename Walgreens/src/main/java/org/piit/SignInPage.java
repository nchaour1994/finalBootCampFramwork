package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GetProperties;

import java.util.Properties;

public class SignInPage extends commonApi {
    public SignInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    Properties prop = GetProperties.loadProperties("..\\Walgreens\\src\\test\\resources\\config.properties");
    String email= prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String invalidPassword=prop.getProperty("invalidPassword");
    String invalidEmail=prop.getProperty("invalidEmail");


    @FindBy(css = "input[name='username']")
    WebElement userNameFieldInSignIn;
    @FindBy(css = "input[name='password']")
    WebElement passwordFieldInSignIn;
    @FindBy(css = "#submit_btn")
    public
    WebElement signInBtn;
    @FindBy(css = "#error_msg")
    WebElement errorMsg;

    public void typeOnuserNameFieldInSignIn(){
        type(userNameFieldInSignIn,email);
    }
    public void typeInvalidEmail(){
        type(userNameFieldInSignIn,invalidEmail);
    }
    public void typeOnpasswordFieldInSignIn(){
        type(passwordFieldInSignIn,password);
    }
    public void typeInvalidpassword(){
        type(passwordFieldInSignIn,invalidPassword);
    }
    public void clickOnsignInBtn(){

       click(signInBtn);
    }
    public void printErrorMsg(){
        System.out.println(errorMsg.getText());
    }
    public boolean checkIfSignInBtnIsEnabled(){
        return signInBtn.isEnabled();
    }
    public String getValueOfuserNameFieldInSignIn(){
        return userNameFieldInSignIn.getAttribute("value");
    }
    public String getValueOfpasswordFieldInSignIn(){
        return passwordFieldInSignIn.getAttribute("value");
    }


}

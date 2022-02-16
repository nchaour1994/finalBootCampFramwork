package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends commonApi {
    public SignInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "input[name='username']")
    WebElement userNameFieldInSignIn;
    @FindBy(css = "input[name='password']")
    WebElement passwordFieldInSignIn;
    @FindBy(css = "#submit_btn")
    public
    WebElement signInBtn;

    public void typeOnuserNameFieldInSignIn(){
        type(userNameFieldInSignIn,"john1899@gmail.com");
    }
    public void typeOnpasswordFieldInSignIn(){
        type(passwordFieldInSignIn,"John1899test");
    }
    public void clickOnsignInBtn(){

        click(signInBtn);
    }
}

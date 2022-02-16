package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends commonApi {

    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name=\"firstName\"]")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@name=\"lastName\"]")
    WebElement lastNameFiled;
    @FindBy(xpath = "//input[@name=\"registerData\"]")
    WebElement emailField;
    @FindBy(xpath = "//input[@name=\"registerPassword\"]")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id=\"wag-reg-myw-checkbox\"]")
    public
    WebElement checkboxLinkMyAcoount;
    @FindBy(xpath = "//input[@name=\"phoneno\"]")
    public WebElement phoneNumberField;
    @FindBy(xpath = "//input[@name=\"zipcode\"]")
    WebElement zipCodeField;
    @FindBy(xpath = "//input[@id=\"wag-mywterms-checkbox\"]")
    public
    WebElement checkBoxOver16;
    @FindBy(xpath = "//input[@id=\"wag-terms-checkbox\"]")
    public
    WebElement checkBoxAgreement;
    public void typeOnFirstNameField(){
        type(firstNameField,"john");


    }
    public void typeOnLastNameField(){
        type(lastNameFiled,"alba");
    }
    public void typeOnEmailField(){
        type(emailField,"john1994123@gmail.com");
    }
    public void typeOnPasswordField(){
        type(passwordField,"john1994123test");
    }
    public void clickONCheckboxLinkMyAccount(){
        click(checkboxLinkMyAcoount);
    }
    public void typeOnzipCodeField(){
        type(zipCodeField,"11105");
    }
    public void flagCheckBoxOver16(){
        click(checkBoxOver16);
    }
    public void flagCheckBoxAgreement(){
        click(checkBoxAgreement);
    }
}

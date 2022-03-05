package org.piit;

import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreEmails extends commonApi{
    public StoreEmails(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//*[@name='username']")
    WebElement storeEmail;
    @FindBy(xpath = "//*[@name='password']")
    WebElement storePassword;
    public void enterStoreEmail() {
        type(storeEmail, "probalshela@yahoo.com");}
    public void enterStorePassword(){
        type(storePassword,"Newyork718/");}
}

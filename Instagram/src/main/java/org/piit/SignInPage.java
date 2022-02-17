package org.piit;
import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignInPage extends commonApi{
    @FindBy(xpath = "//*[@name='username']")
     WebElement email;
    @FindBy(xpath = "//*[@name='password']")
     WebElement password;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]")
    public WebElement logIn;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/main/div/div/div/div/button")
     WebElement logininfoNotNow;
    @FindBy(css = "button.aOOlW:nth-child(1)")
    WebElement turnOn;
    public void enterEmail() {
        type(email, "probalshela@yahoo.com");}
    public void enterWrongEmail() {
        type(email, "probal@yahoo.com");}
    public void enterPassword(){
        type(password,"Newyork718");}
    public void enterWrongPassword(){
        type(password,"Newyork");}
    public void logIn(){
        click(logIn);}
    public void loginnotNow(){
        click(logininfoNotNow);}
    public void turnOnNotifications(){
        click(turnOn);}
}

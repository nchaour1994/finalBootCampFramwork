package org.piit;

import base.commonApi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class homePage extends commonApi {
    @FindBy(xpath = "//*[@name='username']")
    WebElement email;
    @FindBy(xpath = "//*[@name='password']")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]")
    WebElement logIn;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/main/div/div/div/div/button")
    WebElement logininfoNotNow;
    @FindBy(css = "button.aOOlW:nth-child(1)")
    WebElement turnOn;
    @FindBy(xpath = "//*[@aria-label='Home']")
    WebElement homeButton;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")
    WebElement Search;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img")
    WebElement Profile;
    @FindBy(xpath = "//*[text()='Profile']")
    WebElement onProfile;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/main/div/ul/li[2]/a/div")
    WebElement Follower;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/main/div/ul/li[3]/a/div")
    WebElement Following;
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
    public void inHomeButton(){//test4
        click(homeButton);}
    public void onSearch(){//test5
        type(Search,"tarnima99");
        waitFor(3);
        Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);
    }
    public void inProfile(){
        click(Profile);}
    public void onProfile(){
        click(onProfile);}
    public void onFollower(){
        click(Follower);}
    public void onFollowing(){
        click(Following);}

    }


package org.piit;

import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends commonApi {

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[5]/a[1]/*[1]")
    public WebElement activity;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[4]/a[1]/*[1]")
    WebElement Polygon;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")
    public WebElement Search;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img")
    public WebElement Profile;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/button[1]/div[1]/*[1]")
    WebElement Add;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
    WebElement message;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement Insta;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/section[1]/div[3]/div[2]/div[1]/a[1]/div[1]")
    WebElement Seeall;
    @FindBy(xpath ="//button[contains(text(),'Change Profile Photo')]")
    WebElement changeProfile;
    public void changeProfilePhoto(){
        click(changeProfile);}
    public void SeaAll(){
        click(Seeall);}
    public void Instagram(){
        click(Insta);}
    public void SendMessage(){
        click(message);}
    public void onAdd(){
        click(Add);}
    public void onPolygon(){
        click(Polygon);}
    public void onActivity(){
       click(activity);}
    public void onSearch(){
        type(Search,"angelinajolie");
        waitFor(3);
        Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);}
    public void inProfile(){
        click(Profile);}


    }


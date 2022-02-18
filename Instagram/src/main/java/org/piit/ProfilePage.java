package org.piit;


import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends commonApi {
    @FindBy(xpath = "//*[text()='Profile']")
    WebElement onProfile;
    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[1]/ul[1]/li[2]/a[1]/div[1]")
    WebElement Follower;
    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement Following;
    @FindBy(xpath = "//*[text()='Saved']")
    WebElement onSaved;
    @FindBy(xpath = "//*[text()='Settings']")
    WebElement Settings;
    @FindBy(xpath = "//div[contains(text(),'Switch Accounts')]")
    WebElement Switch;
    @FindBy(xpath = "//div[contains(text(),'Log Out')]")
    WebElement Logout;

    public void onLogOut(){
        click(Logout);}
    public void onSwitch(){
        click(Switch);}
    public void onsettings(){
        click(Settings);}
    public void onProfile(){
        click(onProfile);}
    public void onFollower(){
        click(Follower);
        waitFor(4);}
    public void onFollowing(){
        click(Following);}
    public void Saved(){
        click(onSaved);}
}

package org.piit;


import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends commonApi {
    public ProfilePage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//*[text()='Profile']")
    WebElement OnProfile;
    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[1]/ul[1]/li[2]/a[1]/div[1]")
    WebElement Follower;
    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement Following;
    @FindBy(xpath = "//span[contains(text(),'Tagged')]")
    WebElement Tagged;
    public void clickTagged(){click(Tagged);}
    @FindBy(xpath = "//span[contains(text(),'Posts')]")
    WebElement Post;
    public void clickPost(){click(Post);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement AppStore;
    public void clickApp(){click(AppStore);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[1]/div[1]/a[2]/img[1]")
    WebElement GooglePlay;
    public void clickGoogle(){click(GooglePlay);}


    public void onProfile(){
        click(OnProfile);}
    public void onFollower(){
        click(Follower);
        waitFor(4);}
    public void onFollowing(){
        click(Following);}

}
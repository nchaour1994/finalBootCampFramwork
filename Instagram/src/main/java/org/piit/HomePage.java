package org.piit;

import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends commonApi {
    public HomePage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[5]/a[1]/*[1]")
    public WebElement Activity;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[4]/a[1]/*[1]")
    WebElement Polygon;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")
    public WebElement Search;
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img")
    public WebElement Profile;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/button[1]/div[1]/*[1]")
    WebElement Add;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
    WebElement Message;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement Insta;
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/section[1]/div[3]/div[2]/div[1]/a[1]/div[1]")
    WebElement Seeall;
    @FindBy(xpath ="//button[contains(text(),'Change Profile Photo')]")
    WebElement ChangeProfile;
    @FindBy(xpath = "//*[text()='Saved']")
    WebElement OnSaved;
    @FindBy(xpath = "//*[text()='Settings']")
    WebElement Settings;
    @FindBy(xpath = "//div[contains(text(),'Switch Accounts')]")
    WebElement Switch;
    @FindBy(xpath = "//div[contains(text(),'Log Out')]")
    WebElement Logout;
    @FindBy(xpath = "//header/section[1]/ul[1]/li[2]/a[1]/div[1]")
    WebElement AngelinasFollower;
    public void clickAngelinasFollower(){click(AngelinasFollower);}
    @FindBy(xpath = "//header/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement AngelinasFollowing;
    public void clickAngelinasFollowing(){click(AngelinasFollowing);}
    @FindBy(xpath = "//header/section[1]/ul[1]/li[1]/div[1]")
    WebElement AngelinasPost;
    public void clickAngelinasPost(){click(AngelinasPost);}


    public void saved(){
        click(OnSaved);}
    public void onLogOut(){
        click(Logout);}
    public void onSwitch(){
        click(Switch);}
    public void onsettings(){
        click(Settings);}
    public void changeProfilePhoto(){
        click(ChangeProfile);}
    public void seaAll(){
        click(Seeall);}
    public void instagram(){
        click(Insta);}
    public void sendMessage(){
        click(Message);}
    public void onAdd(){
        click(Add);}
    public void onPolygon(){
        click(Polygon);}
    public void onActivity(){
       click(Activity);}
    public void onSearch(){
        type(Search,"angelinajolie");
        waitFor(3);
        Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);}
    public void inProfile(){
        click(Profile);}


    }


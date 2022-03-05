package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends commonApi {
    public HomePage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img")
    public WebElement Profile;
    @FindBy(xpath = "//*[text()='Saved']")
    WebElement OnSaved;
    @FindBy(xpath = "//*[text()='Settings']")
    WebElement Settings;
    @FindBy(xpath = "//div[contains(text(),'Switch Accounts')]")
    WebElement Switch;
    @FindBy(xpath = "//div[contains(text(),'Log Out')]")
    WebElement Logout;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/section[1]/div[3]/div[2]/div[1]/a[1]/div[1]")
    WebElement Seeall;
    @FindBy(xpath ="//button[contains(text(),'Change Profile Photo')]")
    WebElement ChangeProfile;

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

    public void inProfile(){
        click(Profile);}
}


package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage extends commonApi {
    public YourAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//strong[text()='Profile']")
    public
    WebElement profileBtn;
    @FindBy(xpath = "(//a[text()='Personal Information'])[1]")
    public
    WebElement personalInformationInProfile;





    public void hoverOverOnprofileBtn(){
        hoverOver(driver,profileBtn);
    }
    public void clickOnpersonalInformationInProfile(){
        click(personalInformationInProfile);
    }
}

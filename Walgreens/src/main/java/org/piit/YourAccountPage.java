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
    @FindBy(css = "#sign_up")
    WebElement joinNowBtn;
    @FindBy(xpath = "//*[text()='View benefits ']")
    WebElement viewBenefits;
    @FindBy(xpath = "//*[text()='View activity ']")
    WebElement viewActivity;
    @FindBy(css = "#tab-two")
    WebElement purchasesInMenu;
    @FindBy(xpath = "//*[text()='Purchase History']")
    WebElement historyPurchseInSubMenuPurchase;
    @FindBy(css = "#tab-three")
    WebElement memberShip;
    @FindBy(xpath = "//*[text()='AARP Membership']")
    WebElement aarpMemberShip;
    @FindBy(xpath = "//strong[text()='Emails & Alerts']")
    WebElement emailAndAlert;








    public void hoverOverOnprofileBtn(){
        hoverOver(driver,profileBtn);
    }
    public void clickOnpersonalInformationInProfile(){
        click(personalInformationInProfile);
    }
    public void clickOnjoinNowBtn(){
        click(joinNowBtn);
    }
    public void clickOnviewBenefits(){
        click(viewBenefits);
    }
    public void clickOnviewActivity(){
        click(viewBenefits);
    }
    public void hoverOverpurchasesInMenu(){
        hoverOver(driver,purchasesInMenu);
    }
    public void clickOnhistoryPurchseInSubMenuPurchase(){
        click(historyPurchseInSubMenuPurchase);
    }
    public void hoverOverOnmemberShip(){
        hoverOver(driver,memberShip);
    }
    public void clickOnaarpMemberShip(){
        click(aarpMemberShip);
    }
    public void clickOnemailAndAlert(){
        click(emailAndAlert);
    }
    public boolean checkIfemailAndAlertIsEnabled(){
        return emailAndAlert.isEnabled();
    }
}

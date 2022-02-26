package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Covid19TestingPage extends commonApi {
    public Covid19TestingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
     @FindBy(xpath = "(//span[text()='Schedule free drive-thru test'][@class='btn btn__white'])[1]")
     WebElement freeDriveThruTest;

    @FindBy(xpath = "//a[@href=\"#at-home-testing\"]")
    public
    WebElement exploreAtHomeTesting;
    @FindBy(xpath = "//img[@src=\"/images/adaptive/sp1/1729776_Icon-envelope@2x.png\"]")
    public
    WebElement pcrAtHomeTestingIcon;
    @FindBy(xpath = "//span [@class='sr-only'][contains(text(),'healthconfirm')]/preceding-sibling::span[contains(text(),'Shop now')]")
    public
    WebElement healthConfirmTesting;
    @FindBy(xpath = "(//*[text()='Shop now'])[2]")
    WebElement shopNowBtn;
    @FindBy(xpath = "(//span[text()='Schedule free drive-thru test'])[3]")
    WebElement freeThruDriveBtn;



    public void clickOnexploreAtHomeTesting(){
        click(exploreAtHomeTesting);
    }
    public void selectpcrAtHomeTestingIcon(){
        click(pcrAtHomeTestingIcon);
    }
    public void clickOnhealthConfirmTesting(){
        click(healthConfirmTesting);
    }
    public void clickOnfreeDriveThruTest(){
        click(freeDriveThruTest);
    }
    public void clickOnshopNowBtn(){
        click(shopNowBtn);
    }
    public void clickOnfreeThruDriveBtn(){
        click(freeThruDriveBtn);
    }
    public void scrolltofreeThruDriveBtn(){
        scrollToView(freeThruDriveBtn);
    }
    public boolean checkIfexploreAtHomeTestingIsEnabled(){
        return exploreAtHomeTesting.isEnabled();
    }
    public boolean checkIfpcrAtHomeTestingIconIsEnabled(){
        return pcrAtHomeTestingIcon.isEnabled();
    }
    public boolean checkIfhealthConfirmTestingIsEnabled(){
        return healthConfirmTesting.isEnabled();
    }
    public boolean checkIfshopNowBtnIsEnabled(){
        return shopNowBtn.isEnabled();
    }

}

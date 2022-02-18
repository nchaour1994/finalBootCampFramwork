package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindStorePage extends commonApi {
    public FindStorePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//a[@id='updateLocation']")
    WebElement upadteLocation;
    @FindBy(xpath = "//input[@id='detailsPageTextFieldMob']")
    public
    WebElement locationField;


    public void clickOnUpdateLocation(){
        click(upadteLocation);
    }
    public void typeOnlocationField(){
        typeAndEnter(locationField,"11104");
    }
}

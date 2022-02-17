package org.piit;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class StartApplicationPage  extends commonApi {

    public StartApplicationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//label[@for='pfLandinglast4SSN']")
    WebElement ssnField;
   @FindBy(xpath = "//label[@for='pfLandingMobileNo']")
   WebElement phoneNumberFieldInApplication;
   @FindBy(xpath = "//button[@title='continue']")
   WebElement continueBtnInApplication;
   @FindBy(xpath = "//label[@for='mailingAddress']")
   WebElement adressFieldInApplication;
   @FindBy(xpath = "//input[@title='City & State']")
   WebElement cityAndstateInApplication;


    public void typeOnssnField(){
        click(ssnField);

        Actions actions=new Actions(driver);
        actions.moveToElement(ssnField).sendKeys("1254").build().perform();
    }
    public void typeOnphoneNumberFieldInApplication(){
        click(phoneNumberFieldInApplication);

        Actions actions=new Actions(driver);
        actions.moveToElement(phoneNumberFieldInApplication).sendKeys("3474589877").build().perform();
    }
    public  void clickOncontinueBtnInApplication(){
        click(continueBtnInApplication);
    }
    public void typeOnadressFieldInApplication(){
        type(adressFieldInApplication,"5027 45 street");
    }
    public  void typeOncityAndstateInApplication(){
        type(cityAndstateInApplication,"long island city -new york ");
    }


}

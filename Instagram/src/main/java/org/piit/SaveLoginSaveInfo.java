package org.piit;
import base.commonApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SaveLoginSaveInfo extends commonApi{
    public SaveLoginSaveInfo(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//button[contains(text(),'Save Info')]")
    WebElement savelogin;
    public void saveLogins(){
        click(savelogin);}
}

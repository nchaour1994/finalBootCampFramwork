package org.piit;
import base.commonApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SaveLoginNotNow extends commonApi{
    public SaveLoginNotNow(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/main/div/div/div/div/button")
    WebElement saveLoginsNotNow;
    public void saveLoginNotNow(){
        click(saveLoginsNotNow);}
}

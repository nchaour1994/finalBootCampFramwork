package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityMdPage extends commonApi {
    public CityMdPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[text()='Find a CityMD'])[1]")
     public WebElement findCityMD;

    public void clickOnfindCityMD(){
        click(findCityMD);
    }
}

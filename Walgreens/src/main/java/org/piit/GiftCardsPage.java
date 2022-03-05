package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage extends commonApi {
    public GiftCardsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[contains(text(),'Google')]")
    WebElement googleBrand;
    @FindBy(xpath = "//a[contains(text(),'Starbucks')]")
    WebElement starbucksBrand;
    @FindBy(xpath = "//a[contains(text(),\"Dunkin' Donuts\")]")
    WebElement dunkinBrand;

    public void clickOngoogleBrand(){
        click(googleBrand);
    }
    public void clickOnStarbucksBrand(){
        click(starbucksBrand);
    }
    public void clickOndunkinBrand(){
        click(dunkinBrand);
    }

}

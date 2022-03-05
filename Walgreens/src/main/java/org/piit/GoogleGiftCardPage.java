package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleGiftCardPage extends commonApi {

    public GoogleGiftCardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//button[@id='pickup-ship-btncompare_400625230']")
    WebElement addGiftCardTenDollarsBtn;
    @FindBy(xpath = "//button[@id='pickup-ship-btncompare_sku6233704']")
    WebElement starbucksAddBtn;

    @FindBy(css = "#addToCart-view-cart")
    WebElement viewCart;
    @FindBy(xpath = "//button[@id='pickup-ship-btncompare_400626341']")
    WebElement dunkinAddForPickUpBtn;

    public void clickOnaddGiftCardTenDollarsBtn(){
        click(addGiftCardTenDollarsBtn);
    }
    public void clickOnviewCart(){
        click(viewCart);
    }
    public void clickOnstarbucksAddBtn(){
        click(starbucksAddBtn);
    }
    public void clickOndunkinAddForPickUpBtn(){
        click(dunkinAddForPickUpBtn);
    }
}

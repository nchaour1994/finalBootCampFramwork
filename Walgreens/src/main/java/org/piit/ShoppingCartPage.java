package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends commonApi {
    public ShoppingCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@name='plus']")
    WebElement plusSignInFirstElement;
    @FindBy(xpath = "(//*[@name='plus'])[2]")
    WebElement plusSignInSecondElement;
    @FindBy(xpath = "//*[text()='Learn more and apply now']")
    WebElement learnMoreAndApply;
    @FindBy(css = "#wag-cart-qty-input_401460693")
    WebElement itemsNumberInFirstElement;
    @FindBy(xpath = "")
    WebElement itemsNumberInSecondElement;
    public void clickOnplusSignInFirstElement(){
        click(plusSignInFirstElement);
    }
    public void clickOnplusSignInSecondElement(){
        click(plusSignInSecondElement);
    }
    public void clickOnlearnMoreAndApply(){
        click(learnMoreAndApply);
    }
    public boolean checkIfplusSignInSecondElementIsEnabled(){
        return plusSignInSecondElement.isEnabled();
    }
    public boolean checkIfplusSignInFirstElementIsEnabled(){
        return plusSignInFirstElement.isEnabled();
    }
    public String getitemsNumberInFirstElement(){
        return itemsNumberInFirstElement.getAttribute("value");
    }
    public String getitemsNumberInSecondElement(){
        return itemsNumberInSecondElement.getAttribute("value");
    }

}

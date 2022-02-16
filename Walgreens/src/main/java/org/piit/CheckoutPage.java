package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends commonApi {
    public CheckoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(css = "input#wag-checkout-shipping-info-address")
    WebElement adressFieldInShippingProcess;
    @FindBy(css = "input#wag-checkout-shipping-info-city")
    WebElement cityFieldInShippingProcess;
    @FindBy(css = "select#wag-checkout-shipping-info-state")
    public
    WebElement dropDownStates;
    @FindBy(css = "input#wag-checkout-shipping-info-zipCode")
    WebElement zipCodeInShippingProcess;
    public void typeOnadressFieldInShippingProcess(){
        type(adressFieldInShippingProcess,"5025 42 st sunnyside");
    }
    public void typeOncityFieldInShippingProcess(){
        type(cityFieldInShippingProcess,"new york ");
    }
    public void selectFromdropDownStates(){
        selectDropdownOption( dropDownStates,"NY - New York");
    }
    public void typeOnzipCodeInShippingProcess(){
        type( zipCodeInShippingProcess,"11104");
    }

}

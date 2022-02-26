package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcuvuePage extends commonApi {
    public AcuvuePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#rPower")
    public
    WebElement rightPowerField;
    @FindBy(css = "#rBasecurve")
    public
    WebElement rBaseCuvue;
    @FindBy(css = "#lPower")
    public
    WebElement leftPowerField;
    @FindBy(css = "#lBasecurve")
    public
    WebElement lBaseCuvue;
    @FindBy(xpath = "//*[text()='Add to cart']")
    public
    WebElement addToCart;




    public void selectFromrightPowerField(){
        selectDropdownOption(rightPowerField,"-02.50");
    }
    public void selectFromrBaseCuvue(){
        selectDropdownOption(rBaseCuvue,"8.4");
    }
    public void selectFromleftPowerField(){
        selectDropdownOption(leftPowerField,"-02.50");
    }
    public void selectFromlBaseCuvue(){
        selectDropdownOption(lBaseCuvue,"8.4");
    }
    public  void clickOnaddToCart(){
        click(addToCart);
    }
    public boolean checkIfaddToCartIsEnabled(){
        return addToCart.isEnabled();
    }

}

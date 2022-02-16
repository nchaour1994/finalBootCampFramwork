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
    WebElement rightPowerField;
    @FindBy(css = "#rBasecurve")
    WebElement rBaseCuvue;
    @FindBy(css = "#lPower")
    WebElement leftPowerField;
    @FindBy(css = "#lBasecurve")
    WebElement lBaseCuvue;
    @FindBy(xpath = "//*[text()='Add to cart']")
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

}

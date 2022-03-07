package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage extends commonApi {
    public BuyPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='gf-bttl thrd'])[1]")
    WebElement Buy;
    @FindBy(xpath = "//a[@title='Motorcycle Parts']")
    WebElement MotorcycleParts;


    public void setBuy() {
        click(Buy);
    }

    public void MotorcycleParts() {
        click(MotorcycleParts);
    }

}
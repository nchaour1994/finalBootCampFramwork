package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollInAutoPayPage extends commonApi {
    public EnrollInAutoPayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='liteAuthCustomerPhoneNumber']")
    public
    WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='liteAuthCustomerDateOfBirth']")
    public
    WebElement dateOfBirthField;
    @FindBy(xpath = "//button[@id='continueBtn']")
    public
    WebElement continueBtn;


    public void phoneNumberField() {type(phoneNumberField,"7186754576");
    }

    public void dateOfBirthField() {type(dateOfBirthField,"07171998");
    }

    public void continueBtn() {click(continueBtn);
    }
}

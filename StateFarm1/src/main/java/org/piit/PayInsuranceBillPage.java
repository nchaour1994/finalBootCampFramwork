package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayInsuranceBillPage extends commonApi {
    public PayInsuranceBillPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//input[@id='pay-a-bill-phoneNo']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='pay-a-bill-DOB']")
    WebElement dateOfBirthField;
    @FindBy(xpath = "//button[@id='pay-a-bill-submitButton']")
    WebElement payNowBtn;


    public void phoneNumberField() {type(phoneNumberField,"6462209786");
    }

    public void dateOfBirthField() {type(dateOfBirthField,"08271989");
    }

    public void payNowBtn() {click(payNowBtn);
    }
}

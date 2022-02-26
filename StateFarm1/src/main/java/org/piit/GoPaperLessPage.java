package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoPaperLessPage extends commonApi {
    public GoPaperLessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='phoneNumber-input']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='dob-input']")
    WebElement dateOfBirthField;
    @FindBy(xpath = "//button[@id='auth-primary-button']")
    WebElement continueBtn;


    public void phoneNumberField() {type(phoneNumberField,"7188386543");
    }

    public void dateOfBirthField() {type(dateOfBirthField,"03021979");
    }

    public void continueBtn() {click(continueBtn);
    }
}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage extends commonApi {
    public HelpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#btn1")
    public
    WebElement forgotUserId;
    @FindBy(xpath = "//input[@id='forgotPhoneInput']")
    public
    WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='forgotDobInput']")
    public
    WebElement birthDayField;
    @FindBy(xpath = "//input[@id='forgotEmailInput']")
    public
    WebElement emailField;
    @FindBy(xpath = "//label[contains(text(),'Text')]")
    public
    WebElement textSelected;
    @FindBy(xpath = "//button[@id='submitBtn']")
    public
    WebElement submitBtn;


    public void forgotUserId() {click(forgotUserId);
    }

    public void phoneNumberField() {type(phoneNumberField,"9178851017");
    }

    public void birthDayField() {type(birthDayField,"01021978");
    }

    public void emailField() {type(emailField,"abcd@gmail.com");
    }

    public void textSelected() {click(textSelected);
    }

    public void submitBtn() {click(submitBtn);
    }
}

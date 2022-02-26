package org.piit;

import base.commonApi;
import com.sun.deploy.config.JREInfo;
import com.sun.glass.ui.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayABillPage extends commonApi {
    public static Menu payABillPage;

    public PayABillPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//input[@id='pay-a-bill-phoneNo']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//input[@id='pay-a-bill-DOB']")
    WebElement dateOfBirthField;
    @FindBy(xpath = "//button[@id='pay-a-bill-submitButton']")
    WebElement payNowBtn;


    public void phoneNumberField() {type(phoneNumberField,"2121111111");
    }

    public void dateOfBirthField() {type(dateOfBirthField,"02031991");
    }

    public void payNowBtn() {click(payNowBtn);
    }
}

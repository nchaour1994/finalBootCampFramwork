package org.piit;

import base.commonApi;
import com.sun.deploy.config.JREInfo;
import com.sun.glass.ui.MenuItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuotePage extends commonApi {


    public GetAQuotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//select[@id='getaquote-select-product']")
    public
    WebElement productDropDown;
    @FindBy(xpath = "//input[@id='getaquote-zip']")
    WebElement zipCodeField;
    @FindBy(xpath = "//button[@id='getaQuoteButton']")
    WebElement startQuoteBtn;



    public void productDropDown() {type(productDropDown,"Small Business");
    }

    public void zipCodeField() {type(zipCodeField,"11112");
    }

    public void startQuoteBtn() {click(startQuoteBtn);
    }
}

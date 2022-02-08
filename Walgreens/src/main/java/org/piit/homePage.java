package org.piit;

import base.commonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends commonApi {

    @FindBy (xpath = "//strong[contains(text(),'Menu')]")
    WebElement testBtn;

    public void testtheclick(){
        click(testBtn);
    }
}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimsPage extends commonApi {
    public ClaimsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement fileAClaim;
    @FindBy(xpath = "//label[contains(text(),'Life')]")
    WebElement lifeSelected;


    public void fileAClaim() {click(fileAClaim);
    }

    public void lifeSelected() {click(lifeSelected);
    }
}

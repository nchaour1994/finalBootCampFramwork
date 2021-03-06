package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoPrintingPage extends commonApi {
    public PhotoPrintingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@aria-label='PrintBook']")
    WebElement printBooks;

    public void clickOnprintBooks(){
        click(printBooks);
    }
}

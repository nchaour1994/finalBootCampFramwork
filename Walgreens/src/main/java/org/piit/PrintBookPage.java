package org.piit;

import base.commonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintBookPage extends commonApi {

    public PrintBookPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#selectedSizeDiv")
    WebElement size;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;

    public void clickOnsize(){
        click(size);
        size.sendKeys(Keys.ARROW_DOWN);
        size.sendKeys(Keys.ARROW_DOWN);
        size.sendKeys(Keys.ENTER);
    }

    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }



}

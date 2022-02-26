package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AarpMmeberShipPage extends commonApi {
    public AarpMmeberShipPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#wag-aarp-add-now")
    WebElement addNowBt;

    public void clickOnaddNowBt(){
        click(addNowBt);
    }

}

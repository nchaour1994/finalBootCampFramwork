package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PharmacyServicesPage extends commonApi {

    public PharmacyServicesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

   @FindBy(xpath = "(//*[text()='Transfer Rx'])[1]")
    WebElement TransferRxBtn;

    public void clickOnTransferRxBtn(){
        click(TransferRxBtn);
    }

}

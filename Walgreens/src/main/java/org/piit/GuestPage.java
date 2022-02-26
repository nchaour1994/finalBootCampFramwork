package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestPage extends commonApi {
    public GuestPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css ="#btn_tranferRx" )
    WebElement continueAsGuestBtn;

    public void clickOncontinueAsGuestBtn(){
        click(continueAsGuestBtn);
    }


}

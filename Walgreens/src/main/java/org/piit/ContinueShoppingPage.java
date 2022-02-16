package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShoppingPage extends commonApi {
    public ContinueShoppingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button#wag-cart-proceed-to-checkout")
    public
    WebElement proccedToCheckutBtn;


    public void clickOnproccedToCheckutBtn(){
        click(proccedToCheckutBtn);
    }
}

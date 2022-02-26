package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessCardsPage extends commonApi {
    public BusinessCardsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//img[@title=\"Choose your design\"]")
    WebElement chhoseAdesignBtn;



    public void clickOnchhoseAdesignBtn(){
        click(chhoseAdesignBtn);
    }
}

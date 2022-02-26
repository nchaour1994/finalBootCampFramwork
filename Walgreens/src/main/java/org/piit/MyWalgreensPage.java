package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWalgreensPage extends commonApi {
    public MyWalgreensPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Join FREE now'][@class='btn btn__red']")
    WebElement joinForFreeBtn;
    public void clickOnjoinForFreeBtn(){
        click(joinForFreeBtn);
    }

}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWalgreensCreditCardPage extends commonApi {
    public MyWalgreensCreditCardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//button[@data-element-name='see if I prequalify']")
    WebElement seeIfIqualifyBtn;
    @FindBy(xpath = "//a[@data-element-name='do not add as preferred post-approval']")
    WebElement setWithoutAddingAsPreferred;
    @FindBy(xpath = "//button[text()='Start my application']")
    WebElement startMyApplicationBtn;




    public  void clickOnseeIfIqualifyBtn(){
        click(seeIfIqualifyBtn);
    }
    public void clickOnsetWithoutAddingAsPreferred(){
        click(setWithoutAddingAsPreferred);
    }
    public void clickOnstartMyApplicationBtn(){
        click(startMyApplicationBtn);
    }


}

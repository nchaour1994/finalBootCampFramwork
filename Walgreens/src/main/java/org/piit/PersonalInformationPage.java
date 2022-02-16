package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage extends commonApi {
    public PersonalInformationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "span[class=\"btn btn__blue col-xs-12\"]")
    public
    WebElement editBtn;
    @FindBy(css = "input[name=\"wagAddress\"]")
    WebElement adressFieldInMyAccount;

    public void clickOneditBtn(){
        click(editBtn);
    }
    public void typeOnadressFieldInMyAccount(){
        type(adressFieldInMyAccount,"5024 42 street ");
    }
}

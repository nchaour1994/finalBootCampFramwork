package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAndAlertPage extends commonApi {

    public EmailAndAlertPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#check-six")
    WebElement helthcareClinicCheckbox;
    @FindBy(css = "#check-eight")
    WebElement digitalReceiptCheckbox;

    public void clickOnhelthcareClinicCheckbox(){
        click(helthcareClinicCheckbox);
    }
    public void clickOndigitalReceiptCheckbox(){
        click(digitalReceiptCheckbox);
    }
    public boolean checkIfhelthcareClinicCheckboxIsSelected(){
        return helthcareClinicCheckbox.isSelected();
    }
}

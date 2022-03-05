package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RxCoveragePage extends commonApi {
    public RxCoveragePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='Apply for Medicaid']")
    WebElement applyForMedicaid;

    public void clickOnapplyForMedicaid(){
        click(applyForMedicaid);
    }
}

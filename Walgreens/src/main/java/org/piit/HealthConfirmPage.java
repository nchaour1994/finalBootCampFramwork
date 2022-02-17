package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthConfirmPage extends commonApi {
    public HealthConfirmPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[@title=\"Get started \"][@id=\"service_details_cta\"]")
    public
    WebElement getStartedBtnInCovidTestingOptions;
    @FindBy(xpath = "//a[@id=\"navigationButton\"]")
    public
    WebElement gotItBtnInCovidTestingOptions;
    @FindBy(xpath = "(//a[text()=\"ORDER NOW\"])[2]")
    public
    WebElement orderNowBtnInNewTab;


    public void clickONgetStartedBtnInCovidTestingOptions(){
        click(getStartedBtnInCovidTestingOptions);
    }
    public void clickONgotItBtnInCovidTestingOptions(){
        click(gotItBtnInCovidTestingOptions);
    }
    public void clickOnorderNowBtnInNewTab(){
        click(orderNowBtnInNewTab);
    }
}

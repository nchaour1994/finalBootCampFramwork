package org.piit;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthInssurancePage extends commonApi {

    public HealthInssurancePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//*[text()='Shop All Marketplace Plans']")
    WebElement shopAll;
    @FindBy(xpath = "//*[@title='Learn more']")
    WebElement learnMore;
    @FindBy(css = "#commercial_gotit")
    public
    WebElement gotItBtn;
    @FindBy(xpath = "(//*[text()='Health Insurance Marketplace'])[2]")
    WebElement healthIssuranceMarketPlace;

    public void clickOnShopAll(){
       click(shopAll);
    }
    public void clickOngotItBtn(){
        click(gotItBtn);
    }
    public void clickOnlearnMore(){
        scrollToView(learnMore);
        click(learnMore);
    }
    public void clickOnhealthIssuranceMarketPlace(){
        click(healthIssuranceMarketPlace);
    }
    public boolean checkIfshopAllIsEnabled(){
        return shopAll.isEnabled();
    }
    public boolean checkIfgotItBtnIsEnabled(){
        return gotItBtn.isEnabled();
    }
}

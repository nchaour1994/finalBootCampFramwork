package org.piit;

import base.commonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BannersPage extends commonApi {

    public BannersPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#selectedSortByDiv")
    WebElement sortByField;

    @FindBy(xpath = "//*[text()=' Birthday Celebration ']")
    WebElement birthdayBanner;
    @FindBy(xpath = "//span[text()='Adhesive']")
    WebElement material;
    @FindBy(xpath = "//*[text()=' 2x8 ']")
    WebElement size;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;



    public void selectFromsortByField(){
       sortByField.sendKeys(Keys.ARROW_DOWN);
        sortByField.sendKeys(Keys.ARROW_DOWN);
        sortByField.sendKeys(Keys.ENTER);

    }
    public void clickOnbirthdayBanner(){
        click(birthdayBanner);
    }
    public void clickOnmaterial(){
        click(material);
    }
    public void clickOnsize(){
        click(size);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public boolean checkIfbirthdayBannerIsEnabled(){
        return birthdayBanner.isEnabled();
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }
}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessCardDesignPage extends commonApi {

    public BusinessCardDesignPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    String businessCardModel=prop.getProperty("businessCardModel");


    @FindBy(css= "#search")
    WebElement SearchField;
    @FindBy(xpath = "//a[text()=' Forest ']")
    public
    WebElement forestDesign;

    @FindBy(css = "#buttonId")
    WebElement createNowBtn;

    public void typeOnSearchField(){
        typeAndEnter(SearchField,businessCardModel);
    }
    public  void clickOnforestDesign(){
        click(forestDesign);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public String getValueOfSearchField(){
        return SearchField.getAttribute("value");
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }


}

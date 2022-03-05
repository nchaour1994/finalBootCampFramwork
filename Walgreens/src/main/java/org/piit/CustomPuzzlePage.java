package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomPuzzlePage extends commonApi {

    public CustomPuzzlePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#selectedSizeDiv")
    WebElement size;
    @FindBy(xpath = "(//span[@class='ng-binding size-col'])[2]")
    WebElement sizeChoice;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;

    public void clickOnsize(){
        click(size);
        click(sizeChoice);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return  createNowBtn.isEnabled();
    }

}

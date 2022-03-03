package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouFullPhotoPage extends commonApi {
    public ThankYouFullPhotoPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#selectedQVDesignTile-4")
    WebElement fullPhoto;
    @FindBy(xpath = "//ul[@id='paperTypeDropDown'] /li[text()=' Standard Cardstock, 85lb ']")
    WebElement paper;
    @FindBy(css = "#quantityDropDown")
    WebElement quantity;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;
    @FindBy(xpath = "//div[@aria-controls='paperTypeDropDown']")
    WebElement paperList;
    @FindBy(xpath = "//div[@aria-controls='quantityDropDown']")
    WebElement quantityList;


    public void clickOnfullPhoto(){
        click(fullPhoto);
    }
    public void selectFromPaper(){
        click(paperList);
        click(paper);

    }
    public void selectFromquantity(){
        click(quantityList);
       click(quantity);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public boolean checkIfFullPhotoIsEnabled(){
        return fullPhoto.isEnabled();
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }
}

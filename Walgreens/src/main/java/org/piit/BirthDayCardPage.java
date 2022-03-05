package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthDayCardPage extends commonApi {

    public BirthDayCardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=' Nintendo Super Mario Bros.™ Birthday Invitation by Hallmark ']")
    WebElement nintendo;
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
    @FindBy(xpath = "#selectedQVDesignTileAriaCtrl-12")
    public
    WebElement sectionNintendo;

    public void clickOnnintendo(){
        click(nintendo);
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
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }
    public boolean checkIfsectionNintendoIsDisplayed(){
        return sectionNintendo.isDisplayed();
    }


}

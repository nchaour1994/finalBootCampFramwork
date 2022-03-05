package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagnetCardPage extends commonApi {

    public MagnetCardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css= "#selectedQVDesignTile-6")
    WebElement partyByTrumbulina;
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

    @FindBy(css = "#selectedQVDesignTileAriaCtrl-6")
    WebElement section;
    public void clickOnpartyByTrumbulina(){
        click(partyByTrumbulina);
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
    public boolean checkIfsectionIsDisplayed(){
        return section.isDisplayed();
    }
}

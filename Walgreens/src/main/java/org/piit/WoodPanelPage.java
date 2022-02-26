package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodPanelPage extends commonApi {
    public WoodPanelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()=' 20x30 ']")
    WebElement sizePanel;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;


    public void clickOnsizePanel(){
        click(sizePanel);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public boolean checkIfsizePanelIsEnabled(){
        return sizePanel.isEnabled();
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }
}

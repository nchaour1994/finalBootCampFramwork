package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PosterPage extends commonApi {
    public PosterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='chicklet-name design-border']/span[text()='Paper Board']")
    WebElement material;
    @FindBy(xpath = "//div[text()=' 16x20 ']")
    WebElement size;
    @FindBy(css = "#buttonId")
    WebElement createNowBtn;

    public void clickOnmaterial(){
        click(material);
    }
    public void clickOnsize(){
        click(size);
    }
    public void clickOncreateNowBtn(){
        click(createNowBtn);
    }
    public boolean checkIfmaterialIsEnabled(){
        return material.isEnabled();
    }
    public boolean checkIfsizeIsEnbaled(){
        return size.isEnabled();
    }
    public boolean checkIfcreateNowBtnIsEnabled(){
        return createNowBtn.isEnabled();
    }
}

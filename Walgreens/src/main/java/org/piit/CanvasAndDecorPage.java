package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CanvasAndDecorPage extends commonApi {

    public CanvasAndDecorPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[text()='Wood Panels'])[1]")
    WebElement woodPanel;


    public void clickOnwoodPanel(){
        click(woodPanel);
    }
    public boolean checkIfwoodPanelIsEnabled(){
        return woodPanel.isEnabled();
    }

}

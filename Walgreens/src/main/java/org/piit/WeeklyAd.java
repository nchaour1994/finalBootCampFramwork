package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeeklyAd extends commonApi {
    public WeeklyAd(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#pr-dwa-jumpmenu-ddl")
    WebElement jumpToDropDown;

    public void selectFromjumpToDropDown(){
        selectDropdownOption(jumpToDropDown,"Deals of the week");
    }

}

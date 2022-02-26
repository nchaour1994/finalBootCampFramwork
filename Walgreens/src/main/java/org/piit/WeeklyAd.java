package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GetProperties;

import java.util.Properties;

public class WeeklyAd extends commonApi {

    Properties prop = GetProperties.loadProperties("..\\Walgreens\\src\\test\\resources\\config.properties");
    String myChoiceInWeeklyAd=prop.getProperty("myChoiceInWeeklyAd");
    public WeeklyAd(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#pr-dwa-jumpmenu-ddl")
    WebElement jumpToDropDown;

    public void selectFromjumpToDropDown(){
        selectDropdownOption(jumpToDropDown,myChoiceInWeeklyAd);
    }

}

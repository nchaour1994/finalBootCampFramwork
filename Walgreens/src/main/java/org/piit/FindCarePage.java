package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GetProperties;

import java.util.Properties;

public class FindCarePage extends commonApi {
    public FindCarePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    Properties prop = GetProperties.loadProperties("..\\Walgreens\\src\\test\\resources\\config.properties");
    String symptom=prop.getProperty("symptom");

    @FindBy(xpath = "//input[@placeholder='Search by symptom, condition, service']")
    WebElement symptomField;
    @FindBy(xpath = "//a[text()='Find a location']")
    public
    WebElement findLocationBtnInCityMd;
    @FindBy(xpath = "(//a[text()='Got it'])[1]")
    WebElement gotItBtnInCityMd;



    public void typeOnsymptomField(){
        typeAndEnter(symptomField,symptom);
    }
    public void clickOnfindLocationInCityMd(){
        click(findLocationBtnInCityMd);
    }
    public void clickOngotItBtnInCityMd(){
        click(gotItBtnInCityMd);
    }
    public String getValueOfsymptomField(){
        return symptomField.getAttribute("value");
    }
    public boolean checkIffindLocationBtnInCityMdIsEnabled(){
        return findLocationBtnInCityMd.isEnabled();
    }
    public boolean checkIfgotItBtnInCityMdIsEnabled(){
        return gotItBtnInCityMd.isEnabled();
    }


}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindCarePage extends commonApi {
    public FindCarePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//input[@placeholder='Search by symptom, condition, service']")
    WebElement symptomField;
    @FindBy(xpath = "//a[text()='Find a location']")
    WebElement findLocationBtnInCityMd;
    @FindBy(xpath = "(//a[text()='Got it'])[1]")
    WebElement gotItBtnInCityMd;



    public void typeOnsymptomField(){
        typeAndEnter(symptomField,"physical therapy");
    }
    public void clickOnfindLocationInCityMd(){
        click(findLocationBtnInCityMd);
    }
    public void clickOngotItBtnInCityMd(){
        click(gotItBtnInCityMd);
    }


}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriveThruTesting extends commonApi {
    public DriveThruTesting(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#check_1")
    WebElement rapidDiagnosticCheckbox;
    @FindBy(css = "#covid-map-city-radio-2")
    WebElement locationCheckbox;
    @FindBy(xpath = "//input[@id='Rapid Diagnostic Test (ID NOW)']")
    WebElement rapidDiagnosticTest;
    @FindBy( xpath= "//tbody/tr[3]/td[5]")
    WebElement testDate;
    @FindBy(css = "#timeSlot3")
    WebElement testTime;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueBtn;




    public void clickOnrapidDiagnosticCheckbox(){
        click(rapidDiagnosticCheckbox);
    }
    public void clickOnlocationCheckbox(){
        click(locationCheckbox);
    }
    public void clickOntestDate(){
        click(testDate);
    }
    public void clickOntestTime(){
        click(testTime);
    }
    public void clickOncontinueBtn(){
        click(continueBtn);
    }
    public void clickOnrapidDiagnosticTest(){
        click(rapidDiagnosticTest);
    }
}

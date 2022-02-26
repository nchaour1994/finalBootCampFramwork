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
    public
    WebElement rapidDiagnosticCheckbox;
    @FindBy(css = "#covid-map-city-radio-2")
    public
    WebElement locationCheckbox;
    @FindBy(xpath = "//input[@id='Rapid Diagnostic Test (ID NOW)']")
    public
    WebElement rapidDiagnosticTest;
    @FindBy( xpath= "//tbody/tr[3]/td[6]")
    public
    WebElement testDate;
    @FindBy(css = "#timeSlot1")
    public
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
    public boolean checkIfrapidDiagnosticCheckboxIsSelected(){
        return rapidDiagnosticCheckbox.isSelected();
    }
    public boolean checkIflocationCheckboxIsSelected(){
        return locationCheckbox.isSelected();
    }
    public boolean checkIfrapidDiagnosticTestIsSelected(){
        return rapidDiagnosticTest.isSelected();
    }
}

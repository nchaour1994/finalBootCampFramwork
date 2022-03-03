package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourVaccinationDestinationPage extends commonApi {

    public YourVaccinationDestinationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='Schedule vaccines']")
    WebElement scheduleVccines;
    public void clickOnscheduleVccines(){
        click(scheduleVccines);
    }
}

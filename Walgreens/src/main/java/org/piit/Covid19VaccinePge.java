package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Covid19VaccinePge extends commonApi {
    public Covid19VaccinePge(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//span[text()='Schedule vaccine'])[1]")
    public
    WebElement scheduleVaccineBtn;
    @FindBy(xpath = "(//*[@class='cov-vaccine-icons-container'])[4]")
    WebElement viewRecord;

    public void clickOnscheduleVaccineBtn(){
        click(scheduleVaccineBtn);
    }
    public void clickOnviewRecord(){
        click(viewRecord);
    }
    public boolean checkIfscheduleVaccineBtnIsEnabled(){
        return scheduleVaccineBtn.isEnabled();
    }

}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleVaccinationAppointments extends commonApi {
    public ScheduleVaccinationAppointments(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id=\"covid-btn\"]")
    public
    WebElement checkboxCovid19Vaccine;
    @FindBy(xpath = "//input[@name=\"location\"]")
    WebElement zipcodeLocationForScheduleVaccine;
    @FindBy(xpath = "//input[@name=\"dob\"]")
    WebElement dateOfBirthForScheduleVaccine;
    @FindBy(xpath = "//input[@id=\"dose1\"]")
    public
    WebElement optionNoInScheduleVaccine;
    @FindBy(xpath = "//input[@id=\"radio-1\"]")
    public
    WebElement optionNoHasReceiveAuthorisationCode;
    @FindBy(xpath = "//span[@name=\"nextBtn\"]")
    public
    WebElement continueBtnOnScheduleVaccine;
    public void flagCovid19VaccineCheckBox(){
        click(checkboxCovid19Vaccine);
    }
    public void clearZipCodeLoctionForScheduleVaccine(){
        click(zipcodeLocationForScheduleVaccine);
        clear(zipcodeLocationForScheduleVaccine);
    }
    public void typeOnZipCodeLoctionForScheduleVaccine(){
        type(zipcodeLocationForScheduleVaccine,"11104");
    }
    public void typeONdateOfBirthForScheduleVaccine(){
        type(dateOfBirthForScheduleVaccine,"02021995");
    }
    public void flagoptionNoInScheduleVaccine(){
        click(optionNoInScheduleVaccine);
    }
    public void flagoptionNoHasReceiveAuthorisationCode(){
        click(optionNoHasReceiveAuthorisationCode);
    }
    public void clickOncontinueBtnOnScheduleVaccine(){
        click(continueBtnOnScheduleVaccine);
    }
}

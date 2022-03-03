package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleVaccinationAppointments extends commonApi {

    String zipCode=prop.getProperty("zipCode");
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
    @FindBy(css = "#flu-btn")
    WebElement fluCheckbox;

    @FindBy(css = "#covid-additionalbtn")
    WebElement boosterCheckbox;
    @FindBy(css= "#additionaldose2")
    WebElement shotsReceived;
    @FindBy(css = "#immuno_yes")
    WebElement patientCompemised;
    @FindBy(css = "#id-textbox-1")
    WebElement lastDoseDate;
    @FindBy(css = "#manufacturer-dropdown")
    WebElement typeOfVaccine
            ;
    public void flagFluCheckbox(){
        click(fluCheckbox);
    }
    public void flagCovid19VaccineCheckBox(){
        click(checkboxCovid19Vaccine);
    }
    public void clearZipCodeLoctionForScheduleVaccine(){
        click(zipcodeLocationForScheduleVaccine);
        clear(zipcodeLocationForScheduleVaccine);
    }
    public void typeOnZipCodeLoctionForScheduleVaccine(){
        type(zipcodeLocationForScheduleVaccine,zipCode);
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
    public void flagboosterCheckbox(){
        click(boosterCheckbox);
    }
    public void flagshotsReceived(){
        click(shotsReceived);
    }
    public void flagpatientCompemised(){
        click(patientCompemised);
    }
    public void typeOnlastDoseDate(){
        type(lastDoseDate,"02022021");
    }
    public void selectFromtypeOfVaccine(){
        selectDropdownOption(typeOfVaccine,"Pfizer-BioNtech");
    }
    public boolean checkIfoptionNoInScheduleVaccineIsSelected(){
        return optionNoInScheduleVaccine.isSelected();
    }
    public boolean checkIfoptionNoHasReceiveAuthorisationCodeIsSelected(){
        return optionNoHasReceiveAuthorisationCode.isSelected();
    }
    public boolean checkIfcontinueBtnOnScheduleVaccineIsEnabled(){
        return continueBtnOnScheduleVaccine.isEnabled();
    }
    public boolean checkIfcheckboxCovid19VaccineIsSelected(){
        return checkboxCovid19Vaccine.isSelected();
    }
    public String getValueOfzipcodeLocationForScheduleVaccine(){
        return zipcodeLocationForScheduleVaccine.getAttribute("value");
    }
    public boolean checkIfpatientCompemisedIsSelected(){
        return patientCompemised.isSelected();
    }

}

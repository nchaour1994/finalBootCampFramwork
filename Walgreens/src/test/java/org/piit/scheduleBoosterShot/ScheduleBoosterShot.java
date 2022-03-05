package org.piit.scheduleBoosterShot;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.ScheduleVaccinationAppointments;
import org.piit.YourVaccinationDestinationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScheduleBoosterShot extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String zipCode=prop.getProperty("zipCode");
    String titleVaccineAppointmentPage=prop.getProperty("titleVaccineAppointmentPage");
    String titlescheduleVaccinationAppointments=prop.getProperty("titlescheduleVaccinationAppointments");


    @Test
    public void testSceduleBooster(){
        HomePage home = new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnScheduleVacineIcon();
        Assert.assertEquals(getTitle(),titleVaccineAppointmentPage);
        scheduleVaccinationAppointments.flagboosterCheckbox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        Assert.assertEquals(scheduleVaccinationAppointments.getValueOfzipcodeLocationForScheduleVaccine(),zipCode);
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagshotsReceived();
        scheduleVaccinationAppointments.flagpatientCompemised();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfpatientCompemisedIsSelected());
        scheduleVaccinationAppointments.typeOnlastDoseDate();
        scheduleVaccinationAppointments.selectFromtypeOfVaccine();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoHasReceiveAuthorisationCodeIsSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfcontinueBtnOnScheduleVaccineIsEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
        Assert.assertEquals(getTitle(),titleVaccineAppointmentPage);
    }
    @Test
    public void testSceduleBoosterFromMenu(){
        HomePage home=new HomePage(driver);
        YourVaccinationDestinationPage yourVaccinationDestinationPage= new YourVaccinationDestinationPage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        wait.until(ExpectedConditions.visibilityOf(home.fluShotsInMenu));
        home.clickOnfluShotsInMenu();
        yourVaccinationDestinationPage.clickOnscheduleVccines();
        Assert.assertEquals(getTitle(),titlescheduleVaccinationAppointments);
        scheduleVaccinationAppointments.flagboosterCheckbox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        Assert.assertEquals(scheduleVaccinationAppointments.getValueOfzipcodeLocationForScheduleVaccine(),zipCode);
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagshotsReceived();
        scheduleVaccinationAppointments.flagpatientCompemised();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfpatientCompemisedIsSelected());
        scheduleVaccinationAppointments.typeOnlastDoseDate();
        scheduleVaccinationAppointments.selectFromtypeOfVaccine();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoHasReceiveAuthorisationCodeIsSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfcontinueBtnOnScheduleVaccineIsEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
        Assert.assertEquals(getTitle(),titleVaccineAppointmentPage);
    }
}

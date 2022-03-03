package org.piit.scheduleBoosterShot;

import base.commonApi;
import org.piit.HomePage;
import org.piit.ScheduleVaccinationAppointments;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleBoosterShot extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String zipCode=prop.getProperty("zipCode");
    String titleVaccineAppointmentPage=prop.getProperty("titleVaccineAppointmentPage");


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
}

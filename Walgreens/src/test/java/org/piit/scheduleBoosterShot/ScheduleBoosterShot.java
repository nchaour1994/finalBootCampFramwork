package org.piit.scheduleBoosterShot;

import base.commonApi;
import org.piit.HomePage;
import org.piit.ScheduleVaccinationAppointments;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleBoosterShot extends commonApi {


    @Test
    public void testSceduleBooster(){
        HomePage home = new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
        Assert.assertEquals(getTitle(),"");
        home.clickOnScheduleVacineIcon();
        Assert.assertEquals(getTitle(),"");
        scheduleVaccinationAppointments.flagboosterCheckbox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagshotsReceived();
        scheduleVaccinationAppointments.flagpatientCompemised();
        scheduleVaccinationAppointments.typeOnlastDoseDate();
        scheduleVaccinationAppointments.selectFromtypeOfVaccine();
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
    }
}

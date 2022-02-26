package org.piit.scheduleFluVaccine;

import base.commonApi;
import org.piit.HomePage;
import org.piit.ScheduleVaccinationAppointments;
import org.testng.annotations.Test;

public class ScheduleFluVaccine extends commonApi {

    @Test
    public void TestScheduleFluVaccine(){
        HomePage homePage = new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
        homePage.clickOnScheduleVacineIcon();
        scheduleVaccinationAppointments.flagFluCheckbox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
    }
}

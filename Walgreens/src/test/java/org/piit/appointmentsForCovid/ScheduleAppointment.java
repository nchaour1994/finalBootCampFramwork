package org.piit.appointmentsForCovid;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleAppointment extends commonApi {

  //  @Test
    public void scheduleAnAppointment(){
        HomePage home=new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
          Assert.assertTrue(home.scheduleVaccineIcon.isEnabled());
          home.clickOnScheduleVacineIcon();
          waitFor(2);
        scheduleVaccinationAppointments.flagCovid19VaccineCheckBox();
          Assert.assertTrue(scheduleVaccinationAppointments.checkboxCovid19Vaccine.isSelected());
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoInScheduleVaccine();
          Assert.assertTrue(scheduleVaccinationAppointments.optionNoInScheduleVaccine.isSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
          Assert.assertTrue(scheduleVaccinationAppointments.optionNoHasReceiveAuthorisationCode.isSelected());
          Assert.assertTrue(scheduleVaccinationAppointments.continueBtnOnScheduleVaccine.isEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
          waitFor(8);
       // (//section[@role='group']/ul/li/span[text()='05:00 pm'])[3]

        //missing script

    }

 //   @Test
    public void scheduleVaccineApointment(){
        HomePage home=new HomePage(driver);
        Covid19VaccinePge covid19VaccinePge=new Covid19VaccinePge(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments= new ScheduleVaccinationAppointments(driver);
        home.clickOncovid19vaccineInformationIcon();
        covid19VaccinePge.clickOnscheduleVaccineBtn();
        scheduleVaccinationAppointments.flagCovid19VaccineCheckBox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoInScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();


    }

    @Test
    public void freeDriveThruTest(){
        HomePage home=new HomePage(driver);
        DriveThruTesting driveThruTesting=new DriveThruTesting(driver);
        Covid19TestingPage covid19TestingPage=new Covid19TestingPage(driver);
        home.clickONcovid19TestingOptions();
        covid19TestingPage.clickOnfreeDriveThruTest();
        driveThruTesting.clickOnrapidDiagnosticCheckbox();
        driveThruTesting.clickOnlocationCheckbox();
        driveThruTesting.clickOnrapidDiagnosticTest();
        waitFor(2);
        driveThruTesting.clickOntestDate();
        driveThruTesting.clickOntestTime();
        driveThruTesting.clickOncontinueBtn();



    }
}

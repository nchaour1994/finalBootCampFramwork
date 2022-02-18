package org.piit.appointmentsForCovid;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleAppointment extends commonApi {

  // @Test
    public void scheduleAnAppointment(){
        HomePage home=new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
          Assert.assertTrue(home.scheduleVaccineIcon.isEnabled());
          home.clickOnScheduleVacineIcon();
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

   // @Test
    public void TestscheduleVaccineApointment(){
        HomePage home=new HomePage(driver);
        Covid19VaccinePge covid19VaccinePge=new Covid19VaccinePge(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments= new ScheduleVaccinationAppointments(driver);
        Assert.assertTrue(home.covid19vaccineInformationIcon.isEnabled());
        home.clickOncovid19vaccineInformationIcon();
        Assert.assertEquals(driver.getTitle(),"COVID-19 Vaccine Information and Records | Walgreens");
        Assert.assertTrue(covid19VaccinePge.scheduleVaccineBtn.isEnabled());
        covid19VaccinePge.clickOnscheduleVaccineBtn();
        Assert.assertEquals(driver.getTitle(),"COVID-19 and Flu Vaccination | Walgreens Immunization Services | Landing Page");
        scheduleVaccinationAppointments.flagCovid19VaccineCheckBox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoInScheduleVaccine();
        Assert.assertTrue(scheduleVaccinationAppointments.optionNoInScheduleVaccine.isSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        Assert.assertTrue(scheduleVaccinationAppointments.optionNoHasReceiveAuthorisationCode.isSelected());
        Assert.assertTrue(scheduleVaccinationAppointments.continueBtnOnScheduleVaccine.isEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();


    }

    @Test
    public void freeDriveThruTest(){
        HomePage home=new HomePage(driver);
        DriveThruTesting driveThruTesting=new DriveThruTesting(driver);
        Covid19TestingPage covid19TestingPage=new Covid19TestingPage(driver);
        home.clickONcovid19TestingOptions();
        Assert.assertEquals(driver.getTitle(),"COVID-19 Testing: FAQs & Distribution Information | Walgreens");
        covid19TestingPage.clickOnfreeDriveThruTest();
        Assert.assertEquals(driver.getTitle(),"COVID-19 Testing | Select Location | Walgreens");
        driveThruTesting.clickOnrapidDiagnosticCheckbox();
        Assert.assertTrue(driveThruTesting.rapidDiagnosticCheckbox.isSelected());
        driveThruTesting.clickOnlocationCheckbox();
        Assert.assertTrue(driveThruTesting.locationCheckbox.isSelected());
        driveThruTesting.clickOnrapidDiagnosticTest();
        Assert.assertTrue(driveThruTesting.rapidDiagnosticTest.isSelected());
        driveThruTesting.clickOntestDate();
        waitFor(2);
       // Assert.assertTrue(driveThruTesting.testDate.isSelected());
        driveThruTesting.clickOntestTime();
       // Assert.assertTrue(driveThruTesting.testTime.isSelected());
        driveThruTesting.clickOncontinueBtn();
        //-----------------to see--------



    }
}

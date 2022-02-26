package org.piit.appointmentsForCovid;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class ScheduleAppointment extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titlescheduleVaccinationAppointments=prop.getProperty("titlescheduleVaccinationAppointments");
    String titleCovid19VaccinePge=prop.getProperty("titlecovid19VaccinePge");
    String titleCovidTestingPage=prop.getProperty("titleCovidTestingPage");
    String titleDriveThruTestingPage=prop.getProperty("titleDriveThruTestingPage");
    String titlecovidRecord=prop.getProperty("titlecovidRecord");

   @Test
    public void testScheduleAnAppointment(){
        HomePage home=new HomePage(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments=new ScheduleVaccinationAppointments(driver);
        Assert.assertTrue(home.checkIfscheduleVaccineIconIsEnabled());
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnScheduleVacineIcon();
        Assert.assertEquals(getTitle(),titlescheduleVaccinationAppointments);
        scheduleVaccinationAppointments.flagCovid19VaccineCheckBox();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfcheckboxCovid19VaccineIsSelected());
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoInScheduleVaccine();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoInScheduleVaccineIsSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoHasReceiveAuthorisationCodeIsSelected());
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfcontinueBtnOnScheduleVaccineIsEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();
          waitFor(3);
       // (//section[@role='group']/ul/li/span[text()='05:00 pm'])[3]

        //missing script

    }

   @Test
    public void testScheduleVaccineApointment(){
        HomePage home=new HomePage(driver);
        Covid19VaccinePge covid19VaccinePge=new Covid19VaccinePge(driver);
        ScheduleVaccinationAppointments scheduleVaccinationAppointments= new ScheduleVaccinationAppointments(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfcovid19vaccineInformationIconIsEnabled());
        home.clickOncovid19vaccineInformationIcon();
        Assert.assertEquals(getTitle(),titlecovidRecord);
        Assert.assertTrue(covid19VaccinePge.checkIfscheduleVaccineBtnIsEnabled());
        covid19VaccinePge.clickOnscheduleVaccineBtn();
        Assert.assertEquals(getTitle(),titleCovid19VaccinePge);
        scheduleVaccinationAppointments.flagCovid19VaccineCheckBox();
        scheduleVaccinationAppointments.clearZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeOnZipCodeLoctionForScheduleVaccine();
        scheduleVaccinationAppointments.typeONdateOfBirthForScheduleVaccine();
        scheduleVaccinationAppointments.flagoptionNoInScheduleVaccine();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoInScheduleVaccineIsSelected());
        scheduleVaccinationAppointments.flagoptionNoHasReceiveAuthorisationCode();
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfoptionNoHasReceiveAuthorisationCodeIsSelected());
        Assert.assertTrue(scheduleVaccinationAppointments.checkIfcontinueBtnOnScheduleVaccineIsEnabled());
        scheduleVaccinationAppointments.clickOncontinueBtnOnScheduleVaccine();


    }

    @Test
    public void freeDriveThruTest(){
        HomePage home=new HomePage(driver);
        DriveThruTesting driveThruTesting=new DriveThruTesting(driver);
        Covid19TestingPage covid19TestingPage=new Covid19TestingPage(driver);
        home.clickONcovid19TestingOptions();
        Assert.assertEquals(getTitle(),titleCovidTestingPage);
        covid19TestingPage.clickOnfreeDriveThruTest();
        Assert.assertEquals(driver.getTitle(),titleDriveThruTestingPage);
        driveThruTesting.clickOnrapidDiagnosticCheckbox();
        Assert.assertTrue(driveThruTesting.checkIfrapidDiagnosticCheckboxIsSelected());
        driveThruTesting.clickOnlocationCheckbox();
        Assert.assertTrue(driveThruTesting.checkIflocationCheckboxIsSelected());
        driveThruTesting.clickOnrapidDiagnosticTest();
        Assert.assertTrue(driveThruTesting.checkIfrapidDiagnosticTestIsSelected());
        driveThruTesting.clickOntestDate();
        waitFor(2);
       // Assert.assertTrue(driveThruTesting.testDate.isSelected());
        //driveThruTesting.clickOntestTime();
       // Assert.assertTrue(driveThruTesting.testTime.isSelected());
       // driveThruTesting.clickOncontinueBtn();
        //-----------------to see--------



    }
    @Test
    public void testFreeDriveThruTestFromSection(){
        HomePage home=new HomePage(driver);
        DriveThruTesting driveThruTesting=new DriveThruTesting(driver);
        Covid19TestingPage covid19TestingPage=new Covid19TestingPage(driver);
        home.clickONcovid19TestingOptions();
        Assert.assertEquals(driver.getTitle(),titleCovidTestingPage);
        covid19TestingPage.scrolltofreeThruDriveBtn();
        covid19TestingPage.clickOnfreeThruDriveBtn();
        Assert.assertEquals(getTitle(),titleDriveThruTestingPage);
        driveThruTesting.clickOnrapidDiagnosticCheckbox();
        Assert.assertTrue(driveThruTesting.checkIfrapidDiagnosticCheckboxIsSelected());
        driveThruTesting.clickOnlocationCheckbox();
        Assert.assertTrue(driveThruTesting.checkIflocationCheckboxIsSelected());
        driveThruTesting.clickOnrapidDiagnosticTest();
        Assert.assertTrue(driveThruTesting.checkIfrapidDiagnosticTestIsSelected());
        driveThruTesting.clickOntestDate();
        waitFor(2);
        // Assert.assertTrue(driveThruTesting.testDate.isSelected());
       // driveThruTesting.clickOntestTime();
        // Assert.assertTrue(driveThruTesting.testTime.isSelected());
     //   driveThruTesting.clickOncontinueBtn();
        //-----------------to see--------



    }
}

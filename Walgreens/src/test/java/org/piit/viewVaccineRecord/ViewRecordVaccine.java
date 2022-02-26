package org.piit.viewVaccineRecord;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewRecordVaccine extends commonApi {


    @Test
    public void TestscheduleVaccineApointment() {
         HomePage home = new HomePage(driver);
         Covid19VaccinePge covid19VaccinePge = new Covid19VaccinePge(driver);
        SignInPage signInPage=new SignInPage(driver);
         ScheduleVaccinationAppointments scheduleVaccinationAppointments = new ScheduleVaccinationAppointments(driver);
        CompleteYourAccountPage completeYourAccountPage=new CompleteYourAccountPage(driver);
         Assert.assertTrue(home.covid19vaccineInformationIcon.isEnabled());
         home.clickOncovid19vaccineInformationIcon();
         Assert.assertEquals(driver.getTitle(), "COVID-19 Vaccine Information and Records | Walgreens");
         covid19VaccinePge.clickOnviewRecord();
         signInPage.typeOnuserNameFieldInSignIn();
         signInPage.typeOnpasswordFieldInSignIn();
         signInPage.clickOnsignInBtn();
         completeYourAccountPage.typeOndobField();
         completeYourAccountPage.selectfromgender();
         completeYourAccountPage.typeOnadress();
         completeYourAccountPage.typeOncity();
         completeYourAccountPage.selectfromstate();
         completeYourAccountPage.selectfromsecurityQuestion();
         completeYourAccountPage.typeOnanswerSecurityQuestion();




     }
}

package org.piit.payABillPage;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.piit.GetAQuotePage;
import org.piit.InsurancePage;
import org.piit.PayABillPage;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class PayABillPageTest extends commonApi {


       @Test
        public void payABillPageTest() {
            InsurancePage homePageV = new InsurancePage(driver);
            PayABillPage payABillPage = new PayABillPage(driver);
            //Assert.assertTrue(PayABillPage.payABillPage.isEnabled());

            homePageV.payABillMenu();

            payABillPage.phoneNumberField();

            payABillPage.dateOfBirthField();

            payABillPage.payNowBtn();














        }
    }
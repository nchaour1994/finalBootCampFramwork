package org.piit.payABill;

import base.commonApi;
import org.piit.GetAQuotePage;
import org.piit.InsurancePage;
import org.piit.PayABillPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PayABillTest extends commonApi {
       @Test
        public void payABill() {
           InsurancePage homePageV = new InsurancePage(driver);
           PayABillPage payABillPage = new PayABillPage(driver);
           Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
           Assert.assertTrue(homePageV.payABillMenu.isEnabled());
           homePageV.payABillMenu();
            payABillPage.phoneNumberField();
            payABillPage.dateOfBirthField();
            payABillPage.payNowBtn();


        }
    }
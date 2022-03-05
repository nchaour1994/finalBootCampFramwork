package org.piit.payInsuranceBill;

import base.commonApi;
import org.piit.InsurancePage;
import org.piit.PayInsuranceBillPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PayInsuranceBillTest extends commonApi {
    @Test
    public void payInsuranceBillPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        PayInsuranceBillPage payInsuranceBillPage = new PayInsuranceBillPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.payABillMenu.isEnabled());
        homePageV.payABillMenu();
        Assert.assertTrue(payInsuranceBillPage.phoneNumberField.isEnabled());
        payInsuranceBillPage.phoneNumberField();
        Assert.assertTrue(payInsuranceBillPage.dateOfBirthField.isEnabled());
        payInsuranceBillPage.dateOfBirthField();
        Assert.assertTrue(payInsuranceBillPage.payNowBtn.isEnabled());
        payInsuranceBillPage.payNowBtn();















    }











}

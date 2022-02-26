package org.piit.getAQuotePage;

import base.commonApi;
import org.piit.GetAQuotePage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAQuotePageTest extends commonApi {
    @Test
    public void getAQuotePageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        GetAQuotePage getAQuotePage = new GetAQuotePage(driver);
       Assert.assertTrue(getAQuotePage.productDropDown.isEnabled());
        homePageV.getAQuoteMenu();
        waitFor(2);
       getAQuotePage.productDropDown();
        waitFor(2);

        getAQuotePage.zipCodeField();
        waitFor(2);
        getAQuotePage.startQuoteBtn();
        waitFor(2);










    }



}
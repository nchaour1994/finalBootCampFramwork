package org.piit.getAQuote;

import base.commonApi;
import org.piit.GetAQuotePage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAQuoteTest extends commonApi {
    @Test
    public void getAQuote() {
        InsurancePage homePageV = new InsurancePage(driver);
        GetAQuotePage getAQuotePage = new GetAQuotePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
       Assert.assertTrue(homePageV.getAQuoteMenu.isEnabled());
        homePageV.getAQuoteMenu();
        Assert.assertTrue(getAQuotePage.productDropDown.isEnabled());
       getAQuotePage.productDropDown();
        Assert.assertTrue(getAQuotePage.zipCodeField.isEnabled());
        getAQuotePage.zipCodeField();
        Assert.assertTrue(getAQuotePage.startQuoteBtn.isEnabled());
        getAQuotePage.startQuoteBtn();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

    }



}
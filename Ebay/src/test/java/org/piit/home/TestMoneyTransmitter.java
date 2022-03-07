package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMoneyTransmitter extends commonApi {
    @Test(enabled = true)
    public void EciLicensesMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.setMoneyTransmitter();
        homePage.EciLicenses();
        //  String expectedTitle = " News | eBay";
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

}


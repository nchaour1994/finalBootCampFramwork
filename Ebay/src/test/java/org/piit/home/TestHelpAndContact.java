package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpAndContact extends commonApi {
    @Test
    public void clickOnHelpAndContact() {
        HomePage homePage = new HomePage(driver);
        homePage.helpAndContact();
        String expectedTitle = "Shipping & Tracking | eBay";
        String actualTitle = homePage.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }
}

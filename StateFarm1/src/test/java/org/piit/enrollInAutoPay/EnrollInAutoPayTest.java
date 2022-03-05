package org.piit.enrollInAutoPay;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.EnrollInAutoPayPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnrollInAutoPayTest extends commonApi {
    @Test
    public void enrollInAutoPay() {
        InsurancePage homePageV = new InsurancePage(driver);
        EnrollInAutoPayPage enrollInAutoPayPage = new EnrollInAutoPayPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(homePageV.enrollInAutoPayMenu.isEnabled());
        homePageV.enrollInAutoPayMenu();
        Assert.assertTrue(enrollInAutoPayPage.phoneNumberField.isEnabled());
        enrollInAutoPayPage.phoneNumberField();
        Assert.assertTrue(enrollInAutoPayPage.dateOfBirthField.isEnabled());
        enrollInAutoPayPage.dateOfBirthField();
        Assert.assertEquals(getTitle(), "Let's check your eligibility");

    }
}
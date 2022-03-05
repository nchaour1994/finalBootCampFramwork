package org.piit.goPaperLess;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.GoPaperLessPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoPaperLessTest extends commonApi {
    @Test
    public void goPaperLess() {
        InsurancePage homePageV = new InsurancePage(driver);
        GoPaperLessPage goPaperLessPage = new GoPaperLessPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(homePageV.goPaperLessMenu.isEnabled());
        homePageV.goPaperLessMenu();
        waitFor(2);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(goPaperLessPage.phoneNumberField.isEnabled());
        goPaperLessPage.phoneNumberField();
        Assert.assertTrue(goPaperLessPage.dateOfBirthField.isEnabled());
        goPaperLessPage.dateOfBirthField();
        Assert.assertTrue(goPaperLessPage.continueBtn.isEnabled());
        goPaperLessPage.continueBtn();
        Assert.assertEquals(getTitle(), "Go Paperless - We'll need your email.");
    }
}
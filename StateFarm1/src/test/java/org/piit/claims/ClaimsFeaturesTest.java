package org.piit.claims;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.ClaimsPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ClaimsFeaturesTest extends commonApi {
        @Test
    public void fileAClaimTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        ClaimsPage claimsPage = new ClaimsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        assertTrue(homePageV.claimsMenu.isEnabled());
        homePageV.claimsMenu();
        assertTrue(claimsPage.fileAClaim.isEnabled());
        claimsPage.fileAClaim();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        assertTrue(claimsPage.autoMotorcycle.isEnabled());
        claimsPage.autoMotorcycle();
        Assert.assertEquals(getTitle(), "File A Claim - State Farm®");
    }

    @Test
    public void roadsideAssistanceTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        ClaimsPage claimsPage = new ClaimsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        assertTrue(homePageV.claimsMenu.isEnabled());
        homePageV.claimsMenu();
        assertTrue(claimsPage.roadsideAssistance.isEnabled());
        claimsPage.roadsideAssistance();
        assertTrue(claimsPage.getRoadsideAssistance.isEnabled());
        claimsPage.getRoadsideAssistance();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        assertTrue(claimsPage.startMyRequest.isEnabled());
        claimsPage.startMyRequest();
        Assert.assertEquals(getTitle(), "Emergency Roadside Service");
    }
    @Test
    public void trackAClaimTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        ClaimsPage claimsPage = new ClaimsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        assertTrue(homePageV.claimsMenu.isEnabled());
        homePageV.claimsMenu();
        assertTrue(claimsPage.trackAClaim.isEnabled());
        claimsPage.trackAClaim();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,4050)");
        assertTrue(claimsPage.createAnAccount.isEnabled());
        claimsPage.createAnAccount();
        assertTrue(claimsPage.phoneNumberField.isEnabled());
        claimsPage.phoneNumberField();
        assertTrue(claimsPage.dateOfBirthField.isEnabled());
        claimsPage.dateOfBirthField();
        assertTrue(claimsPage.emailField.isEnabled());
        claimsPage.emailField();
        assertTrue(claimsPage.continueBtn.isEnabled());
        claimsPage.continueBtn();

    }
    @Test
    public void claimsHelpTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        ClaimsPage claimsPage = new ClaimsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        assertTrue(homePageV.claimsMenu.isEnabled());
        homePageV.claimsMenu();
        assertTrue(claimsPage.claimsHelp.isEnabled());
        claimsPage.claimsHelp();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,650)");
        assertTrue(claimsPage.seeTheSteps.isEnabled());
        claimsPage.seeTheSteps();
        Assert.assertEquals(getTitle(), "Claims Help - State Farm® - State Farm®");




    }
}
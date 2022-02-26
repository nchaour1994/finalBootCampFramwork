package org.piit.claimsPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.ClaimsPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ClaimsPageTest extends commonApi {
   @Test
    public void claimsPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        ClaimsPage claimsPage = new ClaimsPage(driver);
//        assertTrue(claimsPage.claimsMenu.isEnabled());

        homePageV.claimsMenu();
        claimsPage.fileAClaim();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        claimsPage.lifeSelected();




    }
}
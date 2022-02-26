package org.piit.goPaperLessPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.EnrollInAutoPayPage;
import org.piit.GoPaperLessPage;
import org.piit.InsurancePage;
import org.testng.annotations.Test;

public class GoPaperLessPageTest extends commonApi {
    @Test
    public void goPaperLessPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        GoPaperLessPage goPaperLessPage = new GoPaperLessPage(driver);
        //Assert.assertTrue(GoPaperLessPage.goPaperLessPage.isEnabled());
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");

        homePageV.goPaperLessMenu();
        waitFor(2);
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        goPaperLessPage.phoneNumberField();
        waitFor(2);
        goPaperLessPage.dateOfBirthField();
        waitFor(2);
        goPaperLessPage.continueBtn();
        waitFor(2);


    }
}
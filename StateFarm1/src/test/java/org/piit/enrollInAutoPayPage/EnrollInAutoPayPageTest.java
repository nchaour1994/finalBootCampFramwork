package org.piit.enrollInAutoPayPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.EnrollInAutoPayPage;
import org.piit.FindAnAgentPage;
import org.piit.InsurancePage;
import org.testng.annotations.Test;

public class EnrollInAutoPayPageTest extends commonApi {
    @Test
    public void enrollInAutoPayPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        EnrollInAutoPayPage enrollInAutoPayPage = new EnrollInAutoPayPage(driver);
        //Assert.assertTrue(FindAnAgentPage.findAnAgentPage.isEnabled());
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        homePageV.enrollInAutoPayMenu();
        waitFor(2);
        enrollInAutoPayPage.phoneNumberField();
        waitFor(2);
        enrollInAutoPayPage.dateOfBirthField();
        waitFor(2);
        enrollInAutoPayPage.continueBtn();
        waitFor(2);


    }
}
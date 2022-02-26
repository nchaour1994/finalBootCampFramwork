package org.piit.findAnAgentPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.FindAnAgentPage;
import org.piit.InsurancePage;
import org.piit.PayABillPage;
import org.testng.annotations.Test;

public class FindAnAgentPageTest extends commonApi {
    @Test
    public void findAnAgentPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        FindAnAgentPage findAnAgentPage = new FindAnAgentPage(driver);
        //Assert.assertTrue(FindAnAgentPage.findAnAgentPage.isEnabled());
        homePageV.findAnAgentMenu();
        waitFor(2);
        findAnAgentPage.zipCodeField();
        waitFor(2);
        findAnAgentPage.findAnAgentBtn();
        waitFor(2);
        findAnAgentPage.advanceSearchOptions();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        findAnAgentPage.firstNameField();
        waitFor(2);
        findAnAgentPage.lastNameField();
        waitFor(2);
        findAnAgentPage.searchBtn();
        waitFor(2);










    }
}
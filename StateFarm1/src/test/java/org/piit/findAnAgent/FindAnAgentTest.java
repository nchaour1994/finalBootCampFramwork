package org.piit.findAnAgent;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.FindAnAgentPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAnAgentTest extends commonApi {
    @Test
    public void findAnAgent() {
        InsurancePage homePageV = new InsurancePage(driver);
        FindAnAgentPage findAnAgentPage = new FindAnAgentPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.findAnAgentMenu.isEnabled());
        homePageV.findAnAgentMenu();
        Assert.assertTrue(findAnAgentPage.zipCodeField.isEnabled());
        findAnAgentPage.zipCodeField();
        Assert.assertTrue(findAnAgentPage.findAnAgentBtn.isEnabled());
        findAnAgentPage.findAnAgentBtn();
        Assert.assertTrue(findAnAgentPage.advanceSearchOptions.isEnabled());
        findAnAgentPage.advanceSearchOptions();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(findAnAgentPage.firstNameField.isEnabled());
        findAnAgentPage.firstNameField();
        Assert.assertTrue(findAnAgentPage.lastNameField.isEnabled());
        findAnAgentPage.lastNameField();
        Assert.assertTrue(findAnAgentPage.searchBtn.isEnabled());
        findAnAgentPage.searchBtn();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");


    }
}
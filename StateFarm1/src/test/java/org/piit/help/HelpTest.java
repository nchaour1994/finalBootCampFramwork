package org.piit.help;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.HelpPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class HelpTest extends commonApi {
    @Test
    public void help() {
        InsurancePage homePageV = new InsurancePage(driver);
        HelpPage helpPage = new HelpPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
       Assert.assertTrue(homePageV.help.isEnabled());
        homePageV.help();
       String parentWindowHandler=driver.getWindowHandle();// Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        Assert.assertTrue(helpPage.forgotUserId.isEnabled());
       helpPage.forgotUserId();
       JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(helpPage.phoneNumberField.isEnabled());
        helpPage.phoneNumberField();
        Assert.assertTrue(helpPage.birthDayField.isEnabled());
        helpPage.birthDayField();
        Assert.assertTrue(helpPage.emailField.isEnabled());
        helpPage.emailField();
        waitFor(1);
        Assert.assertTrue(helpPage.textSelected.isEnabled());
        helpPage.textSelected();
        Assert.assertTrue(helpPage.submitBtn.isEnabled());
        helpPage.submitBtn();
        Assert.assertEquals(getTitle(), "Forgot UserId / Password");







    }
}
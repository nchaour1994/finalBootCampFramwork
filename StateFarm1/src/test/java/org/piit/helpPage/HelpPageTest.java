package org.piit.helpPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.HelpPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class HelpPageTest extends commonApi {
    @Test
    public void helpPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        HelpPage helpPage = new HelpPage(driver);

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

       helpPage.forgotUserId();
       JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        helpPage.phoneNumberField();

        helpPage.birthDayField();

        helpPage.emailField();

        helpPage.textSelected();
        waitFor(2);
        helpPage.submitBtn();







    }
}
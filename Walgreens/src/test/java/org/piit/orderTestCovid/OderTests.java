package org.piit.orderTestCovid;

import base.commonApi;
import org.piit.Covid19TestingPage;
import org.piit.HealthConfirmPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class OderTests extends commonApi {


     @Test
    public void orderCovidHomeTest(){
        HomePage home= new HomePage(driver);
         Covid19TestingPage covid19Testing=new Covid19TestingPage(driver);
         HealthConfirmPage healthConfirmPage=new HealthConfirmPage(driver);
        String title= driver.getWindowHandle();
        Assert.assertTrue(home.covid19TestingOptions.isEnabled());
        home.clickONcovid19TestingOptions();
        waitFor(3);
        Assert.assertTrue(covid19Testing.exploreAtHomeTesting.isEnabled());
         covid19Testing.clickOnexploreAtHomeTesting();
        waitFor(3);
        Assert.assertTrue(covid19Testing.pcrAtHomeTestingIcon.isEnabled());
         covid19Testing.selectpcrAtHomeTestingIcon();
        waitFor(3);
        Assert.assertTrue(covid19Testing.healthConfirmTesting.isEnabled());
         covid19Testing.clickOnhealthConfirmTesting();
        waitFor(3);
        Assert.assertTrue(healthConfirmPage.getStartedBtnInCovidTestingOptions.isEnabled());
         healthConfirmPage.clickONgetStartedBtnInCovidTestingOptions();
        waitFor(3);
        Assert.assertTrue(healthConfirmPage.gotItBtnInCovidTestingOptions.isEnabled());
         healthConfirmPage.clickONgotItBtnInCovidTestingOptions();
        waitFor(3);
        Set<String> windows=driver.getWindowHandles();
        for (String tab:windows) {
            if(!(tab.equalsIgnoreCase(title))){
                driver.switchTo().window(tab);
            }
        }
        Assert.assertTrue(healthConfirmPage.orderNowBtnInNewTab.isEnabled());
         healthConfirmPage.clickOnorderNowBtnInNewTab();
        waitFor(10);

    }
}

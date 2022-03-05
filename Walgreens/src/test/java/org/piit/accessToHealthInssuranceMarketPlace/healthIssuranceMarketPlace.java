package org.piit.accessToHealthInssuranceMarketPlace;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HealthInssurancePage;
import org.piit.HomePage;
import org.piit.RxCoveragePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import java.time.Duration;
import java.util.Set;

public class healthIssuranceMarketPlace extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String titleAccountPage= prop.getProperty("titleAccountPage");
    String titleEhealthPage=prop.getProperty("titleEhealthPage");
    String titleRxCoveragePage=prop.getProperty("titleRxCoveragePage");


    @Test
    public void testHealthInsurranceMarketPlace(){
        HomePage home=new HomePage(driver);
        HealthInssurancePage healthInssurancePage=new HealthInssurancePage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        String parent = driver.getWindowHandle();
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.checkIfhealthInssuranceIsEnabled());
        home.clickOnhealthInssurance();
        Assert.assertTrue(healthInssurancePage.checkIfshopAllIsEnabled());
        healthInssurancePage.clickOnShopAll();
        wait.until(ExpectedConditions.elementToBeClickable(healthInssurancePage.gotItBtn));
        Assert.assertTrue(healthInssurancePage.checkIfgotItBtnIsEnabled());
        healthInssurancePage.clickOngotItBtn();
        Set<String> allWindows=driver.getWindowHandles();
        for (String win:allWindows
             ) {
            if(!(parent.equals(win))){
                driver.switchTo().window(win);
                Assert.assertEquals(getTitle(),titleEhealthPage);
            }
        }


    }
    @Test
    public void testHealthInsurranceMarketPlaceFromRxCoverage(){
        HomePage home=new HomePage(driver);
        HealthInssurancePage healthInssurancePage=new HealthInssurancePage(driver);
        RxCoveragePage rxCoveragePage=new RxCoveragePage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        String parent = driver.getWindowHandle();
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.checkIfFindRxCoverageIsEnabled());
        home.clickOnfindRxCoverage();
        Assert.assertEquals(getTitle(),titleRxCoveragePage);
        rxCoveragePage.clickOnapplyForMedicaid();
        healthInssurancePage.clickOnhealthIssuranceMarketPlace();
        Assert.assertTrue(healthInssurancePage.checkIfshopAllIsEnabled());
        healthInssurancePage.clickOnShopAll();
        Assert.assertTrue(healthInssurancePage.checkIfgotItBtnIsEnabled());
        healthInssurancePage.clickOngotItBtn();
        Set<String> allWindows=driver.getWindowHandles();
        for (String win:allWindows
        ) {
            if(!(parent.equals(win))){
                driver.switchTo().window(win);
                Assert.assertEquals(getTitle(),titleEhealthPage);
            }
        }


    }

}

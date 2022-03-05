package org.piit.accessWeeklyad;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.WeeklyAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WeekyAd extends commonApi {


    String titleWeeklyAdPage=prop.getProperty("titleWeekAdPage");

    @Test
    public void testAccessToweeklyAd(){
        HomePage home=new HomePage(driver);
        WeeklyAdPage weeklyAd=new WeeklyAdPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfweeklyADIsEnabled());
        wait.until(ExpectedConditions.visibilityOf(home.weeklyAD));
        home.clickOnweeklyAD();
        Assert.assertEquals(driver.getTitle(),titleWeeklyAdPage);
        weeklyAd.selectFromjumpToDropDown();
        Assert.assertTrue(weeklyAd.jumpToDropDown.isDisplayed());



    }

    @Test
    public void testAccessToweeklyAdFromHomePage(){
        HomePage home=new HomePage(driver);
        WeeklyAdPage weeklyAd=new WeeklyAdPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickOncheckoutWeeklyAd();
        Assert.assertEquals(driver.getTitle(),titleWeeklyAdPage);
        weeklyAd.selectFromjumpToDropDown();
        Assert.assertTrue(weeklyAd.jumpToDropDown.isDisplayed());

    }
}

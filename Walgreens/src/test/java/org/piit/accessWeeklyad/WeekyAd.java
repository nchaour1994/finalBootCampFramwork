package org.piit.accessWeeklyad;

import base.commonApi;
import org.piit.HomePage;
import org.piit.WeeklyAd;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class WeekyAd extends commonApi {


    String titleWeeklyAdPage=prop.getProperty("titleWeekAdPage");

    @Test
    public void TestAccessToweeklyAd(){
        HomePage home=new HomePage(driver);
        WeeklyAd weeklyAd=new WeeklyAd(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfweeklyADIsEnabled());
        waitFor(1);
        home.clickOnweeklyAD();
        Assert.assertEquals(driver.getTitle(),titleWeeklyAdPage);
        weeklyAd.selectFromjumpToDropDown();


    }
}

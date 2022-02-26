package org.piit.accessWeeklyad;

import base.commonApi;
import org.piit.HomePage;
import org.piit.WeeklyAd;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeekyAd extends commonApi {

    @Test
    public void TestAccessToweeklyAd(){
        HomePage home=new HomePage(driver);
        WeeklyAd weeklyAd=new WeeklyAd(driver);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.weeklyAD.isEnabled());
        waitFor(1);
        home.clickOnweeklyAD();
        Assert.assertEquals(driver.getTitle(),"Weekly Ad: Top Deals Online & In-Store | Walgreens");
        weeklyAd.selectFromjumpToDropDown();


    }
}

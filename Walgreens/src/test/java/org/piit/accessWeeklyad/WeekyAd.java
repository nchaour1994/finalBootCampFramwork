package org.piit.accessWeeklyad;

import base.commonApi;
import org.piit.HomePage;
import org.piit.WeeklyAd;
import org.testng.annotations.Test;

public class WeekyAd extends commonApi {

    @Test
    public void accessToweeklyAd(){
        HomePage home=new HomePage(driver);
        WeeklyAd weeklyAd=new WeeklyAd(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOnweeklyAD();
        waitFor(2);
        weeklyAd.selectFromjumpToDropDown();
        waitFor(5);

    }
}

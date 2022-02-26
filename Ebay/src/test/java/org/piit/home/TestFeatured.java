package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestFeatured extends commonApi {
    @Test(enabled = true)
    public void DailyDealsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.DailyDeals();
        homePage.setFeaturedButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

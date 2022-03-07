package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestBiddingAndBuyingHelp extends commonApi {
    @Test(enabled = true)
    public void BuyingItems() {
        HomePage homePage = new HomePage(driver);
        homePage.BuyingItems();
        homePage.setBiddingAndBuyingHelp();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

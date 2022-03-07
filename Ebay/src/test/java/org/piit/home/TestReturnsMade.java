package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestReturnsMade extends commonApi {
    @Test(enabled = true)
    public void EbayReturnsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.EbayReturns();
        homePage.setReturnsMade();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


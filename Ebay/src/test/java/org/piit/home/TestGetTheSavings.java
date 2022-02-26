package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestGetTheSavings extends commonApi {
    @Test(enabled = true)
    public void DealsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Deals();
        homePage.setGetTheSavingsButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

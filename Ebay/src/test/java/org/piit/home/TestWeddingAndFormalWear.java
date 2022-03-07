package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestWeddingAndFormalWear extends commonApi {
    @Test(enabled = true)
    public void WeddingDressesMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.WeddingDresses();
        homePage.setWeddingAndFormalWear();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


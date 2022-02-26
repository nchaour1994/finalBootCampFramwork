package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestBrandOutlet extends commonApi {
    @Test(enabled = true)
    public void BrandOutletdMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.WatchesButton();
        homePage.setBrandOutlet();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



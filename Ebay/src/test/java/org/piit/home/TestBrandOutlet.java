package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrandOutlet extends commonApi {
    @Test(enabled = true)
    public void BrandOutletdMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.setBrandOutlet();
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        homePage.WatchesButton();

//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



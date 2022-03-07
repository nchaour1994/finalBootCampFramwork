package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMedia extends commonApi {
    @Test(enabled = true)
    public void CharityShopMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.CharityShop();
        homePage.setMedia();
      //  Assert.assertEquals(getTitle(), "Shop Menu| eBay");
      //  homePage.Media();

//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}




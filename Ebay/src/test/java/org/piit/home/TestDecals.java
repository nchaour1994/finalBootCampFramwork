package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestDecals extends commonApi {
    @Test(enabled = true)
    public void SorageMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Storage();
        homePage.setDecals();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



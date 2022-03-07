package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestPersonalizedItems extends commonApi {
    @Test(enabled = true)
    public void Apparel() {
        HomePage homePage = new HomePage(driver);
        homePage.Apparel();
        homePage.setPersonalizedItems();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


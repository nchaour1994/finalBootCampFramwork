package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestCategory extends commonApi {
    @Test(enabled = true)
    public void DeliveryOptionsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.DeliveryOptions();
        homePage.setCategoryButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

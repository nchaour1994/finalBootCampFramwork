package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSmartPhones extends commonApi {
    @Test(enabled = true)
    public void ApplePage() {
        HomePage homePage = new HomePage(driver);
        homePage.Apple();
        homePage.setSmartphones();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

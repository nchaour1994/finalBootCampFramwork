package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestFees extends commonApi {
    @Test(enabled = true)
    public void StartSellingMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.StartSelling();
        homePage.setFees();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



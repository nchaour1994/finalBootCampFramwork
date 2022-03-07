package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSafetyGearDevices extends commonApi {
    @Test(enabled = true)
    public void UnbrandedMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Unbranded();
        homePage.setSafetyGearDevices();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



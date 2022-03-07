package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestElectronicsNavigation extends commonApi {
    @Test(enabled = true)
    public void GpsAndCHartplotters() {
        HomePage homePage = new HomePage(driver);
        homePage.GpsAndCHartplotters();
        homePage.setElectronicsNavigation();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

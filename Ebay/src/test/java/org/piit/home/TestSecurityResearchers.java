package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSecurityResearchers extends commonApi {
    @Test(enabled = true)
    public void SecurityCenterMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.SecurityCenter();
        homePage.setSecurityResearchers();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



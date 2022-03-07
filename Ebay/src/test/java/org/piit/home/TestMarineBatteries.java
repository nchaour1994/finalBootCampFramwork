package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestMarineBatteries extends commonApi {
    @Test(enabled = true)
    public void UsedMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Used();
        homePage.setMarineBatteries();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

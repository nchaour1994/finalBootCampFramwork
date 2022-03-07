package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSportsAndFanClothing extends commonApi {
    @Test(enabled = true)
    public void BoxingMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Boxing();
        homePage.setSportsAndFanClothing();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

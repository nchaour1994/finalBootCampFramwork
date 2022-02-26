package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestFindStore extends commonApi {
    @Test(enabled = true)
    public void AdvancedMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Advanced();
        homePage.setFindStoreButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

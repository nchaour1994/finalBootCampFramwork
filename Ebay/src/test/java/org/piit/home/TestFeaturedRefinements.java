package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestFeaturedRefinements extends commonApi {
    @Test(enabled = true)
    public void ShowOnlyPage() {
        HomePage homePage = new HomePage(driver);
        homePage.ShowOnly();
        homePage.setFeaturedRefinements();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

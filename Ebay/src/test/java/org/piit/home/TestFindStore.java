package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindStore extends commonApi {
    @Test(enabled = true)
    public void AdvancedMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Advanced();
        homePage.setFindStoreButton();
//  String expectedTitle = "Find Store  | eBay";
  String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
}

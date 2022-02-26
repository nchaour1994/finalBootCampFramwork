package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestCommerce extends commonApi {
    @Test(enabled = true)
    public void NewsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.News();
        homePage.setCommerceButton();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}

package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestClutch extends commonApi {
    @Test(enabled = true)
    public void GucciMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Gucci();
        homePage.setClutchButton();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}

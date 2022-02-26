package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCampusPhotos extends commonApi {
    @Test(enabled = true)
    public void PressRoomButton() {
        HomePage homePage = new HomePage(driver);
        homePage.PressRoomButton();
        homePage.setCampusPhotos();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}



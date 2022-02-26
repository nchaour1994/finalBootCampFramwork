package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestStyle extends commonApi {
    @Test(enabled = true)
    public void ChanelButtonMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.ChanelButton();
        homePage.setStyle();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}


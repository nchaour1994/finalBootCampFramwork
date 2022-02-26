package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestRatchets extends commonApi {
    @Test(enabled = true)
    public void AutomotiveHandWrenchesMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.AutomotiveHandWrenches();
        homePage.setRatchetsButton();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}

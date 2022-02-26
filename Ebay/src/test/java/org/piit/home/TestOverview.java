package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestOverview extends commonApi {
    @Test(enabled = true)
    public void DeversityInclusionMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.DeversityInclusion();
        homePage.setOverview();
//        String expectedTitle = " CampusPhotos | eBay";
//        String actualTitle = homePage.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle," Title does not match");
    }

}


package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestTrailerParts extends commonApi {
    @Test(enabled = true)
    public void TransomSaverArmPage() {
        HomePage homePage = new HomePage(driver);
        homePage.TransomSaverArm();
        homePage.setTrailerParts();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


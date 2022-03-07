package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSeating extends commonApi {
    @Test(enabled = true)
    public void BoatsParts() {
        HomePage homePage = new HomePage(driver);
        homePage.BoatParts();
        homePage.setSeating();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestUniformsAndWorkClothing extends commonApi {
    @Test(enabled = true)
    public void Hats() {
        HomePage homePage = new HomePage(driver);
        homePage.Hats();
        homePage.setUniformsAndWorkClothing();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


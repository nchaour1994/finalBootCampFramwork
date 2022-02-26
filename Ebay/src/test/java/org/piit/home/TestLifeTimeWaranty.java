package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestLifeTimeWaranty extends commonApi {
    @Test(enabled = true)
    public void AutomotiveMinu() {
        HomePage homePage = new HomePage(driver);
        homePage.Automotive();
        homePage.setLifeTimeWaranty();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

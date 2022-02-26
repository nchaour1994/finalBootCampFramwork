package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestWomen extends commonApi {
    @Test(enabled = true)
    public void RolexMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Rolex();
        homePage.setWomenButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


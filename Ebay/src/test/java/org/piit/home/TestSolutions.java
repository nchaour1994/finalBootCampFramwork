package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestSolutions extends commonApi {
    @Test(enabled = true)
    public void AffiliatesMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Affiliates();
        homePage.SetSolutions();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


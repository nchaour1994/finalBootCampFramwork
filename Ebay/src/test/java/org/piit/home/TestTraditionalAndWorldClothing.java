package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestTraditionalAndWorldClothing extends commonApi {
    @Test(enabled = true)
    public void Specialty() {
        HomePage homePage = new HomePage(driver);
        homePage.Specialty();
        homePage.setTraditionalAndWorldClothing();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

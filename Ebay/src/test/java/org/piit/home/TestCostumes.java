package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestCostumes extends commonApi {
    @Test(enabled = true)
    public void InfantsAndToddlers() {
        HomePage homePage = new HomePage(driver);
        homePage.InfantsAndToddlers();
        homePage.setCostumes();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



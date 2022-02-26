package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestEbay extends commonApi {
    @Test(enabled = true)
    public void CompanyInfoMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.CompanyInfo();
        homePage.setEbayButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestInvestorDay extends commonApi {
    @Test(enabled = true)
    public void InvestorsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Investors();
        homePage.setInvestorDay();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

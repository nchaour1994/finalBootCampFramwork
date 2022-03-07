package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestAccount extends commonApi {
    @Test(enabled = true)
    public void YourAccountStatusMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.YourAccountStatus();
        homePage.setAccount();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



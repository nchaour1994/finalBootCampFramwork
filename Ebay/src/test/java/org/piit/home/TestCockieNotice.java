package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestCockieNotice extends commonApi {
    @Test(enabled = true)
    public void PoliciesMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.Policies();
        homePage.SetCockieNotice();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

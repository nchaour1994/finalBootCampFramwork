package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestImpact extends commonApi {
    @Test(enabled = true)
    public void GlobalImpactPage() {
        HomePage homePage = new HomePage(driver);
        homePage.GlobalImpact();
        homePage.setImpactButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

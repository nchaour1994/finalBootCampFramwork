package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestOurCommunity extends commonApi {
    @Test(enabled = true)
    public void GovernmentRelationsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.GovernmentRelations();
        homePage.setOurCommunityButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}

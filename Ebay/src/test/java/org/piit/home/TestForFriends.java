package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestForFriends extends commonApi {
    @Test(enabled = true)
    public void SalesEventsMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.SalesEvents();
        homePage.setForFriendsButton();
        homePage.setCertifiedRefurbishedAnker();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


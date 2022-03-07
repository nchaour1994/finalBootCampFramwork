package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestHolidayGifts extends commonApi {
    @Test(enabled = true)
    public void GreetingCardsAndpartySupply() {
        HomePage homePage = new HomePage(driver);
        homePage.GreetingCardsAndpartySupply();
        homePage.setHolidayGifts();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



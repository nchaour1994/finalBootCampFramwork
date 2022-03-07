package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestTrollingMotorsComponents extends commonApi{
        @Test(enabled = true)
        public void CompleteTrollingMotors() {
            HomePage homePage = new HomePage(driver);
            homePage.CompleteTrollingMotors();
            homePage.setTrollingMotorsComponents();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
            //Assert.assertEquals(actualTitle, expectedTitle,  );
        }
}
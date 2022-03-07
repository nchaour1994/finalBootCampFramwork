package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestPlumbingVentilation extends commonApi {
    @Test(enabled = true)
    public void AirConditionerPage() {
        HomePage homePage = new HomePage(driver);
        homePage.AirConditioner();
        homePage.setPlumbingVentilation();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}



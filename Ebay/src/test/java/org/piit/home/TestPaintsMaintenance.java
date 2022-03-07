package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestPaintsMaintenance extends commonApi {
    @Test(enabled = true)
    public void TopsidePaintMenu() {
        HomePage homePage = new HomePage(driver);
        homePage.TopsidePaints();
        homePage.setPaintsMaintenance();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


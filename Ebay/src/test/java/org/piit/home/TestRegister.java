package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestRegister extends commonApi {
    @Test(enabled = true)
    public void Developerspage() {
        HomePage homePage = new HomePage(driver);
        homePage.Developers();
        homePage.setRegisterButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


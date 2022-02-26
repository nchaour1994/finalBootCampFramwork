package org.piit.home;

import base.commonApi;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class TestMensShoes extends commonApi {
    @Test(enabled = true)
    public void FashionButton() {
        HomePage homePage = new HomePage(driver);
        homePage.Fashion();
        homePage.setMensShoesButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle,  );
    }
}


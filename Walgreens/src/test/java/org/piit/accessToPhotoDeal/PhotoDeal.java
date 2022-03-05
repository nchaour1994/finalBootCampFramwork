package org.piit.accessToPhotoDeal;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.PrintBookPage;
import org.piit.ShopAllPhotoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhotoDeal extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleDealPhoto=prop.getProperty("titleDealPhoto");
    String titlePhotoCenterPage=prop.getProperty("titlePhotoCenterPage");

    @Test
    public void testPhotoDeal(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titlePhotoCenterPage);
        shopAllPhotoPage.clickOnDeals();
        Assert.assertEquals(getTitle(),titleDealPhoto);
    }
}

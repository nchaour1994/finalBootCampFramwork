package org.piit.makeCustomPuzzle;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeCustomPuzzle extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleAllPhotoProduct= prop.getProperty("titleAllPhotoProduct");
    String titleCreateCustomPuzzle=prop.getProperty("titleCreateCustomPuzzle");

    @Test
    public void testMakeCustomPuzzle(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        CustomPuzzlePage customPuzzlePage=new CustomPuzzlePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        shopAllPhotoPage.hoverOnsameDay();
        shopAllPhotoPage.clickOncustomPuzzle();
        customPuzzlePage.clickOnsize();
        Assert.assertTrue(customPuzzlePage.checkIfcreateNowBtnIsEnabled());
        customPuzzlePage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateCustomPuzzle);


    }
    @Test
    public void testMakeCustomPuzzleFromHomePage(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        CustomPuzzlePage customPuzzlePage=new CustomPuzzlePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnphotoCard();
        shopAllPhotoPage.hoverOnsameDay();
        shopAllPhotoPage.clickOncustomPuzzle();
        customPuzzlePage.clickOnsize();
        Assert.assertTrue(customPuzzlePage.checkIfcreateNowBtnIsEnabled());
        customPuzzlePage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateCustomPuzzle);
    }

}

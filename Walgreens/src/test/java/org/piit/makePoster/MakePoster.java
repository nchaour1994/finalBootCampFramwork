package org.piit.makePoster;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class MakePoster extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
     String titlePosterPage=prop.getProperty("titlePosterPage");
     String titlePosterAndBannerPage=prop.getProperty("titlePosterAndBannerPage");
     String titleBannerPage=prop.getProperty("titleBannerPage");
     String titleCreatePoster=prop.getProperty("titleCreatePoster");
     String titleAllPhotoProduct=prop.getProperty("titleAllPhotoProduct");
     String titleCreateBanner=prop.getProperty("titleCreateBanner");

    @Test
    public void testMakePoster(){
        HomePage home=new HomePage(driver);
        PosterAndBannerPage posterAndBannerPage=new PosterAndBannerPage(driver);
        PosterPage posterPage=new PosterPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfpostersInsubMenuPhotoIsEnabled());
        home.clickOnpostersInsubMenuPhoto();
        Assert.assertEquals(getTitle(),titlePosterAndBannerPage);
        posterAndBannerPage.clickOnposters();
        Assert.assertEquals(getTitle(),titlePosterPage);
        waitFor(1);
        Assert.assertTrue(posterPage.checkIfmaterialIsEnabled());
        posterPage.clickOnmaterial();
        Assert.assertTrue(posterPage.checkIfsizeIsEnbaled());
        posterPage.clickOnsize();
        Assert.assertTrue(posterPage.checkIfcreateNowBtnIsEnabled());
        posterPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreatePoster);

    }
   @Test
    public void testMakePosterFromShopAllPhotoPage(){
        HomePage home = new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage = new ShopAllPhotoPage(driver);
        PosterPage posterPage=new PosterPage(driver);
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        shopAllPhotoPage.hoverOnPosters();
        shopAllPhotoPage.clickOnposter();
        Assert.assertEquals(getTitle(),titlePosterPage);
        Assert.assertTrue(posterPage.checkIfmaterialIsEnabled());
        posterPage.clickOnmaterial();
        Assert.assertTrue(posterPage.checkIfsizeIsEnbaled());
        posterPage.clickOnsize();
        Assert.assertTrue(posterPage.checkIfcreateNowBtnIsEnabled());
        waitFor(1);
        posterPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreatePoster);


    }


    @Test
    public void testMakeBanner(){
        HomePage home=new HomePage(driver);
        PosterAndBannerPage posterAndBannerPage=new PosterAndBannerPage(driver);
        BannersPage banners=new BannersPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfpostersInsubMenuPhotoIsEnabled());
        wait.until(ExpectedConditions.visibilityOf(home.postersInsubMenuPhoto));
        home.clickOnpostersInsubMenuPhoto();
        Assert.assertEquals(getTitle(),titlePosterAndBannerPage);
        posterAndBannerPage.clickOnbanners();
        Assert.assertEquals(getTitle(),titleBannerPage);
        waitFor(1);
        banners.selectFromsortByField();
        Assert.assertTrue(banners.checkIfbirthdayBannerIsEnabled());
        banners.clickOnbirthdayBanner();
        banners.clickOnmaterial();
        banners.clickOnsize();
        Assert.assertTrue(banners.checkIfcreateNowBtnIsEnabled());
        banners.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateBanner);


    }
     @Test
    public void testMakeBannerFromShopAllPhotoPage() {
        HomePage home = new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage = new ShopAllPhotoPage(driver);
        PosterPage posterPage = new PosterPage(driver);
        BannersPage banners=new BannersPage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        String parent = driver.getWindowHandle();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        waitFor(1);
        shopAllPhotoPage.hoverOnPosters();
        shopAllPhotoPage.clickOnBanner();
        Assert.assertEquals(getTitle(),titleBannerPage);
        banners.selectFromsortByField();
        Assert.assertTrue(banners.checkIfbirthdayBannerIsEnabled());
        banners.clickOnbirthdayBanner();
        banners.clickOnmaterial();
        banners.clickOnsize();
        Assert.assertTrue(banners.checkIfcreateNowBtnIsEnabled());
        banners.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateBanner);

     }
}

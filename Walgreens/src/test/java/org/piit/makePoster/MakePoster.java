package org.piit.makePoster;

import base.commonApi;
import org.piit.BannersPage;
import org.piit.HomePage;
import org.piit.PosterAndBannerPage;
import org.piit.PosterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class MakePoster extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
     String titlePosterPage=prop.getProperty("titlePosterPage");
     String titlePosterAndBannerPage=prop.getProperty("titlePosterAndBannerPage");
     String titleBannerPage=prop.getProperty("titleBannerPage");

    @Test
    public void makePoster(){
        HomePage home=new HomePage(driver);
        PosterAndBannerPage posterAndBannerPage=new PosterAndBannerPage(driver);
        PosterPage posterPage=new PosterPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfpostersInsubMenuPhotoIsEnabled());
        home.clickOnpostersInsubMenuPhoto();
        Assert.assertEquals(getTitle(),titlePosterAndBannerPage);
        posterAndBannerPage.clickOnposters();
        Assert.assertEquals(getTitle(),titlePosterPage);
        Assert.assertTrue(posterPage.checkIfmaterialIsEnabled());
        posterPage.clickOnmaterial();
        Assert.assertTrue(posterPage.checkIfsizeIsEnbaled());
        posterPage.clickOnsize();
        Assert.assertTrue(posterPage.checkIfcreateNowBtnIsEnabled());
        posterPage.clickOncreateNowBtn();

    }


    @Test
    public void makeBanner(){
        HomePage home=new HomePage(driver);
        PosterAndBannerPage posterAndBannerPage=new PosterAndBannerPage(driver);
        BannersPage banners=new BannersPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfpostersInsubMenuPhotoIsEnabled());
        home.clickOnpostersInsubMenuPhoto();
        Assert.assertEquals(getTitle(),titlePosterAndBannerPage);
        posterAndBannerPage.clickOnbanners();
        Assert.assertEquals(getTitle(),titleBannerPage);
        banners.selectFromsortByField();
        banners.clickOnbirthdayBanner();
        banners.clickOnmaterial();
        banners.clickOnsize();
        banners.clickOncreateNowBtn();



    }
}

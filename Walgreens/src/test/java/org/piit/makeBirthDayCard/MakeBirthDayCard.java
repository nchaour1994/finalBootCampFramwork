package org.piit.makeBirthDayCard;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.BirthDayCardPage;
import org.piit.HomePage;
import org.piit.MagnetCardPage;
import org.piit.ShopAllPhotoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeBirthDayCard extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleAllPhotoProduct=prop.getProperty("titleAllPhotoProduct");
    String titleMagnetCardPage=prop.getProperty("titleMagnetCardPage");
    String titlecreatePhotoPage=prop.getProperty("titlecreatePhotoPage");

    @Test
    public void makeBirthDayCard(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        BirthDayCardPage birthDayCardPage=new BirthDayCardPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        wait.until(ExpectedConditions.visibilityOf(home.shopAllProductInPhoto));
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        Assert.assertTrue(shopAllPhotoPage.checkIfcardAndStationaryIsDisplayed());
        shopAllPhotoPage.hoverOncardAndStationary();
        wait.until(ExpectedConditions.visibilityOf(shopAllPhotoPage.Birthday));
        Assert.assertTrue(shopAllPhotoPage.checkIfBirthdayIsDisplayed());
        shopAllPhotoPage.clickOnBirthday();
        //Assert.assertEquals(getTitle(),titleBirthDayCard);
        birthDayCardPage.clickOnnintendo();
        birthDayCardPage.selectFromPaper();
        birthDayCardPage.selectFromquantity();
        birthDayCardPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titlecreatePhotoPage);



    }

    @Test
    public void testMakeMagnetCard(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        MagnetCardPage magnetCardPage=new MagnetCardPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        Assert.assertTrue(shopAllPhotoPage.checkIfcardAndStationaryIsDisplayed());
        shopAllPhotoPage.hoverOncardAndStationary();
        wait.until(ExpectedConditions.visibilityOf(shopAllPhotoPage.magnetCard));
        Assert.assertTrue(shopAllPhotoPage.checkIfmagnetCardIsDisplayed());
        shopAllPhotoPage.clickOnmagnetCard();
        Assert.assertEquals(getTitle(),titleMagnetCardPage);
        magnetCardPage.clickOnpartyByTrumbulina();
        Assert.assertTrue(magnetCardPage.checkIfsectionIsDisplayed());
        magnetCardPage.selectFromPaper();
        magnetCardPage.selectFromquantity();
        magnetCardPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titlecreatePhotoPage);





    }
}

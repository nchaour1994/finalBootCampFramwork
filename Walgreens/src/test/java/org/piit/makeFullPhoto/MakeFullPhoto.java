package org.piit.makeFullPhoto;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.ShopAllPhotoPage;
import org.piit.ThankYouFullPhotoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeFullPhoto extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleAllPhotoProduct= prop.getProperty("titleAllPhotoProduct");
    String titlecreatePhotoPage=prop.getProperty("titlecreatePhotoPage");


    @Test
    public void testMakeFullPhoto(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        ThankYouFullPhotoPage thankYouFullPhotoPage=new ThankYouFullPhotoPage(driver);
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
        wait.until(ExpectedConditions.visibilityOf(shopAllPhotoPage.fullPhoto));
        Assert.assertTrue(shopAllPhotoPage.checkIfFullPhotoIsDisplayed());
        shopAllPhotoPage.clickOnfullPhoto();
        Assert.assertTrue(thankYouFullPhotoPage.checkIfFullPhotoIsEnabled());
        thankYouFullPhotoPage.clickOnfullPhoto();
        thankYouFullPhotoPage.selectFromPaper();
        thankYouFullPhotoPage.selectFromquantity();
        Assert.assertTrue(thankYouFullPhotoPage.checkIfcreateNowBtnIsEnabled());
        thankYouFullPhotoPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titlecreatePhotoPage);

    }

}

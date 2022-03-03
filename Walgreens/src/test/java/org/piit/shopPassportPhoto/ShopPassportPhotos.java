package org.piit.shopPassportPhoto;

import base.commonApi;
import org.piit.FindStorePage;
import org.piit.HomePage;
import org.piit.ShopAllPhotoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class ShopPassportPhotos extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleFindLocationStore=prop.getProperty("titleFindLocationStore");

    @Test
    public void testShopPassportPhoto(){
        HomePage home=new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        String parent =driver.getWindowHandle();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertTrue(shopAllPhotoPage.checkIfpassportPhotosIsEnabled());
        shopAllPhotoPage.clickOnpassportPhotos();
        Assert.assertTrue(shopAllPhotoPage.checkIfFindLocationNearYouIsEnabled());
        shopAllPhotoPage.clickOnfindLocationNearYou();
        Set<String> allTabs= driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleFindLocationStore);
                findStorePage.clickOnUpdateLocation();
                findStorePage.checkIflocationFieldIsDisplayed();
                findStorePage.typeOnlocationField();
                Assert.assertEquals(getTitle(),titleFindLocationStore);
            }

        }

    }

    @Test
    public void testShopPassportPhotoFromMenu() {
        HomePage home = new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage = new ShopAllPhotoPage(driver);
        FindStorePage findStorePage = new FindStorePage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        String parent = driver.getWindowHandle();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        home.clickOnpassportPhoto();
        Assert.assertTrue(shopAllPhotoPage.checkIfFindLocationNearYouIsEnabled());
        shopAllPhotoPage.clickOnfindLocationNearYou();
        Set<String> allTabs= driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleFindLocationStore);
                findStorePage.clickOnUpdateLocation();
                findStorePage.checkIflocationFieldIsDisplayed();
                findStorePage.typeOnlocationField();
                Assert.assertEquals(getTitle(),titleFindLocationStore);
            }

        }

    }

}

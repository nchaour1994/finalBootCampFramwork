package org.piit.shopGiftCards;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.GiftCardsPage;
import org.piit.GoogleGiftCardPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShopGoogleGiftCard extends commonApi {
    String titleShoppingCartPage=prop.getProperty("titleShoppingCartPage");
    String titleHomePage=prop.getProperty("titleHomePage");

    @Test
    public void testShopGooleGIftCard(){
        HomePage home=new HomePage(driver);
        GiftCardsPage giftCardsPage=new GiftCardsPage(driver);
        GoogleGiftCardPage googleGiftCardPage=new GoogleGiftCardPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfshopProductInMenuIsEnabled());
        home.clickOnshopProductInMenu();
        Assert.assertTrue(home.checkIfgiftCardsIsEnabled());
        waitFor(1);
        home.clickOngiftCards();
        Assert.assertTrue(home.checkIfshopGiftCardsIsEnabled());
        waitFor(1);
        home.clickOnshopGiftCards();
        giftCardsPage.clickOngoogleBrand();
        googleGiftCardPage.clickOnaddGiftCardTenDollarsBtn();
        waitFor(4);
        googleGiftCardPage.clickOnviewCart();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);
    }
    @Test
    public void testShopStarbucksGIftCard(){
        HomePage home=new HomePage(driver);
        GiftCardsPage giftCardsPage=new GiftCardsPage(driver);
        GoogleGiftCardPage googleGiftCardPage=new GoogleGiftCardPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfshopProductInMenuIsEnabled());
        home.clickOnshopProductInMenu();
        Assert.assertTrue(home.checkIfgiftCardsIsEnabled());
        waitFor(1);
        home.clickOngiftCards();
        waitFor(1);
        Assert.assertTrue(home.checkIfshopGiftCardsIsEnabled());
        home.clickOnshopGiftCards();
        giftCardsPage.clickOnStarbucksBrand();
        googleGiftCardPage.clickOnstarbucksAddBtn();
        waitFor(3);
        googleGiftCardPage.clickOnviewCart();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);

    }
    @Test
    public void testShopDunkinsGIftCard(){
        HomePage home=new HomePage(driver);
        GiftCardsPage giftCardsPage=new GiftCardsPage(driver);
        GoogleGiftCardPage googleGiftCardPage=new GoogleGiftCardPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfshopProductInMenuIsEnabled());
        home.clickOnshopProductInMenu();
        Assert.assertTrue(home.checkIfgiftCardsIsEnabled());
        waitFor(1);
        home.clickOngiftCards();
        Assert.assertTrue(home.checkIfshopGiftCardsIsEnabled());
        waitFor(1);
        home.clickOnshopGiftCards();
        giftCardsPage.clickOndunkinBrand();
        googleGiftCardPage.clickOndunkinAddForPickUpBtn();
        waitFor(3);
        googleGiftCardPage.clickOnviewCart();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);

    }
}

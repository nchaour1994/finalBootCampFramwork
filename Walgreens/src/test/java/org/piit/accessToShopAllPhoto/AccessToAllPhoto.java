package org.piit.accessToShopAllPhoto;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccessToAllPhoto extends commonApi {
    String titleHomePage = prop.getProperty("titleHomePage");
    String titleAllPhotoProduct = prop.getProperty("titleAllPhotoProduct");
   String titleMedicaidPage=prop.getProperty("titleMedicaidPage");
   String titleRxCoveragePage=prop.getProperty("titleRxCoveragePage");
   String titleMarketPalce=prop.getProperty("titleMarketPalce");


    @Test
    public void testAccessToAllPhoto() {
        HomePage home = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(), titleAllPhotoProduct);
    }

    @Test
    public void testAccessToMedicaid(){
        HomePage home = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        home.clickOnmedicaid();
        Assert.assertEquals(getTitle(),titleMedicaidPage);

    }
    @Test
    public void testAccessToRxCoverage(){
        HomePage home = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        home.clickOnrxCoverage();
        Assert.assertEquals(getTitle(),titleRxCoveragePage);

    }
    @Test
    public void testHealthInsurranceMarketPlace() {
        HomePage home = new HomePage(driver);
        HealthInssurancePage healthInssurancePage = new HealthInssurancePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        String parent = driver.getWindowHandle();
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.checkIfhealthInssuranceIsEnabled());
        home.clickOnhealthInssurance();
        Assert.assertEquals(getTitle(),titleMarketPalce);
    }
    @Test
    public  void testAccessShopLneses() {
        HomePage home = new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfcontactAndGlassesIsEnabled());
        wait.until(ExpectedConditions.visibilityOf(home.contactAndGlasses));
        home.clickOncontactAndGlasses();
        Assert.assertTrue(home.checkIfshopAllcontactAndGlassesIsEnabled());
        home.clickOnshopAllcontactAndGlasses();

    }
    @Test
    public void testAccessToKitchenAppliances() {
        HomePage home = new HomePage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(home.shopProductInMenu));
        Assert.assertTrue(home.checkIfshopProductInMenuIsEnabled());
        home.clickOnshopProductInMenu();
        wait.until(ExpectedConditions.visibilityOf(home.homeGoodInSubMenu));
        Assert.assertTrue(home.checkIfhomeGoodInSubMenuIsEnabled());
        home.clickOnhomeGoodInSubMenu();
        wait.until(ExpectedConditions.visibilityOf(home.smallHomeAppliances));
        Assert.assertTrue(home.checkIfsmallHomeAppliancesIsEnabled());
        home.clickOnsmallHomeAppliances();
        Assert.assertTrue(home.checkIfkitchenAppliancesIsEnabled());
        home.clickOnkitchenAppliances();
    }
    @Test
    public void testAccessForPickUpPage() {
        HomePage home = new HomePage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnpickUp();


    }



}
package org.piit.makeCanvasAndDecor;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class MakeCanvas extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleCanvasAndDecorPage=prop.getProperty("titleCanvasAndDecorPage");
    String titleWoodPanelPage=prop.getProperty("titleWoodPanelPage");
    String titleAllPhotoProduct=prop.getProperty("titleAllPhotoProduct");
    String titleCreateWoodPanelPage=prop.getProperty("titleCreateWoodPanelPage");


    @Test
    public void testChooseCanvas(){
        HomePage home =new HomePage(driver);
        CanvasAndDecorPage canvasAndDecor =new CanvasAndDecorPage(driver);
        WoodPanelPage woodPanelPage=new WoodPanelPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfcanvasAndDecorIsEnabled());
        home.clickOncanvasAndDecor();
        Assert.assertEquals(getTitle(),titleCanvasAndDecorPage);
        Assert.assertTrue(canvasAndDecor.checkIfwoodPanelIsEnabled());
        canvasAndDecor.clickOnwoodPanel();
        Assert.assertEquals(getTitle(),titleWoodPanelPage);
        woodPanelPage.clickOnsizePanel();
        Assert.assertTrue(woodPanelPage.checkIfcreateNowBtnIsEnabled());
        woodPanelPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateWoodPanelPage);


    }
    @Test
    public void testMakeCanvasFromShopAllPhotoPage() {
        HomePage home = new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage = new ShopAllPhotoPage(driver);
        WoodPanelPage woodPanelPage=new WoodPanelPage(driver);
        CanvasAndDecorPage canvasAndDecor =new CanvasAndDecorPage(driver);
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
        shopAllPhotoPage.hoverOncanvasAndDecor();
        shopAllPhotoPage.clickOnwoodPanel();
        Assert.assertTrue(canvasAndDecor.checkIfwoodPanelIsEnabled());
        canvasAndDecor.clickOnwoodPanel();
        Assert.assertEquals(getTitle(),titleWoodPanelPage);
        woodPanelPage.clickOnsizePanel();
        Assert.assertTrue(woodPanelPage.checkIfcreateNowBtnIsEnabled());
        woodPanelPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateWoodPanelPage);


    }
}

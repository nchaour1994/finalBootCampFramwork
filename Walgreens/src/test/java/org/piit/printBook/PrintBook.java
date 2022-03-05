package org.piit.printBook;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrintBook extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleAllPhotoProduct=prop.getProperty("titleAllPhotoProduct");
    String titlePrintBook=prop.getProperty("titlePrintBook");
    String titlePrintBookPage=prop.getProperty("titlePrintBookPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleSignInPage=prop.getProperty("titleSignInPage");

    @Test
    public void testPrintBook(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        PrintBookPage printBookPage=new PrintBookPage(driver);
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
        shopAllPhotoPage.hoverOnPrints();
        wait.until(ExpectedConditions.visibilityOf(shopAllPhotoPage.printBook));
        Assert.assertTrue(shopAllPhotoPage.checkIfprintBookIsDisplayed());
        shopAllPhotoPage.clickOnprintBook();
        Assert.assertEquals(getTitle(),titlePrintBookPage);
        printBookPage.clickOnsize();
        printBookPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),titlePrintBook);
    }

    @Test
    public void testPrintBookFromPhotoMenu(){
        HomePage home= new HomePage(driver);
        PhotoPrintingPage photoPrintingPage=new PhotoPrintingPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        PrintBookPage printBookPage=new PrintBookPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        wait.until(ExpectedConditions.visibilityOf(home.prints));
        home.clickOnprints();
        photoPrintingPage.clickOnprintBooks();
        Assert.assertEquals(getTitle(),titlePrintBookPage);
        printBookPage.clickOnsize();
        printBookPage.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),titlePrintBook);

    }


}

package org.piit.makeCalendar;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.CalendarDeskPage;
import org.piit.HomePage;
import org.piit.ShopAllPhotoPage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeCalendar extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleAllPhotoProduct=prop.getProperty("titleAllPhotoProduct");
    String titleDeskCalendarPage=prop.getProperty("titleDeskCalendarPage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleCreateCalendarPage=prop.getProperty("titleCreateCalendarPage");


    @Test
    public void testMakeCalendar(){
        HomePage home= new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage=new ShopAllPhotoPage(driver);
        CalendarDeskPage calendarDeskPage=new CalendarDeskPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        waitFor(1);
        Assert.assertTrue(home.checkIfshopAllProductInPhotoIsEnabled());
        home.clickOnshopAllProductInPhoto();
        Assert.assertEquals(getTitle(),titleAllPhotoProduct);
        Assert.assertTrue(shopAllPhotoPage.checkIfcalendarIsDisplayed());
        shopAllPhotoPage.hoverOncalendar();
        wait.until(ExpectedConditions.visibilityOf(shopAllPhotoPage.desk));
        Assert.assertTrue(shopAllPhotoPage.checkIFdeskIsDisolayed());
        shopAllPhotoPage.clickOndesk();
        Assert.assertEquals(getTitle(),titleDeskCalendarPage);
        calendarDeskPage.clickOntoghtherAlways();
        calendarDeskPage.clickOnsizeAndType();
        calendarDeskPage.clickOnstartingMonth();
        Assert.assertTrue(calendarDeskPage.checkIfmakeThisCalendarBtnIsEnabled());
        calendarDeskPage.clickOnmakeThisCalendarBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),titleCreateCalendarPage);


    }
    @Test
    public void testMakeCalendarFromPhotoMenu() {
        HomePage home = new HomePage(driver);
        ShopAllPhotoPage shopAllPhotoPage = new ShopAllPhotoPage(driver);
        CalendarDeskPage calendarDeskPage = new CalendarDeskPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        home.clickOncalendar();
        shopAllPhotoPage.clickOndeskTopCalendar();
        Assert.assertEquals(getTitle(),titleDeskCalendarPage);
        calendarDeskPage.clickOntoghtherAlways();
        calendarDeskPage.clickOnsizeAndType();
        calendarDeskPage.clickOnstartingMonth();
        Assert.assertTrue(calendarDeskPage.checkIfmakeThisCalendarBtnIsEnabled());
        calendarDeskPage.clickOnmakeThisCalendarBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),titleCreateCalendarPage);





    }
}

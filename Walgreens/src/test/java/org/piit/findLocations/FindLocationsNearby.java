package org.piit.findLocations;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.FindStorePage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class FindLocationsNearby extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleFindStorePage=prop.getProperty("titleFindStorePage");

     @Test
    public  void testFindLocations(){
         HomePage home= new HomePage(driver);
         Assert.assertEquals(getTitle(),titleHomePage);
         waitFor(3);
         Assert.assertTrue(home.checkIfarrowDownForStoreLocationIsEnabled());
         home.clickOnarrowDownForStoreLocation();
         home.typeOnsearchForLocationField();


    }
   @Test
    public void testFindLocationUsingMyLocation(){
        //find nearby locations using our location
        HomePage home= new HomePage(driver);
       Assert.assertEquals(getTitle(),titleHomePage);
        waitFor(3);
       Assert.assertTrue(home.checkIfarrowDownForStoreLocationIsEnabled());
        home.clickOnarrowDownForStoreLocation();
        waitFor(2);
        Assert.assertTrue(home.checkIfuseMyLocationBtnIsEnabled());
        home.clickOnuseMyLocationBtn();
        waitFor(8);

    }
   @Test
    public void testFindLocationFromMenu(){
        HomePage home= new HomePage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(home.findStoreInMenu));
        home.clickOnfindStoreInMenu();
        Assert.assertEquals(driver.getTitle(),titleFindStorePage);
        findStorePage.clickOnUpdateLocation();
        Assert.assertTrue(findStorePage.checkIflocationFieldIsDisplayed());
        findStorePage.typeOnlocationField();
    }
    @Test
    public void testFindLocationFromInformationPage(){
        HomePage home= new HomePage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOncovid19vaccineInformationIcon();


    }
    @Test
    public void testFindLocationFromHomePage(){
        HomePage home= new HomePage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnfindStore();
        Assert.assertEquals(driver.getTitle(),titleFindStorePage);
        findStorePage.clickOnUpdateLocation();
        Assert.assertTrue(findStorePage.checkIflocationFieldIsDisplayed());
        findStorePage.typeOnlocationField();
    }
}

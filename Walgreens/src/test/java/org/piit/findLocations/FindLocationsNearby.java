package org.piit.findLocations;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.FindStorePage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindLocationsNearby extends commonApi {


     @Test
    public  void TestfindLocations(){
        HomePage home= new HomePage(driver);
       Assert.assertTrue(home.arrowDownForStoreLocation.isEnabled());
       home.clickOnarrowDownForStoreLocation();

       home.typeOnsearchForLocationField();
       Assert.assertNotNull(home.searchForLocationField);

    }
   @Test
    public void TestfindLOcationUsingMyLocation(){
        //find nearby locations using our location
        HomePage home= new HomePage(driver);
        waitFor(3);
        Assert.assertTrue(home.arrowDownForStoreLocation.isEnabled());
        home.clickOnarrowDownForStoreLocation();
        waitFor(2);
        Assert.assertTrue(home.useMyLocationBtn.isEnabled());
        home.clickOnuseMyLocationBtn();
        waitFor(8);

    }
   @Test
    public void TestfindLocationFromMenu(){
        HomePage home= new HomePage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        Assert.assertEquals(driver.getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickONMenuBtn();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(home.findStoreInMenu));
        home.clickOnfindStoreInMenu();
        Assert.assertEquals(driver.getTitle(),"Store Locator | Walgreens");
        findStorePage.clickOnUpdateLocation();
        Assert.assertTrue(findStorePage.locationField.isDisplayed());
        findStorePage.typeOnlocationField();
    }
}

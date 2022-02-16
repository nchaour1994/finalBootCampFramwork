package org.piit.findLocations;

import base.commonApi;
import org.piit.FindStorePage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindLocationsNearby extends commonApi {


   //  @Test
    public  void findLocations(){
        HomePage home= new HomePage(driver);

       waitFor(3);
       Assert.assertTrue(home.arrowDownForStoreLocation.isEnabled());
       home.clickOnarrowDownForStoreLocation();
       waitFor(3);

       home.typeOnsearchForLocationField();
       Assert.assertNotNull(home.searchForLocationField);
         waitFor(5);
    }
  //  @Test
    public void findLOcationUsingMyLocation(){
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
    public void findLocationFromMenu(){
        HomePage home= new HomePage(driver);
        FindStorePage findStorePage=new FindStorePage(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOnfindStoreInMenu();
        findStorePage.clickOnUpdateLocation();
        waitFor(2);
        findStorePage.typeOnlocationField();
    }
}

package org.piit.acccessToCoupon;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessToCoupon extends commonApi {
     @Test
    public void TestaccessToCouponPage(){
        HomePage home= new HomePage(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfcouponOnMenuListIsEnabled());
        home.clickOncouponOnMenuList();


   }
}

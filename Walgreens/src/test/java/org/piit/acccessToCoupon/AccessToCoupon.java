package org.piit.acccessToCoupon;

import base.commonApi;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessToCoupon extends commonApi {
     @Test
    public void test10(){
        HomePage home= new HomePage(driver);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.couponOnMenuList.isEnabled());
        home.clickOncouponOnMenuList();


   }
}

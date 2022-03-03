package org.piit.acccessToCoupon;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccessToCoupon extends commonApi {
    String titleCouponPage=prop.getProperty("titleCouponPage");
     @Test
    public void TestaccessToCouponPage(){
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        HomePage home= new HomePage(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.couponOnMenuList));
        Assert.assertTrue(home.checkIfcouponOnMenuListIsEnabled());
        home.clickOncouponOnMenuList();
        Assert.assertEquals(getTitle(),titleCouponPage);





   }
}

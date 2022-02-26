package org.piit.viewMemberShip;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewMemberShip extends commonApi {


    @Test
    public void viewMemberShip(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        AarpMmeberShipPage aarpMmeberShipPage=new AarpMmeberShipPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickOnAccountBtn();
        waitFor(1);
        home.clickOnsignInBtnInAccountMenu();
        waitFor(1);
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        waitFor(2);
        home.clickOnAccountBtn();
        home.clickOnaccountHomeInAccountList();
        Assert.assertEquals(getTitle(),"Your Account | Walgreens");
        yourAccountPage.hoverOverOnmemberShip();
        yourAccountPage.clickOnaarpMemberShip();
        aarpMmeberShipPage.clickOnaddNowBt();


    }
}

package org.piit.viewBenefitsAndActivities;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class viewBenefits extends commonApi {

    @Test
    public void TestViewBenefits(){
        HomePage home =new HomePage(driver);
        MyWalgreensPage myWalgreensPage=new MyWalgreensPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnmyWalgreens();
        Assert.assertEquals(getTitle(),"myWalgreens");
        myWalgreensPage.clickOnjoinForFreeBtn();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),"Your Account | Walgreens");
        yourAccountPage.clickOnviewBenefits();
    }

    @Test
    public void TestViewActivity(){
        HomePage home =new HomePage(driver);
        MyWalgreensPage myWalgreensPage=new MyWalgreensPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnmyWalgreens();
        Assert.assertEquals(getTitle(),"myWalgreens");
        myWalgreensPage.clickOnjoinForFreeBtn();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),"Your Account | Walgreens");

        yourAccountPage.clickOnviewActivity();
    }
}

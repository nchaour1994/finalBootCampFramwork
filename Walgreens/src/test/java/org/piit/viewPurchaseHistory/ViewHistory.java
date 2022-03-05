package org.piit.viewPurchaseHistory;

import base.commonApi;
import org.piit.HomePage;
import org.piit.MyWalgreensPage;
import org.piit.SignInPage;
import org.piit.YourAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewHistory extends commonApi {

    @Test
    public void TestViewHistory(){
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
        yourAccountPage.hoverOverpurchasesInMenu();
        yourAccountPage.clickOnhistoryPurchseInSubMenuPurchase();
    }

    @Test
    public void TestViewHistoryFromAccountMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
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
        yourAccountPage.hoverOverpurchasesInMenu();
        yourAccountPage.clickOnhistoryPurchseInSubMenuPurchase();
    }

    @Test
    public void testViewHistoryFromMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnAccountMenuInDropDown();

        home.clickOnsingInBtnInMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnAccountMenuInDropDown();
        home.clickOnproductPurchaseHistoryInMenu();



    }
}

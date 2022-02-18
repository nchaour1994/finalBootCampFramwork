package org.piit.login;

import base.commonApi;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAccount extends commonApi {

    @Test
    public void TestLoginToMyAccountFromAccountMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickOnAccountBtn();
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(3);

    }
    @Test
    public void TestLoginToMyAccountFromMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickONMenuBtn();
        home.clickOnAccountMenuInDropDown();
        home.clickOnsingInBtnInMenu();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();


    }

}

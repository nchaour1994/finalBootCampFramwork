package org.piit.logout;

import base.commonApi;
import org.piit.CompleteYourAccountPage;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class Logout extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");

     @Test
    public void testLogoutFromMyAccount(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(3);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.checkIfsignOutBtnIsEnabled());
        home.clickOnsignOutBtn();

    }

    @Test
    public void testLogoutFromMenu(){
        HomePage home = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        waitFor(1);
        home.scrollTosignOutBtnInMenu();
        Assert.assertTrue(home.checkIfsignOutBtnIsEnabled());
        home.clickOnsignOutBtnInMenu();


    }
}

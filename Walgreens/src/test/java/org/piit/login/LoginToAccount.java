package org.piit.login;

import base.commonApi;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class LoginToAccount extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");


    @Test
    public void testLoginToMyAccountFromAccountMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(), titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();


    }
    @Test
    public void testLoginToMyAccountFromMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();


    }
   @Test
    public void testLoginToMyAccountWithWrongPassword(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeInvalidpassword();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        signInPage.printErrorMsg();



    }
    @Test
    public void testLoginToMyAccountWithWrongEmail(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeInvalidEmail();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        signInPage.printErrorMsg();



    }

}

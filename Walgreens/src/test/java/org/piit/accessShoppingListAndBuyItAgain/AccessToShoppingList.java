package org.piit.accessShoppingListAndBuyItAgain;

import base.commonApi;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class AccessToShoppingList extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email= prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");

    @Test
    public void testAccessToShoppingList(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals("john1899@gmail.com",email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals("John1899test",password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        home.clickOnshoppingList();

    }
    @Test
    public void testAccessToBuyItAgain(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfbuyItAgainBtnIsEnabled());
        home.clickOnbuyItAgain();


    }
    @Test
    public void testAcessToBuyItAgainFromMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfbuyitAgainInMenuIsEnabled());
        home.clickOnbuyitAgainInMenu();

    }
    @Test
    public void testAccessToShoppingListFromMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfshoppingListInMenuIsEnabled());
        home.clickOnshoppingListInMenu();

    }



}

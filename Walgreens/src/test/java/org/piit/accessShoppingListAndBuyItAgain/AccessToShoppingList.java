package org.piit.accessShoppingListAndBuyItAgain;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class AccessToShoppingList extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email= prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleShoppingListPage=prop.getProperty("titleShoppingListPage");
    String titleBuyItAgainPage = prop.getProperty("titleBuyItAgainPage");

    @Test
    public void testAccessToShoppingList(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.signInBtnInAccountMenu));
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.shoppingList));
        home.clickOnshoppingList();
        Assert.assertEquals(getTitle(),titleShoppingListPage);



    }
    @Test
    public void testAccessToBuyItAgain(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.signInBtnInAccountMenu));
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.buyItAgain));
        Assert.assertTrue(home.checkIfbuyItAgainBtnIsEnabled());
        home.clickOnbuyItAgain();
        Assert.assertEquals(getTitle(),titleBuyItAgainPage);



    }
    @Test
    public void testAcessToBuyItAgainFromMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.yourAccountInMenuDropDown));
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
        wait.until(ExpectedConditions.visibilityOf(home.yourAccountInMenuDropDown));
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfbuyitAgainInMenuIsEnabled());
        home.clickOnbuyitAgainInMenu();
        Assert.assertEquals(getTitle(),titleBuyItAgainPage);

    }
    @Test
    public void testAccessToShoppingListFromMenu(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.yourAccountInMenuDropDown));
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
        wait.until(ExpectedConditions.visibilityOf(home.yourAccountInMenuDropDown));
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfshoppingListInMenuIsEnabled());
        home.clickOnshoppingListInMenu();
        Assert.assertEquals(getTitle(),titleShoppingListPage);
    }



}

package org.piit.addQuantityInShoppingCart;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.ShoppingCartPage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class AddQuantity extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleShopingCart=prop.getProperty("titleShoppingCartPage");

    @Test
    public void testAccessShoppingCart(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.signInBtnInAccountMenu));
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        home.clickOnshoppingCart();
        Assert.assertEquals(getTitle(),titleShopingCart);
        Assert.assertTrue(shoppingCartPage.checkIfplusSignInFirstElementIsEnabled());
        shoppingCartPage.clickOnplusSignInFirstElement();
        shoppingCartPage.clickOnplusSignInSecondElement();
        Assert.assertEquals(getTitle(),titleShopingCart);






    }
}

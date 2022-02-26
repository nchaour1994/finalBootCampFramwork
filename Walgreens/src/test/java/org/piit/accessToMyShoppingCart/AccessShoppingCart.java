package org.piit.accessToMyShoppingCart;

import base.commonApi;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class AccessShoppingCart extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String titleCompleteAccountPage= prop.getProperty("titleCompleteAccountPage");
    String dob=prop.getProperty("dateOfBirth");
    String typeGender=prop.getProperty("gender");
    String myAdress=prop.getProperty("adress");
    String myCity=prop.getProperty("city");
    String myState=prop.getProperty("state");
    String mySecurityQuestion= prop.getProperty("securityQuestion");
    String securityQuestionAnswer=prop.getProperty("answerSecurity");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");


    @Test
    public void accessShoppingCart(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
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
        Assert.assertTrue(home.checkIfshoppingCartIsEnbled());
        home.clickOnshoppingCart();


    }
}

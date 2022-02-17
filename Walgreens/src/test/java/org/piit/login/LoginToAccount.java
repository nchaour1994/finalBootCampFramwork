package org.piit.login;

import base.commonApi;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.annotations.Test;

public class LoginToAccount extends commonApi {

   // @Test
    public void LoginToMyAccountFromAccountMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        home.clickOnAccountBtn();
        home.clickOnsignInBtnInAccountMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        waitFor(3);

    }
    @Test
    public void LoginToMyAccountFromMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOnAccountMenuInDropDown();
        waitFor(2);
        home.clickOnsingInBtnInMenu();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        waitFor(3);

    }

}

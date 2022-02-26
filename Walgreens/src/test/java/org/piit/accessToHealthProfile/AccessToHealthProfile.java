package org.piit.accessToHealthProfile;

import base.commonApi;
import org.piit.ConsentPage;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class AccessToHealthProfile extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String titleAccountPage= prop.getProperty("titleAccountPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");

    @Test
    public void accessToHealthProfile(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertTrue(consentPage.checkIfhealthProfileISEnabled());
        consentPage.clickOnhealthProfile();
        Assert.assertTrue(consentPage.checkIfsignInBtnIsEnabled());
        consentPage.clickOnsignInBtn();
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();

    }
    @Test
    public void accessToHealthgoals(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertTrue(consentPage.checkIfhealthProfileISEnabled());
        consentPage.clickOnhealthProfile();
        Assert.assertTrue(consentPage.checkIfsignInBtnIsEnabled());
        consentPage.clickOnsignInBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();
        consentPage.clickOnmyWalgreensHealthGoals();


    }
    @Test
    public void accessToMyAppointments(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertTrue(consentPage.checkIfhealthProfileISEnabled());
        consentPage.clickOnhealthProfile();
        Assert.assertTrue(consentPage.checkIfsignInBtnIsEnabled());
        consentPage.clickOnsignInBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();
        consentPage.clickOnappointments();



    }
}

package org.piit.accessToHealthProfile;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.ConsentPage;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class AccessToHealthProfile extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleConsentPage=prop.getProperty("titleConsentPage");
    String titleHealthGoalPage=prop.getProperty("titleHealthGoalPage");
    String titleAppointmentPage=prop.getProperty("titleAppointmentPage");

    @Test
    public void accessToHealthProfile(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertEquals(getTitle(),titleConsentPage);
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
        waitFor(3);
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();
        wait.until(ExpectedConditions.titleContains(titleConsentPage));
        Assert.assertEquals(getTitle(),titleConsentPage);


    }
    @Test
    public void accessToHealthgoals(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertEquals(getTitle(),titleConsentPage);
        Assert.assertTrue(consentPage.checkIfhealthProfileISEnabled());
        consentPage.clickOnhealthProfile();
        Assert.assertTrue(consentPage.checkIfsignInBtnIsEnabled());
        consentPage.clickOnsignInBtn();
        wait.until(ExpectedConditions.titleContains(titleSignInPage));
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
         waitFor(3);
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();
        consentPage.clickOnmyWalgreensHealthGoals();
        wait.until(ExpectedConditions.titleContains(titleHealthGoalPage));
        Assert.assertEquals(getTitle(),titleHealthGoalPage);


    }
    @Test
    public void accessToMyAppointments(){
        HomePage home= new HomePage(driver);
        ConsentPage consentPage=new ConsentPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        home.scrollTocreateHealthProfile();
        Assert.assertTrue(home.checkIfcreateHealthProfileIsEnabled());
        home.clickOncreateHealthProfile();
        Assert.assertTrue(consentPage.checkIfhealthProfileISEnabled());
        consentPage.clickOnhealthProfile();
        Assert.assertEquals(getTitle(),titleConsentPage);
        Assert.assertTrue(consentPage.checkIfsignInBtnIsEnabled());
        consentPage.clickOnsignInBtn();
        wait.until(ExpectedConditions.titleContains(titleSignInPage));
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        //wait.until(ExpectedConditions.titleContains(titleConsentPage));
        Assert.assertTrue(consentPage.checkIfhealthProfileActiveIsEnabled());
        consentPage.clickOnhealthProfileActive();
        consentPage.clickOnappointments();
        wait.until(ExpectedConditions.titleContains(titleAppointmentPage));
        Assert.assertEquals(getTitle(),titleAppointmentPage);

    }
}

package org.piit.joinMyWalgreens;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class JoinMyWalgreens extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String titleCompleteAccountPage= prop.getProperty("titleCompleteAccountPage");
    String dob=prop.getProperty("dateOfBirth");
    String myAdress=prop.getProperty("adress");
    String myCity=prop.getProperty("city");
    String securityQuestionAnswer=prop.getProperty("answerSecurity");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleMyWalgreensPage=prop.getProperty("titleMyWalgreensPage");
    String titleAccountPage=prop.getProperty("titleAccountPage");



    @Test
    public void testJoinMyWalgreens(){
        HomePage home =new HomePage(driver);
        MyWalgreensPage myWalgreensPage=new MyWalgreensPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        CompleteYourAccountPage completeYourAccountPage=new CompleteYourAccountPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnmyWalgreens();
        Assert.assertEquals(getTitle(),titleMyWalgreensPage);
        myWalgreensPage.clickOnjoinForFreeBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertEquals(getTitle(),titleAccountPage);
        yourAccountPage.clickOnjoinNowBtn();
        Assert.assertEquals(getTitle(),titleCompleteAccountPage);
        completeYourAccountPage.typeOndobField();
        Assert.assertEquals(completeYourAccountPage.getValueOfDob(),dob);
        completeYourAccountPage.selectfromgender();
        completeYourAccountPage.typeOnadress();
        Assert.assertEquals(completeYourAccountPage.getValueOfAdress(),myAdress);
        completeYourAccountPage.typeOncity();
        Assert.assertEquals(completeYourAccountPage.getValueOfcity(),myCity);
        completeYourAccountPage.selectfromstate();
        completeYourAccountPage.selectfromsecurityQuestion();
        completeYourAccountPage.typeOnanswerSecurityQuestion();
        Assert.assertEquals(completeYourAccountPage.getValueOfanswerSecurityQuestion(),securityQuestionAnswer);


    }
}

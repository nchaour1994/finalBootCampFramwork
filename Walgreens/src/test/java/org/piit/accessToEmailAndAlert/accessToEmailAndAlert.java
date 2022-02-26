package org.piit.accessToEmailAndAlert;

import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class accessToEmailAndAlert extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String titleAccountPage= prop.getProperty("titleAccountPage");
    @Test
    public void testAccessToEmailAndAlert(){
        HomePage home =new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        AarpMmeberShipPage aarpMmeberShipPage=new AarpMmeberShipPage(driver);
        EmailAndAlertPage emailAndAlertPage=new EmailAndAlertPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        waitFor(1);
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.chekcIfaccountHomeInAccountListIsEnabled());
        home.clickOnaccountHomeInAccountList();
        Assert.assertEquals(getTitle(),titleAccountPage);
        Assert.assertTrue(yourAccountPage.checkIfemailAndAlertIsEnabled());
        yourAccountPage.clickOnemailAndAlert();
        emailAndAlertPage.clickOnhelthcareClinicCheckbox();
        Assert.assertTrue(emailAndAlertPage.checkIfhelthcareClinicCheckboxIsSelected());
        emailAndAlertPage.clickOndigitalReceiptCheckbox();
    }
}

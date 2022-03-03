package org.piit.accessToEmailAndAlert;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
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
        EmailAndAlertPage emailAndAlertPage=new EmailAndAlertPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.signInBtnInAccountMenu));
        Assert.assertTrue(home.checkIfsignInBtnInAccountMenuIsEnabled());
        home.clickOnsignInBtnInAccountMenu();
        wait.until(ExpectedConditions.titleContains(titleSignInPage));
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        wait.until(ExpectedConditions.elementToBeClickable(home.accountBtn));
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.accountHomeInAccountList));
        Assert.assertTrue(home.chekcIfaccountHomeInAccountListIsEnabled());
        home.clickOnaccountHomeInAccountList();
        wait.until(ExpectedConditions.titleContains(titleAccountPage));
        Assert.assertEquals(getTitle(),titleAccountPage);
        Assert.assertTrue(yourAccountPage.checkIfemailAndAlertIsEnabled());
        yourAccountPage.clickOnemailAndAlert();
        emailAndAlertPage.clickOnhelthcareClinicCheckbox();
        Assert.assertTrue(emailAndAlertPage.checkIfhelthcareClinicCheckboxIsSelected());
        emailAndAlertPage.clickOndigitalReceiptCheckbox();
        Assert.assertTrue(emailAndAlertPage.checkIfdigitalReceiptCheckboxIsSelected());

    }
}

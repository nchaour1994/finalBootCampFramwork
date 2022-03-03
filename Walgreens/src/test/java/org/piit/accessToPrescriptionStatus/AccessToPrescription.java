package org.piit.accessToPrescriptionStatus;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.CompleteYourAccountPage;
import org.piit.HomePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class AccessToPrescription extends commonApi {

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
    public void testAccessToPrescriptionStatus() {
        HomePage home = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        CompleteYourAccountPage completeYourAccountPage = new CompleteYourAccountPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.yourAccountInMenuDropDown));
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfsingInBtnInMenuIsEnabled());
        home.clickOnsingInBtnInMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.checkIfSignInBtnIsEnabled());
        signInPage.clickOnsignInBtn();
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.yourAccountInMenuDropDown));
        Assert.assertTrue(home.checkIfyourAccountInMenuDropDownIsEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.checkIfprescriptionstatusIsEnabled());
        home.clickOnprescriptionstatus();
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
    @Test
    public void testAccessToPrescriptionStatusFromAccountMenu(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        CompleteYourAccountPage completeYourAccountPage = new CompleteYourAccountPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfAccountBtnIsEnabled());
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
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.prescriptionStatusINAccountMenu));
        home.clickOnprescriptionStatusINAccountMenu();
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

package org.piit.updateAccountInfo;

import base.commonApi;
import org.piit.HomePage;
import org.piit.PersonalInformationPage;
import org.piit.SignInPage;
import org.piit.YourAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateAccountInformations extends commonApi {


    @Test
    public void TestupdateMyAccountInformations(){
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        PersonalInformationPage personalInformationPage=new PersonalInformationPage(driver);
        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.signInBtnInAccountMenu.isEnabled());
        home.clickOnsignInBtnInAccountMenu();
        waitFor(2);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(1);
        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.accountHomeInAccountList.isEnabled());
        home.clickOnaccountHomeInAccountList();
        Assert.assertTrue(yourAccountPage.profileBtn.isDisplayed());
        yourAccountPage.hoverOverOnprofileBtn();
        waitFor(1);
        Assert.assertTrue(yourAccountPage.personalInformationInProfile.isDisplayed());
        yourAccountPage.clickOnpersonalInformationInProfile();
        Assert.assertTrue(personalInformationPage.editBtn.isEnabled());
        personalInformationPage.clickOneditBtn();
        personalInformationPage.typeOnadressFieldInMyAccount();

    }
}

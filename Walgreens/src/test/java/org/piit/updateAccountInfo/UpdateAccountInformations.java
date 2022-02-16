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
    public void updateMyAccountInformations(){
       // HomePage home= PageFactory.initElements(driver, HomePage.class);
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        YourAccountPage yourAccountPage=new YourAccountPage(driver);
        PersonalInformationPage personalInformationPage=new PersonalInformationPage(driver);

        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        waitFor(3);
        Assert.assertTrue(home.signInBtnInAccountMenu.isEnabled());
        home.clickOnsignInBtnInAccountMenu();
        waitFor(3);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(8);
        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        waitFor(2);
        Assert.assertTrue(home.accountHomeInAccountList.isEnabled());
        home.clickOnaccountHomeInAccountList();
        Assert.assertTrue(yourAccountPage.profileBtn.isDisplayed());
        yourAccountPage.hoverOverOnprofileBtn();
        waitFor(5);
        Assert.assertTrue(yourAccountPage.personalInformationInProfile.isDisplayed());
        yourAccountPage.clickOnpersonalInformationInProfile();
        waitFor(5);
        Assert.assertTrue(personalInformationPage.editBtn.isEnabled());
        personalInformationPage.clickOneditBtn();
        waitFor(5);
        personalInformationPage.typeOnadressFieldInMyAccount();

    }
}

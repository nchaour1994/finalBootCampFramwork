package org.piit.registration;

import base.commonApi;
import org.openqa.selenium.WebElement;
import org.piit.HomePage;
import org.piit.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends commonApi {

    @Test
    public void createAnAccount(){
         HomePage home=new HomePage(driver);
        RegisterPage resiterPage=new RegisterPage(driver);
        // HomePage home= PageFactory.initElements(driver, HomePage.class);
        WebElement expected=home.accountBtn;
        Assert.assertTrue(expected.isEnabled());
        home.clickOnAccountBtn();
        waitFor(2);
        Assert.assertTrue(home.registerBtn.isEnabled());
        home.clickOnRegisterBtn();
        waitFor(2);
        Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
        resiterPage.typeOnFirstNameField();
        waitFor(2);
        resiterPage.typeOnLastNameField();
        resiterPage.typeOnEmailField();
        resiterPage.typeOnPasswordField();
        resiterPage.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(resiterPage.checkboxLinkMyAcoount.isSelected());
        waitFor(3);
//       Actions action= new Actions(driver);
//       action.moveToElement(home.phoneNumberField).sendKeys("32478959").build().perform();
        type(resiterPage.phoneNumberField, "3478974599");
        waitFor(3);
        resiterPage.typeOnzipCodeField();
        resiterPage.flagCheckBoxOver16();
        Assert.assertTrue(resiterPage.checkBoxOver16.isSelected());
        resiterPage.flagCheckBoxAgreement();
        Assert.assertTrue(resiterPage.checkBoxAgreement.isSelected());
        waitFor(10);
    }
     @Test
    public void createAnAccountFromMenu(){
        HomePage home=new HomePage(driver);
        RegisterPage resiterPage=new RegisterPage(driver);
        waitFor(1);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.yourAccountInMenuDropDown.isEnabled());
        home.clickOnAccountMenuInDropDown();
        waitFor(1);
        Assert.assertTrue(home.registerInYourAccountSubMenu.isEnabled());
        home.clickOnregisterInYourAccountSubMenu();
        Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
        resiterPage.typeOnFirstNameField();
        waitFor(2);
        resiterPage.typeOnLastNameField();
        resiterPage.typeOnEmailField();
        resiterPage.typeOnPasswordField();
        resiterPage.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(resiterPage.checkboxLinkMyAcoount.isSelected());
        waitFor(3);
        type(resiterPage.phoneNumberField, "3478974599");
        waitFor(3);
        resiterPage.typeOnzipCodeField();
        resiterPage.flagCheckBoxOver16();
        Assert.assertTrue(resiterPage.checkBoxOver16.isSelected());
        resiterPage.flagCheckBoxAgreement();
        Assert.assertTrue(resiterPage.checkBoxAgreement.isSelected());
        waitFor(10);

    }
}

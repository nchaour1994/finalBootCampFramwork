package org.piit.registration;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.piit.HomePage;
import org.piit.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends commonApi {

    @Test
    public void TestcreateAnAccount(){
         HomePage home=new HomePage(driver);
        RegisterPage resiterPage=new RegisterPage(driver);
        WebElement expected=home.accountBtn;
        Assert.assertTrue(expected.isEnabled());
        home.clickOnAccountBtn();
        Assert.assertTrue(home.registerBtn.isEnabled());
        home.clickOnRegisterBtn();
        Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
        resiterPage.typeOnFirstNameField();
        resiterPage.typeOnLastNameField();
        resiterPage.typeOnEmailField();
        resiterPage.typeOnPasswordField();
        resiterPage.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(resiterPage.checkboxLinkMyAcoount.isSelected());
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].value='3478974566';",resiterPage.phoneNumberField);
       // type(resiterPage.phoneNumberField, "3478974599");
        resiterPage.typeOnzipCodeField();
        resiterPage.flagCheckBoxOver16();
        Assert.assertTrue(resiterPage.checkBoxOver16.isSelected());
        resiterPage.flagCheckBoxAgreement();
        Assert.assertTrue(resiterPage.checkBoxAgreement.isSelected());

    }
     @Test
    public void TestcreateAnAccountFromMenu(){
        HomePage home=new HomePage(driver);
        RegisterPage resiterPage=new RegisterPage(driver);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.yourAccountInMenuDropDown.isEnabled());
        home.clickOnAccountMenuInDropDown();
        Assert.assertTrue(home.registerInYourAccountSubMenu.isEnabled());
        waitFor(1);
        home.clickOnregisterInYourAccountSubMenu();
        Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
        resiterPage.typeOnFirstNameField();
        resiterPage.typeOnLastNameField();
        resiterPage.typeOnEmailField();
        resiterPage.typeOnPasswordField();
        resiterPage.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(resiterPage.checkboxLinkMyAcoount.isSelected());
        type(resiterPage.phoneNumberField, "3478974599");
        resiterPage.typeOnzipCodeField();
        resiterPage.flagCheckBoxOver16();
        Assert.assertTrue(resiterPage.checkBoxOver16.isSelected());
        resiterPage.flagCheckBoxAgreement();
        Assert.assertTrue(resiterPage.checkBoxAgreement.isSelected());


    }
}

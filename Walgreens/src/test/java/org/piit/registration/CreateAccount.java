package org.piit.registration;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.HomePage;
import org.piit.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount extends commonApi {
    String titleCreateAccountPage=prop.getProperty("titleCreateAccountPage");
    String name=prop.getProperty("name");
    String lastName=prop.getProperty("lastName");

    @Test
    public void testCreateAnAccount(){
         HomePage home=new HomePage(driver);
        RegisterPage registerPage=new RegisterPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement expected=home.accountBtn;
        Assert.assertTrue(expected.isEnabled());
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.registerBtn));
        Assert.assertTrue(home.registerBtn.isEnabled());
        home.clickOnRegisterBtn();
        Assert.assertEquals(driver.getTitle(),titleCreateAccountPage);
        registerPage.typeOnFirstNameField();
        Assert.assertEquals(registerPage.getValueOfName(),name);
        registerPage.typeOnLastNameField();
        Assert.assertEquals(registerPage.getValueOfLastName(),lastName);
        registerPage.typeOnEmailField();
        registerPage.typeOnPasswordField();
        registerPage.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(registerPage.checkboxLinkMyAcoount.isSelected());
        JavascriptExecutor jse = ((JavascriptExecutor)driver);
        jse.executeScript("arguments[0].value='3478974566';",registerPage.phoneNumberField);
       // type(resiterPage.phoneNumberField, "3478974599");
        registerPage.typeOnzipCodeField();
        registerPage.flagCheckBoxOver16();
        Assert.assertTrue(registerPage.checkBoxOver16.isSelected());
        registerPage.flagCheckBoxAgreement();
        Assert.assertTrue(registerPage.checkBoxAgreement.isSelected());

    }
     @Test
    public void testCreateAnAccountFromMenu(){
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
        Assert.assertEquals(driver.getTitle(),titleCreateAccountPage);
        resiterPage.typeOnFirstNameField();
        Assert.assertEquals(resiterPage.getValueOfName(),name);
         resiterPage.typeOnLastNameField();
        Assert.assertEquals(resiterPage.getValueOfLastName(),lastName);
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

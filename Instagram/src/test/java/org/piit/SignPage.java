package org.piit;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.tmp.AssertEqualsTest;

public class SignPage extends commonApi{
     //@Test
    public void test01(){
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Instragram  user can access  Validation with valid  credential
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}

   // @Test
    public void test02(){SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //save your login info button
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        waitFor(4);}
    //@Test
    public void test03(){SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //notifications button
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);}
     //@Test
    public void test04(){
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Wrong Password
        sign.enterEmail();
        sign.enterWrongPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);}
    //@Test
    public void test05(){
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Wrong email
        sign.enterWrongEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}
}

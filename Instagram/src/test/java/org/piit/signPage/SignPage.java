package org.piit.signPage;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.tmp.AssertEqualsTest;

public class SignPage extends commonApi{
  //   @Test
    public void LoginWithValidCresential(){
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}

   // @Test
    public void SaveLogin(){SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        waitFor(4);}
   //@Test
    public void NotificationButton(){SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);}
   // @Test
    public void WrongPassword(){
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterWrongPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);}
  //  @Test
    public void WrongEmail(){
        SignInPage sign = new SignInPage(driver);
        sign.enterWrongEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}
}

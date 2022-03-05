package org.piit.signPage;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.tmp.AssertEqualsTest;
//3
public class SignPage extends commonApi{
     @Test
    public void loginWithValidCresential(){
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}

  @Test
    public void wrongPassword(){
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterWrongPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);}
    @Test
    public void wrongEmail(){
        SignInPage sign = new SignInPage(driver);
        sign.enterWrongEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);}
}

package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
//2
public class StoreEmail extends commonApi{
   @Test
    public void appStore(){
        StoreEmails storeEmails=new StoreEmails(driver);
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        storeEmails.enterStoreEmail();
        storeEmails.enterStorePassword();
       Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
       Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
       Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        waitFor(4);
        profile.clickApp();
        waitFor(4);}
      @Test
    public void googlePlay(){
        HomePage home = new HomePage(driver);
        StoreEmails storeEmails=new StoreEmails(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        storeEmails.enterStoreEmail();
        storeEmails.enterStorePassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
          Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
          Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        waitFor(4);
        profile.clickGoogle();
        waitFor(4);}
}

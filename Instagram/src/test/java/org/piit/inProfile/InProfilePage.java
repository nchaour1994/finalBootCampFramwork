package org.piit.inProfile;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
///5
public class InProfilePage extends commonApi{
    @Test
    public void seeFollowers(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Saifuddin Haque (@saihaq170) • Instagram photos and videos");
        profile.onFollower();
        waitFor(4);}
    @Test
    public void seeFollowing(){HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Saifuddin Haque (@saihaq170) • Instagram photos and videos");
        profile.onFollowing();
        waitFor(4);}
     @Test
    public void clickProfile(){HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSwitch();
        waitFor(4);}

     @Test
    public void tagged(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        waitFor(4);
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Saifuddin Haque (@saihaq170) • Instagram photos and videos");
        profile.clickTagged();
        waitFor(4);}
     @Test
    public void post(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        waitFor(4);
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Saifuddin Haque (@saihaq170) • Instagram photos and videos");
        profile.clickPost();
        waitFor(4);}


}

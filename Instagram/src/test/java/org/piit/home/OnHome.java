package org.piit.home;
import base.commonApi;
import org.piit.HomePage;
import org.piit.ProfilePage;
import org.piit.SaveLoginNotNow;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

///////6
public class OnHome extends commonApi {

    @Test
    public void testProfile(){HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        profile.onProfile();
        waitFor(2);}
    @Test
    public void saved() {
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin = new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.saved();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(), "Saifuddin Haque (@saihaq170) • Instagram photos and videos");
    }
    @Test
    public void settings(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");}

    @Test
    public void seeAll() {
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.seaAll();
        waitFor(8);
        Assert.assertEquals(driver.getTitle(), "Instagram");
    }
   @Test
    public void changeProfilePic(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        home.changeProfilePhoto();
        waitFor(4);

    }
    @Test
    public void clickLogout(){ HomePage home = new HomePage(driver);
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
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onLogOut();
        waitFor(4);}
}

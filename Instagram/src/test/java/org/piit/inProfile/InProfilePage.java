package org.piit.inProfile;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.HomePage;
import org.piit.ProfilePage;
import org.piit.ProfileSelections;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
///9
public class InProfilePage extends commonApi{
    //@Test
    public void SeeFollowers(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.onFollower();
        waitFor(4);}
    //@Test
    public void SeeFollowing(){HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(8);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.onFollowing();
        waitFor(4);}
    // @Test
    public void ClickProfile(){HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(8);
        home.onSwitch();
        waitFor(4);}
    // @Test
    public void ClickLogout(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(8);
        home.onLogOut();
        waitFor(4);}
    //  @Test
    public void ClickInstagram() {
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(2);
        home.instagram();
        waitFor(2);
    }
    //  @Test
    public void Tagged(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.clickTagged();
        waitFor(4);}
    //  @Test
    public void Post(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.clickPost();
        waitFor(4);}
    //@Test
    public void AppStore(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.clickApp();
        waitFor(4);}
    //@Test
    public void GooglePlay(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Probal (@probalshela) • Instagram photos and videos");
        profile.clickGoogle();
        waitFor(4);}

}

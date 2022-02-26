package org.piit.setting;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
////15
public class TestSettingPages extends commonApi {
  //  @Test
    public void TestMeta() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        waitFor(4);
        settings.changePasswords();
        waitFor(4);
        settings.clickForgot();
         waitFor(4);}
   // @Test
    public void TestAppsandWebsites(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        home.onsettings();
        settings.clickAppWebsite();
        waitFor(4);
        settings.clickExpired();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
    //@Test
    public void TestAppsRemoved(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        home.onsettings();
        settings.clickAppWebsite();
        waitFor(4);
        settings.clickExpired();
        waitFor(4);
        settings.clickRemoved();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
    // @Test
    public void TestEmailandSMS(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickEmailSMS();
        waitFor(3);
        settings.clickProductEmail();
        waitFor(4);
        settings.clickReminder();
        waitFor(4);}
    // @Test
    public void TestEmailsandSMS2(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickEmailSMS();
        waitFor(3);
        settings.clickFeedback();
        waitFor(4);
        settings.clickNewEmails();
        waitFor(4);}
    // @Test
    public void TestEmailsandSMS3(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickEmailSMS();
        waitFor(3);
        settings.clickFeedback();
        waitFor(4);
        settings.clickShopping();
        waitFor(4);
        settings.clickShoppingEmails();
        waitFor(4);}
    // @Test
    public void PushNotifications() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickFromPeople();
        waitFor(4);
        settings.clickReminderOff();
        waitFor(4);
    }
    //@Test
    public void PushNotificationsTwo() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickFromPeople();
        waitFor(4);
        settings.clickReminderOff();
        waitFor(4);
        settings.clickCommentsOff();
        waitFor(4);}
   // @Test
    public void TestGender() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        waitFor(4);
        settings.clickGender();
        waitFor(3);}
    // @Test
    public void ManageContacts() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickManageContacts();
        waitFor(4);}
    // @Test
    public void Privacy() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickPrivate();
        waitFor(4);
        settings.clickActivityStatus();
        waitFor(4);}
    //@Test
    public void Privacy2() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickNoOne();
        waitFor(4);
        settings.clickHides();
        waitFor(4);
        settings.clickAccountData();}
    //@Test
    public void TestLoginActivity() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickLoginActivity();
        waitFor(4);
        settings.clickWasNot();
        waitFor(4);
        settings.clickNotNow();
        waitFor(4);}
    // @Test
    public void TestEmailInstagram() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickEmailsInstagram();
        waitFor(4);
        settings.clickOthers();
        waitFor(4);}
    @Test
    public void TestHelp() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickHelp();
        waitFor(4);}
    @Test
    public void TestProfessional() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickProfessionalAccount();
        waitFor(4);}
    }

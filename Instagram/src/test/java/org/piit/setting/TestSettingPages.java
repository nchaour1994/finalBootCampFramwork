package org.piit.setting;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
////28
public class TestSettingPages extends commonApi {
 //  @Test
    public void testChangePassword() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
       Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
       Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        waitFor(4);
       Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
        settings.changePasswords();
        waitFor(4);
        settings.clickForgot();
        waitFor(4);}
  // @Test
    public void testAppsandWebsites(){SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        settings.clickAppWebsite();
        waitFor(4);
        settings.clickExpired();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
   // @Test
    public void testAppsRemoved(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        settings.clickAppWebsite();
        waitFor(4);
        settings.clickExpired();
        waitFor(4);
        settings.clickRemoved();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
  //   @Test
    public void testEmailandSMS(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.onsettings();
        settings.clickEmailSMS();
        waitFor(3);
        settings.clickProductEmail();
        waitFor(4);
        settings.clickReminder();
        waitFor(4);}
     @Test
    public void testEmailsandSMS2(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
         Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onsettings();
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
        settings.clickEmailSMS();
        waitFor(3);
        settings.clickFeedback();
        waitFor(4);
        settings.clickNewEmails();
        waitFor(4);}
  //   @Test
    public void testEmailsandSMS3(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
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
 //    @Test
    public void pushNotifications() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickFromPeople();
        waitFor(4);
        settings.clickReminderOff();
        waitFor(4);
    }
  //  @Test
    public void pushNotificationsTwo() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
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
  //  @Test
    public void pushNotificationsThree() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickCommentLikesoff();
        waitFor(4);
        settings.clickLikesCommentPhotosOff();
        waitFor(4);
        settings.clickCommentsOff();
        waitFor(4);}
  //  @Test
    public void pushNotificationsFour() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickLikesCommentsPhotosFromEveryone();
        waitFor(4);
        settings.clickLikesCommentPhotosOff();
        waitFor(4);
        settings.clickCommentLikesoff();
        waitFor(4);}
    //@Test
    public void pushNotificationsFive() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickLikesCommentsPhotosFromEveryone();
        waitFor(4);
        settings.clickAcceptedFollowRequests();
        waitFor(4);
        settings.clickAcceptedFollowRequestsOff();
        waitFor(4);
    }
   // @Test
    public void pushNotificationsSix() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickInstagramDirectRequests();
        waitFor(4);
        settings.clickInstagramDirect();
        waitFor(4);}
  //  @Test
    public void pushNotificationsEight() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickLikesCommentsPhotosFromEveryone();
        waitFor(4);
        settings.clickCommentLikesoff();
        waitFor(4);
        settings.clickLiveVideos();
        waitFor(4);
        settings.clickInstagramDirectRequests();}
  //  @Test
    public void pushNotificationsSeven() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPushNotification();
        waitFor(4);
        settings.clickFindPostsStories();
        waitFor(4);
        settings.clickVideoViewCounts();
        waitFor(4);
        settings.clickSupportRequests();
        waitFor(4);}
  //  @Test
    public void testGender() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        waitFor(4);
        settings.clickGender();
        waitFor(3);}
  //   @Test
    public void manageContacts() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickManageContacts();
        waitFor(4);}
 //    @Test
    public void privacy() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickPrivate();
        waitFor(4);
        settings.clickActivityStatus();
        waitFor(4);}
  //  @Test
    public void privacy2() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
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
  //  @Test
    public void privacySecurity() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickStorySharing();
        waitFor(4);
        settings.clickEditCommentingSetting();
        waitFor(4);}
   // @Test
    public void DataDownload() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickDataDownload();
        waitFor(4);
        settings.clickDataDownloadNext();
        waitFor(4);
    }
   // @Test
    public void PrivacyHelp() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickPrivacySecurityHelp();
        waitFor(4);
        settings.clickAgeRequirements();
        waitFor(4);
    }
    //@Test
    public void PrivacyHelp2() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickPrivacySecurityHelp();
        waitFor(4);
        settings.clickLocationSharing();
        waitFor(4);
    }
   // @Test
    public void privacySecurity1() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        home.onsettings();
        settings.clickPrivacySecurity();
        waitFor(4);
        settings.clickPhotosOfYouManually();
        waitFor(4);
    }
 //   @Test
    public void testLoginActivity() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickLoginActivity();
        waitFor(4);
        settings.clickWasNot();
        waitFor(4);
        settings.clickNotNow();
        waitFor(4);}
   //  @Test
    public void testEmailInstagram() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickEmailsInstagram();
        waitFor(4);
        settings.clickOthers();
        waitFor(4);}
  //  @Test
    public void testHelp() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickHelp();
        waitFor(4);}
  //  @Test
    public void testHelpReport() {
        SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickHelp();
        waitFor(4);
        settings.clickSupportsRequests();
        waitFor(3);
         settings.clickHelpReport();
          waitFor(3);}
 //   @Test
    public void testProfessional() {
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        home.onsettings();
        settings.clickProfessionalAccount();
        waitFor(4);}
    }

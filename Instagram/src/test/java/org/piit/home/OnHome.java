package org.piit.home;

import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.HomePage;
import org.piit.ProfilePage;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;
///////13
public class OnHome extends commonApi {
  //  @Test
    public void Activity(){
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onActivity();
        waitFor(8);}
   //  @Test
    public void Search(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSearch();
        waitFor(8);}
   // @Test
    public void SearchFollower(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSearch();
        waitFor(8);
       home.clickAngelinasFollower();
       waitFor(5);}
   // @Test
    public void SearchFollowing(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSearch();
        waitFor(8);
        home.clickAngelinasFollowing();
        waitFor(5);}
   // @Test
    public void AngellinasPost(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSearch();
        waitFor(8);
        home.clickAngelinasPost();
        waitFor(5);}
   // @Test
    public void TestProfile(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(8);
        profile.onProfile();
        waitFor(4);

    }
  //  @Test
    public void Saved(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(8);
        home.saved();
        waitFor(4);}
    //@Test
    public void Settings(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(4);
        home.onsettings();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
        }
  //  @Test
    public void TestPolygonButton(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.onPolygon();
        waitFor(4);}
   // @Test
    public void TestAdd(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.onAdd();
        waitFor(4);}
   // @Test
    public void TestSendMessage(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(5);
        home.sendMessage();
        waitFor(8);}

  //  @Test
    public void SeeAll() {
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(5);
        home.seaAll();
        waitFor(8);
    }
    @Test
    public void ChangeProfilePic(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(4);
        home.onsettings();
        waitFor(4);
        home.changeProfilePhoto();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
    }
}

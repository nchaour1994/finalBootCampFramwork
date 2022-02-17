package org.piit;

import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnHome extends commonApi {
    //@Test
    public void test01(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Activity
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        waitFor(4);
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.onActivity();
        waitFor(8);}
    // @Test
    public void test02(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //search
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.onSearch();
        waitFor(8);}
    //@Test
    public void test03(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        //Profile
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
   // @Test
    public void test04(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        //Profile
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(8);
        profile.Saved();
        waitFor(4);}
    //@Test
    public void test05(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        //Settings
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(4);
        profile.onsettings();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
        }
   // @Test
    public void test06(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Polygon
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.onPolygon();
        waitFor(4);}
   // @Test
    public void test07(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //Add
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.onAdd();
        waitFor(4);}
    @Test
    public void test08(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //send message
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(5);
        home.SendMessage();
        waitFor(8);}
   // @Test
    public void test09(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        //see all suggestions
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(5);
        home.SeaAll();
        waitFor(8);}
   // @Test
    public void test10(){HomePage home = PageFactory.initElements(driver,HomePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        //Change Profile Pic
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        home.inProfile();
        waitFor(4);
        profile.onsettings();
        waitFor(4);
        home.changeProfilePhoto();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Edit Profile • Instagram");
    }
}

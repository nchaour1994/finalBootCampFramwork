package org.piit;
import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
public class InProfilePage extends commonApi{
    //@Test
    public void test01(){
        ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        HomePage home = PageFactory.initElements(driver,HomePage.class);
        //Followers
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
        profile.onFollower();
        waitFor(4);}
   // @Test
    public void test2(){ ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        HomePage home = PageFactory.initElements(driver,HomePage.class);
        //Following
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
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
    public void test3(){ ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        HomePage home = PageFactory.initElements(driver,HomePage.class);
        //Post
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(8);
        profile.onSwitch();
        waitFor(4);}
  //  @Test
    public void test4(){ ProfilePage profile = PageFactory.initElements(driver,ProfilePage.class);
        SignInPage sign = PageFactory.initElements(driver,SignInPage.class);
        HomePage home = PageFactory.initElements(driver,HomePage.class);
        //logout
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(2);
        home.inProfile();
        waitFor(8);
        profile.onLogOut();
        waitFor(4);}
    //@Test
    public void test5() {
        ProfilePage profile = PageFactory.initElements(driver, ProfilePage.class);
        SignInPage sign = PageFactory.initElements(driver, SignInPage.class);
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //click ins
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
        home.Instagram();
        waitFor(2);
    }

}

package org.piit.logo;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//1
public class Logo extends commonApi{
    @Test
    public void clickInstagram() {
        HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        InstagramLogo instagramLogo=new InstagramLogo(driver);
        ProfilePage profile = new ProfilePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(2);
        profile.onProfile();
        waitFor(2);
       instagramLogo.instagram();
        waitFor(2);
    }
}

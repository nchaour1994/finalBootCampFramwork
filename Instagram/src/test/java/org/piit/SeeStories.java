package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SeeStories extends commonApi{
    @Test
    public void seeStoryAfterOneAnother(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SeeStory seeStories=new SeeStory(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        seeStories.seeFirstSnap();
        seeStories.seeSecondSnap();
        waitFor(3);}
    @Test
    public void seeStoryThenProfile(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SeeStory seeStories=new SeeStory(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        seeStories.seeSecondSnap();
        seeStories.seeFirstSnapThanProfile();
        waitFor(3);}
}

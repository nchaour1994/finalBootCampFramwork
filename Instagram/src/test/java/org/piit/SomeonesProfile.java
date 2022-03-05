package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert;
//10
public class SomeonesProfile extends commonApi {
   @Test
    public void searchFollower(){
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);
        someonesAccount.clickAngelinasFollower();
        waitFor(5);}
     @Test
    public void searchFollowing(){
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);
       someonesAccount.clickAngelinasFollowing();
        waitFor(5);}
     @Test
    public void angelinasPost() {
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount = new CheckOnSomeonesAccount(driver);
        SaveLoginNotNow saveLogin = new SaveLoginNotNow(driver);
        Search searchs = new Search(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        searchs.onSearch();
        waitFor(8);
        someonesAccount.clickAngelinasPost();
        waitFor(5);
    }
    @Test
    public void angelinasTagged(){ SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        Search searchs = new Search(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);
        profile.clickTagged();
        waitFor(4);
        }
    @Test
    public void angelinasVideos(){ SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        Search searchs = new Search(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(4);
        someonesAccount.clickAngelinasVideos();
        waitFor(5);
        }
    @Test
    public void angelinasArrow() {
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount = new CheckOnSomeonesAccount(driver);
        SaveLoginNotNow saveLogin = new SaveLoginNotNow(driver);
        Search searchs = new Search(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        searchs.onSearch();
        waitFor(4);
        someonesAccount.clickAngelinasArrows();
        waitFor(5);
    }
    @Test
    public void searchFollowingHahtags(){
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);
        someonesAccount.clickAngelinasFollowing();
        waitFor(5);
        someonesAccount.clickAngelinasPeople();
        someonesAccount.clickAngelinasHashtags();
        waitFor(4);}
    @Test
    public void clickOnFirstSnap(){
        SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);
        dotAngelinas.clickOnFirst();
        waitFor(4);}
    @Test
    public void ReactFirstPicLikes(){
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(4);
        someonesAccount.clickOnFirstPhoto();
        waitFor(4);
        someonesAccount.clickCountLikes();
        waitFor(2);
        }
    @Test
    public void ReactFirstPic(){
        SignInPage sign = new SignInPage(driver);
        CheckOnSomeonesAccount someonesAccount= new CheckOnSomeonesAccount(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(4);
        someonesAccount.clickOnFirstPhoto();
        waitFor(4);
        someonesAccount.clickAngelinasLike();
        waitFor(2);
    }
}

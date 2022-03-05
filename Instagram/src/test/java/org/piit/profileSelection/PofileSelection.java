package org.piit.profileSelection;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
////18
public class PofileSelection extends commonApi{
     @Test
    public void testMeta(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
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
        profile.onProfile();
        waitFor(4);
        selections.clickOnMeta();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickWho();}}
        waitFor(4);
     }
      @Test
    public void testAbout(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
          Assert.assertEquals(driver.getTitle(), "Instagram");
        selections.clickOnAbout();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickAboutHome();}}
        waitFor(4);}
    @Test
    public void testBlogs(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnBlog();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickProduct();}}
        waitFor(4);}
    @Test
    public void testJobs(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnJobs();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickTeams();}}
        waitFor(4);}
      @Test
    public void testHelps(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnHelp();
        waitFor(4);
        selections.clickCovid();
        waitFor(4);}
     @Test
    public void testAPI(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnAPI();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickTools();}}
        waitFor(4);}
   //  @Test
    public void testPrivacy(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnPrivacy();
        waitFor(4);}
 //    @Test
    public void testTerms(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnTerms();
        waitFor(4);}
 //    @Test
    public void testTopAccounts(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        Search search = new Search(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnTopAccounts();
        waitFor(4);
        selections.clickOne();
        waitFor(5);
        selections.clickSix();
        waitFor(4);
        search.onSearch();
        waitFor(4);}
  //  @Test
    public void testHashtags(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        Search search = new Search(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnHastags();
        waitFor(4);
        selections.clickFour();
        waitFor(4);
        selections.clickHashDir();
        waitFor(6);
        search.onSearch();
        waitFor(4);}
 //    @Test
    public void testUSALocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickUSALocations();
        waitFor(4);
        selections.clickFluLocations();
        waitFor(10);
        selections.clickMtea();
        waitFor(8);
    }
  //  @Test
    public void testBDLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickBangladesh();
        selections.clickDhaka();
        selections.clickSultans();
        waitFor(4);}
  //  @Test
    public void testDubaiLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickEmirates();
        selections.clickDubai();
        selections.clickBurj();
        waitFor(4);}
  //   @Test
    public void testLocationsSeeMore(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickMore();
        waitFor(2);}
  //  @Test
    public void testInstagramLite(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickInstagramLite();
        waitFor(4);}
  //  @Test
    public void testEnglish(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
   // @Test
    public void testInstagramMeta(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickInstaMeta();
        waitFor(4);}
 //   @Test
    public void testIstanbulLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickTurkey();
        selections.clickIstanbul();
        selections.clickAya();
        waitFor(4);}
}

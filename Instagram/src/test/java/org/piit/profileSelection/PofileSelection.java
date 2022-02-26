package org.piit.profileSelection;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.piit.HomePage;
import org.piit.ProfilePage;
import org.piit.ProfileSelections;
import org.piit.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
////18
public class PofileSelection extends commonApi{
     @Test
    public void TestMeta(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
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
    //  @Test
    public void TestAbout(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnAbout();
        waitFor(4);
        String parent = driver.getWindowHandle();
        Set<String> AllTabs=driver.getWindowHandles();
        for (String windows:AllTabs) {
            if(!(windows.equals(parent))){
                driver.switchTo().window(windows);
                selections.clickAboutHome();}}
        waitFor(4);}
    //@Test
    public void TestBlogs(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
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
    //@Test
    public void TestJobs(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
    //  @Test
    public void TestHelps(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
        ProfilePage profile = new ProfilePage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        sign.loginnotNow();
        sign.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnHelp();
        waitFor(4);
        selections.clickCovid();
        waitFor(4);}
    // @Test
    public void TestAPI(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
    // @Test
    public void TestPrivacy(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnPrivacy();
        waitFor(4);}
    // @Test
    public void TestTerms(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnTerms();
        waitFor(4);}
    // @Test
    public void TestTopAccounts(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnTopAccounts();
        waitFor(4);
        selections.clickOne();
        waitFor(5);
        selections.clickSix();
        waitFor(4);
        home.onSearch();
        waitFor(4);}
    //@Test
    public void TestHashtags(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickOnHastags();
        waitFor(4);
        selections.clickFour();
        waitFor(4);
        selections.clickHashDir();
        waitFor(6);
        home.onSearch();
        waitFor(4);}
    // @Test
    public void TestUSALocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
    // @Test
    public void TestBDLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickBangladesh();
        selections.clickDhaka();
        selections.clickSultans();
        waitFor(4);}
    //@Test
    public void TestDubaiLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickEmirates();
        selections.clickDubai();
        selections.clickBurj();
        waitFor(4);}
    // @Test
    public void TestLocationsSeeMore(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickLocations();
        waitFor(4);
        selections.clickMore();
        waitFor(2);}
    // @Test
    public void TestInstagramLite(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickInstagramLite();
        waitFor(4);}
    //@Test
    public void TestEnglish(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickEnglish();
        waitFor(4);}
    // @Test
    public void TestInstagramMeta(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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
        waitFor(4);
        profile.onProfile();
        waitFor(4);
        selections.clickInstaMeta();
        waitFor(4);}
    // @Test
    public void TestIstanbulLocations(){SignInPage sign = new SignInPage(driver);
        HomePage home = new HomePage(driver);
        ProfileSelections selections = new ProfileSelections(driver);
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

package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//2
public class SearchButton extends commonApi{
    @Test
    public void search(){
        SignInPage sign = new SignInPage(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertTrue(sign.logIn.isEnabled());
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearch();
        waitFor(8);}
    @Test
    public void Cross(){
        SignInPage sign = new SignInPage(driver);
        Search searchs = new Search(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertTrue(sign.logIn.isEnabled());
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        Assert.assertEquals(driver.getTitle(),"Instagram");
        searchs.onSearchBox();
        waitFor(8);
        searchs.onCross();}
}

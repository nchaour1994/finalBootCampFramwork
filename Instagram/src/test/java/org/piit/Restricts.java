package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//4
public class Restricts extends commonApi{
    @Test
    public void angelinasRestrictAccount(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        Restrict restrict = new Restrict (driver);
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
        dotAngelinas.clickOnDot();
        dotAngelinas.clickOnRestrict();
        waitFor(4);
        restrict.clickRestrictAccount();}
    @Test
    public void angelinasRestrictCancel(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        Restrict restrict = new Restrict (driver);
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
        dotAngelinas.clickOnDot();
        waitFor(4);
        dotAngelinas.clickOnRestrict();
        waitFor(4);
        restrict.clickRestrictCancel();}
   @Test
    public void angelinasUnRestrictAccount(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        Restrict restrict = new Restrict (driver);
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
        dotAngelinas.clickOnDot();
        waitFor(4);
        restrict.clickUnRestrictCancel();}
    @Test
    public void angelinasEmbeddedCode(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        Restrict restrict = new Restrict (driver);
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
        dotAngelinas.clickOnDot();
        waitFor(4);
        dotAngelinas.clickOnEmbed();
        restrict.clickEmbeddedCode();}
}

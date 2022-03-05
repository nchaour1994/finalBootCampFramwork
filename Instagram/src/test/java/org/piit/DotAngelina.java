package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//6
public class DotAngelina extends commonApi{
    @Test
    public void angelinasDot(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        waitFor(4);}
    @Test
    public void angelinasBlock(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        dotAngelinas.clickOnBlock();
        waitFor(4);}
    @Test
    public void angelinasRestrict(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        waitFor(4);}
    @Test
    public void angelinasReport(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        dotAngelinas.clickOnReport();
        waitFor(4);}
    @Test
    public void angelinasEmbed(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        dotAngelinas.clickOnEmbed();
        waitFor(4);}
    @Test
    public void angelinasCancel(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
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
        dotAngelinas.clickOnCancel();
        waitFor(4);}
}

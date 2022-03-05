package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//2
public class ReportAccounts extends commonApi{
    @Test
    public void angelinasReportPost(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ReportAccount reportAccount=new ReportAccount(driver);
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
        waitFor(4);
        reportAccount.clickReportsPost();
        waitFor(3);}
    @Test
    public void angelinasReportAccount(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        ReportAccount reportAccount=new ReportAccount(driver);
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
        waitFor(4);
        reportAccount.clickReportsAccount();
        waitFor(3);}
}

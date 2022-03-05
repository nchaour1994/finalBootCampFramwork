package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//2
public class Block extends commonApi{
    @Test
    public void angelinasDotBlock(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        BlockingAngelina blockingAngelina=new BlockingAngelina(driver);
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
       waitFor(4);
        blockingAngelina.clickBlocking();
        waitFor(4);
         }
    @Test
    public void angelinasDotCancel(){ SignInPage sign = new SignInPage(driver);
        DotAngelinas dotAngelinas=new DotAngelinas(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        BlockingAngelina blockingAngelina=new BlockingAngelina(driver);
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
        waitFor(4);
        blockingAngelina.clickCancel();
        waitFor(4);
    }
}

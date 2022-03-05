package org.piit.saveLogin;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class saveNotNow extends commonApi{
//2
    @Test
    public void saveLogin(){SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        saveLogin.saveLoginNotNow();
        waitFor(4);}
     @Test
    public void notificationButton(){SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);}

}

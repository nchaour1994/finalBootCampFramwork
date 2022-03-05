package org.piit.saveLogin;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

//1
public class saveInfo extends commonApi {
   @Test
    public void saveInfo(){SignInPage sign = new SignInPage(driver);
        SaveLoginSaveInfo saveLoginInfo=new SaveLoginSaveInfo(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        saveLoginInfo.saveLogins();
        waitFor(4);}
}

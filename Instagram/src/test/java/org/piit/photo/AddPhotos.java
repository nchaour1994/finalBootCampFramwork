package org.piit.photo;
import base.commonApi;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//1
public class AddPhotos extends commonApi {
    @Test
    public void TestAdd(){
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        AddPhoto photo=new AddPhoto(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        photo.onAdd();
        waitFor(4);}
}

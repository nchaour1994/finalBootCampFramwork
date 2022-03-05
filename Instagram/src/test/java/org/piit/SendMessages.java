package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//4
public class SendMessages extends commonApi {
    @Test
    public void testSendMessage(){
        SendMessage message= new SendMessage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertTrue(sign.logIn.isEnabled());
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        message.sendMessage();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Inbox • Chats");

        }
    @Test
    public void ViewSendMessage(){
        SendMessage message= new SendMessage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        Assert.assertTrue(sign.logIn.isEnabled());
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        waitFor(4);
        Assert.assertEquals(driver.getTitle(),"Instagram");
        message.sendMessage();
        waitFor(8);
        Assert.assertEquals(driver.getTitle(),"Inbox • Chats");
         message.seeMessageRequest();
         waitFor(3);
         message.seeDeleteAll();
         waitFor(3);}
   @Test
    public void AddCollection(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SendMessage message= new SendMessage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.saved();
        waitFor(4);
        message.clickCollectionPic();
        waitFor(4);
    }
   @Test
    public void FoodCollection(){ HomePage home = new HomePage(driver);
        SignInPage sign = new SignInPage(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SendMessage message= new SendMessage(driver);
        sign.enterEmail();
        sign.enterPassword();
        Assert.assertTrue(sign.logIn.isEnabled());
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
        home.inProfile();
        Assert.assertEquals(driver.getTitle(), "Instagram");
        home.saved();
        waitFor(4);
        message.foodCollectionPhoto();
        waitFor(4);
    }
}

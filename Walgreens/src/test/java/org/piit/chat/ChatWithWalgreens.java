package org.piit.chat;

import base.commonApi;
import org.piit.ChatPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatWithWalgreens extends commonApi {

    @Test
    public void Testchat(){
        HomePage home=new HomePage(driver);
        ChatPage chatPage=new ChatPage(driver);
        Assert.assertEquals(driver.getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickOnpharmacyChatIcon();
        Assert.assertEquals(driver.getTitle(),"Pharmacy Chat | Walgreens");
        chatPage.clickOnchatBtn();
       // chatPage.dragChatWindow();
        //----to see--------------

    }
}

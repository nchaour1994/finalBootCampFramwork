package org.piit.chat;

import base.commonApi;
import org.piit.ChatPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class ChatWithWalgreens extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleChatPage=prop.getProperty("titleChatPage");

    @Test
    public void Testchat(){
        HomePage home=new HomePage(driver);
        ChatPage chatPage=new ChatPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnpharmacyChatIcon();
        Assert.assertEquals(driver.getTitle(),titleChatPage);
        chatPage.clickOnchatBtn();
       // chatPage.dragChatWindow();
        //----to see--------------

    }
}

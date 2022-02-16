package org.piit.chat;

import base.commonApi;
import org.piit.ChatPage;
import org.piit.HomePage;
import org.testng.annotations.Test;

public class ChatWithWalgreens extends commonApi {

    @Test
    public void chat(){
        HomePage home=new HomePage(driver);
        ChatPage chatPage=new ChatPage(driver);
        home.clickOnpharmacyChatIcon();
        waitFor(2);
        chatPage.clickOnchatBtn();
        waitFor(6);
        chatPage.dragChatWindow();
        waitFor(5);
    }
}

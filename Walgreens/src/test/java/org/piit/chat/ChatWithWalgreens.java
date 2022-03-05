package org.piit.chat;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.ChatPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;

public class ChatWithWalgreens extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleChatPage=prop.getProperty("titleChatPage");

    @Test
    public void testChat(){
        HomePage home=new HomePage(driver);
        ChatPage chatPage=new ChatPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnpharmacyChatIcon();
        Assert.assertEquals(getTitle(),titleChatPage);
        chatPage.clickOnchatBtn();
        wait.until(ExpectedConditions.visibilityOf(chatPage.chatWindow));
        Assert.assertTrue(chatPage.checkIfchatWindowIsDsplayed());
       // chatPage.dragChatWindow();
        //----to see--------------

    }
    @Test
    public void testChatFromMenu(){
        HomePage home=new HomePage(driver);
        ChatPage chatPage=new ChatPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.prescriptionInMenu));
        Assert.assertTrue(home.checkIfprescriptionInMenuIsDisplayed());
        home.clickOnprescriptionInMenu();
        home.clickOnmorePharmacyServices();
        home.clickOnpharmacyChat();
        Assert.assertEquals(getTitle(),titleChatPage);
        chatPage.clickOnchatBtn();
        wait.until(ExpectedConditions.visibilityOf(chatPage.chatWindow));
        Assert.assertTrue(chatPage.checkIfchatWindowIsDsplayed());

    }

}

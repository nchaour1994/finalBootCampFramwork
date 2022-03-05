package org.piit.orderPostCard;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.BusinessCardDesignPage;
import org.piit.BusinessCardsPage;
import org.piit.CardsPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderBusinessPostCard extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleCardPage=prop.getProperty("titleCardPage");
    String titleBusinessCardPage=prop.getProperty("titleBusinessCardPage");
    String titleBusinessDesignCardPage=prop.getProperty("titleBusinessDesignCardPage");
    String businessCardModel=prop.getProperty("businessCardModel");
    String titleCreateBusinessCard=prop.getProperty("titleCreateBusinessCard");

    @Test
    public void testOrderBusinessCard(){
        HomePage home=new HomePage(driver);
        CardsPage cards=new CardsPage(driver);
        BusinessCardsPage businessCards=new BusinessCardsPage(driver);
        BusinessCardDesignPage businessCardDesign=new BusinessCardDesignPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        wait.until(ExpectedConditions.visibilityOf(home.photosInMenu));
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfcardAndStationeryIsEnabled());
        home.clickOncardAndStationery();
        Assert.assertEquals(getTitle(),titleCardPage);
        cards.HoverOverbusinessInMenu();
        Assert.assertTrue(cards.checkIfpostcardsIsEnabled());
        cards.clickOnpostcards();
        Assert.assertEquals(getTitle(),titleBusinessCardPage);
        businessCards.clickOnchhoseAdesignBtn();
        Assert.assertEquals(getTitle(),titleBusinessDesignCardPage);
        businessCardDesign.typeOnSearchField();
        Assert.assertEquals(businessCardDesign.getValueOfSearchField(),businessCardModel);
        wait.until(ExpectedConditions.visibilityOf(businessCardDesign.forestDesign));
        businessCardDesign.clickOnforestDesign();
        Assert.assertTrue(businessCardDesign.checkIfcreateNowBtnIsEnabled());
        businessCardDesign.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateBusinessCard);

    }

    @Test
    public void testOrderBusinessCardFromHomePage(){
        HomePage home=new HomePage(driver);
        CardsPage cards=new CardsPage(driver);
        BusinessCardsPage businessCards=new BusinessCardsPage(driver);
        BusinessCardDesignPage businessCardDesign=new BusinessCardDesignPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        home.clickOnphotoCard();
        cards.HoverOverbusinessInMenu();
        Assert.assertTrue(cards.checkIfpostcardsIsEnabled());
        cards.clickOnpostcards();
        Assert.assertEquals(getTitle(),titleBusinessCardPage);
        businessCards.clickOnchhoseAdesignBtn();
        Assert.assertEquals(getTitle(),titleBusinessDesignCardPage);
        businessCardDesign.typeOnSearchField();
        Assert.assertEquals(businessCardDesign.getValueOfSearchField(),businessCardModel);
        wait.until(ExpectedConditions.visibilityOf(businessCardDesign.forestDesign));
        businessCardDesign.clickOnforestDesign();
        Assert.assertTrue(businessCardDesign.checkIfcreateNowBtnIsEnabled());
        businessCardDesign.clickOncreateNowBtn();
        Assert.assertEquals(getTitle(),titleCreateBusinessCard);






    }
}

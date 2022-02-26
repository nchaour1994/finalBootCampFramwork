package org.piit.orderPostCard;

import base.commonApi;
import org.piit.BusinessCardDesignPage;
import org.piit.BusinessCardsPage;
import org.piit.CardsPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderBusinessPostCard extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleCardPage=prop.getProperty("titleCardPage");
    String titleBusinessCardPage=prop.getProperty("titleBusinessCardPage");
    String titleBusinessDesignCardPage=prop.getProperty("titleBusinessDesignCardPage");
    String businessCardModel=prop.getProperty("businessCardModel");

    @Test
    public void testOrderBusinessCard(){
        HomePage home=new HomePage(driver);
        CardsPage cards=new CardsPage(driver);
        BusinessCardsPage businessCards=new BusinessCardsPage(driver);
        BusinessCardDesignPage businessCardDesign=new BusinessCardDesignPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        waitFor(1);
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
        waitFor(1);
        businessCardDesign.clickOnforestDesign();
        Assert.assertTrue(businessCardDesign.checkIfcreateNowBtnIsEnabled());
        businessCardDesign.clickOncreateNowBtn();



    }
}

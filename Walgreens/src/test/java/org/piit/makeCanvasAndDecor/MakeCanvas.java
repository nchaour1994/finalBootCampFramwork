package org.piit.makeCanvasAndDecor;

import base.commonApi;
import org.piit.CanvasAndDecorPage;
import org.piit.HomePage;
import org.piit.WoodPanelPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;

public class MakeCanvas extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleCanvasAndDecorPage=prop.getProperty("titleCanvasAndDecorPage");
    String titleWoodPanelPage=prop.getProperty("titleWoodPanelPage");


    @Test
    public void testChooseCanvas(){
        HomePage home =new HomePage(driver);
        CanvasAndDecorPage canvasAndDecor =new CanvasAndDecorPage(driver);
        WoodPanelPage woodPanelPage=new WoodPanelPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfphotosInMenuIsEnabled());
        home.clickOnphotosInMenu();
        Assert.assertTrue(home.checkIfcanvasAndDecorIsEnabled());
        home.clickOncanvasAndDecor();
        waitFor(1);
        Assert.assertEquals(getTitle(),titleCanvasAndDecorPage);
        Assert.assertTrue(canvasAndDecor.checkIfwoodPanelIsEnabled());
        canvasAndDecor.clickOnwoodPanel();
        Assert.assertEquals(getTitle(),titleWoodPanelPage);
       // Assert.assertTrue(woodPanelPage.checkIfsizePanelIsEnabled());
        woodPanelPage.clickOnsizePanel();
        Assert.assertTrue(woodPanelPage.checkIfcreateNowBtnIsEnabled());
        woodPanelPage.clickOncreateNowBtn();

    }
}

package org.piit.orderTestCovid;

import base.commonApi;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.AntiGenQuickViewTestPage;
import org.piit.Covid19TestingPage;
import org.piit.HealthConfirmPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class OderTests extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleHealthConfirmPage=prop.getProperty("titleHealthConfirmPage");
    String titleCovidTestingPage= prop.getProperty("titleCovidTestingPage");
    String titleQuickVuePAge=prop.getProperty("titleQuickVuePAge");
    String titleOrderHeathConfirmTestPage=prop.getProperty("titleOrderHeathConfirmTestPage");
    String titleShoppingCartPage=prop.getProperty("titleShoppingCartPage");
    String titleQuickVuePage=prop.getProperty("titleQuickVuePage");

     @Test
    public void testOrderCovidHomeTest(){
         HomePage home= new HomePage(driver);
         Covid19TestingPage covid19Testing=new Covid19TestingPage(driver);
         HealthConfirmPage healthConfirmPage=new HealthConfirmPage(driver);
         String title= driver.getWindowHandle();
         Assert.assertEquals(getTitle(),titleHomePage);
         Assert.assertTrue(home.checkIfcovid19TestingOptionsIsEnabled());
         home.clickONcovid19TestingOptions();
         Assert.assertTrue(covid19Testing.checkIfexploreAtHomeTestingIsEnabled());
         covid19Testing.clickOnexploreAtHomeTesting();
         Assert.assertTrue(covid19Testing.checkIfpcrAtHomeTestingIconIsEnabled());
         covid19Testing.selectpcrAtHomeTestingIcon();
         Assert.assertTrue(covid19Testing.checkIfhealthConfirmTestingIsEnabled());
         covid19Testing.clickOnhealthConfirmTesting();
         Assert.assertTrue(healthConfirmPage.checkIfgetStartedBtnInCovidTestingOptionsIsEnabled());
         healthConfirmPage.clickONgetStartedBtnInCovidTestingOptions();
         Assert.assertTrue(healthConfirmPage.checkIfgotItBtnInCovidTestingOptionsIsEnabled());
         healthConfirmPage.clickONgotItBtnInCovidTestingOptions();
         Set<String> windows=driver.getWindowHandles();
        for (String tab:windows) {
            if(!(tab.equalsIgnoreCase(title))){
                driver.switchTo().window(tab);
                Assert.assertEquals(getTitle(),titleHealthConfirmPage);
                Assert.assertTrue(healthConfirmPage.checkIforderNowBtnInNewTabIsEnabled());
                healthConfirmPage.clickOnorderNowBtnInNewTab();
                Assert.assertEquals(getTitle(),titleOrderHeathConfirmTestPage);
            }
        }



    }
   @Test
    public void TestorderCovidAntiGen() {
        HomePage home = new HomePage(driver);
        Covid19TestingPage covid19Testing = new Covid19TestingPage(driver);
        AntiGenQuickViewTestPage antiGenQuickViewTestPage=new AntiGenQuickViewTestPage(driver);
        Assert.assertTrue(home.checkIfcovid19TestingOptionsIsEnabled());
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONcovid19TestingOptions();
        Assert.assertEquals(getTitle(),titleCovidTestingPage);
        Assert.assertTrue(covid19Testing.checkIfshopNowBtnIsEnabled());
        covid19Testing.clickOnshopNowBtn();
        Assert.assertEquals(getTitle(),titleQuickVuePAge);
        Assert.assertTrue(antiGenQuickViewTestPage.checkIfaddForPickUpBtnIsEnabled());
        antiGenQuickViewTestPage.clickOnaddForPickUpBtn();
        Assert.assertTrue(antiGenQuickViewTestPage.checkIfviewCartBtnIsEnabled());
        antiGenQuickViewTestPage.clickOnaviewCartBtn();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);



    }
    @Test
    public void TestShippingCovidAntiGen() {
        HomePage home = new HomePage(driver);
        Covid19TestingPage covid19Testing = new Covid19TestingPage(driver);
        AntiGenQuickViewTestPage antiGenQuickViewTestPage=new AntiGenQuickViewTestPage(driver);
        Assert.assertTrue(home.checkIfcovid19TestingOptionsIsEnabled());
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONcovid19TestingOptions();
        Assert.assertEquals(getTitle(),titleCovidTestingPage);
        Assert.assertTrue(covid19Testing.checkIfshopNowBtnIsEnabled());
        covid19Testing.clickOnshopNowBtn();
        Assert.assertEquals(getTitle(),titleQuickVuePAge);
        antiGenQuickViewTestPage.clickOnshippingIcon();
        antiGenQuickViewTestPage.clickOnaddForPickUpBtn();
        Assert.assertTrue(antiGenQuickViewTestPage.checkIfviewCartBtnIsEnabled());
        antiGenQuickViewTestPage.clickOnaviewCartBtn();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);


    }
    @Test
    public void testOrderantigenCovidTestFromMenu(){
        HomePage home = new HomePage(driver);
        Covid19TestingPage covid19Testing = new Covid19TestingPage(driver);
        AntiGenQuickViewTestPage antiGenQuickViewTestPage=new AntiGenQuickViewTestPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        home.clickOnfindCareInMenu();
        home.clickOncoronaVirusInformation();
        covid19Testing.clickOnshopNowBtn();
        Assert.assertEquals(getTitle(),titleQuickVuePage);
        antiGenQuickViewTestPage.clickOnshippingIcon();
        antiGenQuickViewTestPage.clickOnaddForPickUpBtn();
        antiGenQuickViewTestPage.clickOnaviewCartBtn();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);


    }
    @Test
    public void testOrderantigenCovidTestFromMenuForPickUp(){
        HomePage home = new HomePage(driver);
        Covid19TestingPage covid19Testing = new Covid19TestingPage(driver);
        AntiGenQuickViewTestPage antiGenQuickViewTestPage=new AntiGenQuickViewTestPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnfindCareInMenu();
        home.clickOncoronaVirusInformation();
        covid19Testing.clickOnshopNowBtn();
        Assert.assertEquals(getTitle(),titleQuickVuePage);
        antiGenQuickViewTestPage.clickOnaddForPickUpBtn();
        antiGenQuickViewTestPage.clickOnaviewCartBtn();
        Assert.assertEquals(getTitle(),titleShoppingCartPage);


    }




}

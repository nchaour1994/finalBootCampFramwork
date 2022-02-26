package org.piit.purchase;

import base.commonApi;
import database.ConnectDB;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.DataReader;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PurchaseItems extends commonApi {
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleCardPage=prop.getProperty("titleCardPage");
    String titleBusinessCardPage=prop.getProperty("titleBusinessCardPage");
    String titleBusinessDesignCardPage=prop.getProperty("titleBusinessDesignCardPage");
    String businessCardModel=prop.getProperty("businessCardModel");
    String titleHealthConfirmPage=prop.getProperty("titleHealthConfirmPage");
    String titleCovidTestingPage= prop.getProperty("titleCovidTestingPage");
    String titleQuickVuePAge=prop.getProperty("titleQuickVuePAge");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");

     @Test
    public void testOrderAnItem(){
        HomePage home=new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        home.typeOnsearchfield();
        Assert.assertTrue(resultPage.checkIffirstElementInSearchListIsEnabled());
        resultPage.clickOnfirstElementInSearchList();
        Assert.assertTrue(resultPage.checkIfpickUpIconIsEnabled());
        resultPage.clickOnpickUpIcon();
        Assert.assertTrue(resultPage.checkIffinishBtnIsEnabled());
        resultPage.clickOnfinishBtn();

    }
    @Test
    public void testOrderAnItemFromMenu(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        ContinueShoppingPage continueShoppingPage= new ContinueShoppingPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(home.shopProductInMenu));
        Assert.assertTrue(home.checkIfshopProductInMenuIsEnabled());
        home.clickOnshopProductInMenu();
       waitFor(2);
        Assert.assertTrue(home.checkIfhomeGoodInSubMenuIsEnabled());
        home.clickOnhomeGoodInSubMenu();
        wait.until(ExpectedConditions.visibilityOf(home.smallHomeAppliances));
        Assert.assertTrue(home.checkIfsmallHomeAppliancesIsEnabled());
        home.clickOnsmallHomeAppliances();
        Assert.assertTrue(home.checkIfkitchenAppliancesIsEnabled());
        home.clickOnkitchenAppliances();
        Assert.assertTrue(resultPage.checkIffirstItemInSearchForKitchenAppliancesIsEnabled());
        resultPage.clickOnfirstItemInSearchForKitchenAppliances();
        Assert.assertTrue(resultPage.checkIfviewCartBtnIsEnabled());
        resultPage.clickOnviewCartBtn();
        Assert.assertTrue(continueShoppingPage.checkIfproccedToCheckutBtnIsEnabled());
        continueShoppingPage.clickOnproccedToCheckutBtn();
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(2);
        checkoutPage.typeOnadressFieldInShippingProcess();
        checkoutPage.typeOncityFieldInShippingProcess();
        checkoutPage.selectFromdropDownStates();
        Assert.assertNotNull(checkoutPage.dropDownStates);
        checkoutPage.typeOnzipCodeInShippingProcess();


    }

    @Test
    public  void testshopLneses(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        AcuvuePage acuvuePage=new AcuvuePage(driver);
        Assert.assertEquals(getTitle(),titleHomePage);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.checkIfcontactAndGlassesIsEnabled());
       waitFor(1);
        home.clickOncontactAndGlasses();
        Assert.assertTrue(home.checkIfshopAllcontactAndGlassesIsEnabled());
        home.clickOnshopAllcontactAndGlasses();
        Assert.assertTrue(resultPage.checkIfAcuvueOasys12packIsEnabled());
        resultPage.clickOnAcuvueOasys12pack();
        acuvuePage.selectFromrightPowerField();
        acuvuePage.selectFromrBaseCuvue();
        acuvuePage.selectFromleftPowerField();
        acuvuePage.selectFromlBaseCuvue();
        Assert.assertTrue(acuvuePage.checkIfaddToCartIsEnabled());
        acuvuePage.clickOnaddToCart();

    }
    public List<String> myList(){
        List<String> array=new ArrayList<>();
        array.add("bike");
        array.add("tooth paste");
        array.add("tooth brush");
        return array;

    }
    public List<String> data(){

        DataReader dr=new DataReader();
        return dr.getAllColumn("C:\\Users\\nchao\\Downloads\\Book1.xlsx","Sheet1",1,0);
    }
    public List<String>listFromDb() throws Exception {
        ConnectDB con=new ConnectDB();
        return con.readDataBase("items","itm");
    }

    public List<String> readFromMongo(){
        ConnectDB con=new ConnectDB();
        List<String> list=con.readFromMongo();

        for (String item:list) {
            item.substring(item.indexOf("="));
        }
        return list;

    }

    @Test
    public void testsearchForMultipleItems() throws Exception {
        HomePage home = new HomePage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        List<String> listOfItems = listFromDb();
        for (String item : listOfItems) {
            home.typeAndClear(item);
        }
    }
        @Test
        public void testSearchForMultiplefromExcel()  {
            HomePage home= new HomePage(driver);
            Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
            List<String> listOfItems=data();
            for (String item:listOfItems) {
                home.typeAndClear(item);
            }


    }
    @Test
    public void TestsearchForMultiplefrommongol() {
        HomePage home = new HomePage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        List<String> listOfItems = readFromMongo();
        for (String item : listOfItems) {
            home.typeAndClear(item);
        }
    }

    @Test
    public void searchItemsAndPrint(){
         HomePage home=new HomePage(driver);
         ResultPage resultPage=new ResultPage(driver);
         home.typeOnsearchfield();
         resultPage.printAllItems();
         waitFor(2);
    }
}

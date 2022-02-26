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

     @Test
    public void TestorderAnItem(){
         HomePage home=new HomePage(driver);
         ResultPage resultPage=new ResultPage(driver);
        home.typeOnsearchfield();
       // driver.findElement(By.xpath("//button[@class=\"icon icon__search\"][@title=\"Search\"]")).sendKeys(Keys.RETURN);
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"pickup-ship-btncompare_sku6314909\"]")));
        Assert.assertTrue(resultPage.firstElementInSearchList.isEnabled());
         resultPage.clickOnfirstElementInSearchList();
        Assert.assertTrue(resultPage.pickUpIcon.isEnabled());
         resultPage.clickOnpickUpIcon();
        Assert.assertTrue(resultPage.finishBtn.isEnabled());
         resultPage.clickOnfinishBtn();

    }
    @Test
    public void TestorderAnItemFromMenu(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        ContinueShoppingPage continueShoppingPage= new ContinueShoppingPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(home.shopProductInMenu));
        Assert.assertTrue(home.shopProductInMenu.isEnabled());
        home.clickOnshopProductInMenu();
       waitFor(1);
        Assert.assertTrue(home.homeGoodInSubMenu.isEnabled());
        home.clickOnhomeGoodInSubMenu();
        wait.until(ExpectedConditions.visibilityOf(home.smallHomeAppliances));
        Assert.assertTrue(home.smallHomeAppliances.isEnabled());
        home.clickOnsmallHomeAppliances();
        Assert.assertTrue(home.kitchenAppliances.isEnabled());
        home.clickOnkitchenAppliances();
        Assert.assertTrue(resultPage.firstItemInSearchForKitchenAppliances.isEnabled());
        resultPage.clickOnfirstItemInSearchForKitchenAppliances();
        Assert.assertTrue(resultPage.viewCartBtn.isEnabled());
        resultPage.clickOnviewCartBtn();
        Assert.assertTrue(continueShoppingPage.proccedToCheckutBtn.isEnabled());
        continueShoppingPage.clickOnproccedToCheckutBtn();
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
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
    public  void TestshopLneses(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        AcuvuePage acuvuePage=new AcuvuePage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.contactAndGlasses.isEnabled());
       waitFor(1);
        home.clickOncontactAndGlasses();
        Assert.assertTrue(home.shopAllcontactAndGlasses.isEnabled());
        home.clickOnshopAllcontactAndGlasses();
        Assert.assertTrue(resultPage.AcuvueOasys12pack.isEnabled());
        resultPage.clickOnAcuvueOasys12pack();
        acuvuePage.selectFromrightPowerField();
      //  Assert.assertTrue(acuvuePage.rightPowerField.isSelected());
        acuvuePage.selectFromrBaseCuvue();
      //  Assert.assertTrue(acuvuePage.rBaseCuvue.isSelected());
        acuvuePage.selectFromleftPowerField();
       // Assert.assertTrue(acuvuePage.leftPowerField.isSelected());
        acuvuePage.selectFromlBaseCuvue();
      //  Assert.assertTrue(acuvuePage.lBaseCuvue.isSelected());
        Assert.assertTrue(acuvuePage.addToCart.isEnabled());
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
    public void TestsearchForMultipleItems() throws Exception {
        HomePage home = new HomePage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        List<String> listOfItems = listFromDb();
        for (String item : listOfItems) {
            home.typeAndClear(item);
        }
    }
        @Test
        public void TestsearchForMultiplefromExcel()  {
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
}

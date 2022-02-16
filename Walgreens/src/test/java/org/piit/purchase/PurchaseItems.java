package org.piit.purchase;

import base.commonApi;
import database.ConnectDB;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.DataReader;

import java.util.ArrayList;
import java.util.List;

public class PurchaseItems extends commonApi {

    // @Test
    public void orderAnItem(){
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
        waitFor(5);

    }
   // @Test
    public void orderAnItemSecondWay(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        ContinueShoppingPage continueShoppingPage= new ContinueShoppingPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        waitFor(2);
        Assert.assertTrue(home.shopProductInMenu.isEnabled());
        home.clickOnshopProductInMenu();
        waitFor(2);
        Assert.assertTrue(home.homeGoodInSubMenu.isEnabled());
        home.clickOnhomeGoodInSubMenu();
        waitFor(2);
        Assert.assertTrue(home.smallHomeAppliances.isEnabled());
        home.clickOnsmallHomeAppliances();
        waitFor(2);
        Assert.assertTrue(home.kitchenAppliances.isEnabled());
        home.clickOnkitchenAppliances();
        waitFor(2);
        Assert.assertTrue(resultPage.firstItemInSearchForKitchenAppliances.isEnabled());
        resultPage.clickOnfirstItemInSearchForKitchenAppliances();
        waitFor(2);
        Assert.assertTrue(resultPage.viewCartBtn.isEnabled());
        resultPage.clickOnviewCartBtn();
        waitFor(2);
        Assert.assertTrue(continueShoppingPage.proccedToCheckutBtn.isEnabled());
        continueShoppingPage.clickOnproccedToCheckutBtn();
        waitFor(2);
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        waitFor(3);
        checkoutPage.typeOnadressFieldInShippingProcess();
        checkoutPage.typeOncityFieldInShippingProcess();
        checkoutPage.selectFromdropDownStates();
        Assert.assertNotNull(checkoutPage.dropDownStates);
        checkoutPage.typeOnzipCodeInShippingProcess();
        waitFor(10);

    }

  //  @Test
    public  void shopLneses(){
        HomePage home= new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
        AcuvuePage acuvuePage=new AcuvuePage(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOncontactAndGlasses();
        home.clickOnshopAllcontactAndGlasses();
        waitFor(3);
        resultPage.clickOnAcuvueOasys12pack();
        acuvuePage.selectFromrightPowerField();
        acuvuePage.selectFromrBaseCuvue();
        acuvuePage.selectFromleftPowerField();
        acuvuePage.selectFromlBaseCuvue();
        acuvuePage.clickOnaddToCart();
        waitFor(5);

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

   // @Test
    public void searchForMultipleItems() throws Exception {
        HomePage home = new HomePage(driver);
        List<String> listOfItems = listFromDb();
        for (String item : listOfItems) {
            home.typeAndClear(item);
        }
    }
       // @Test
        public void searchForMultiplefromExcel()  {
            HomePage home= new HomePage(driver);
            List<String> listOfItems=data();
            for (String item:listOfItems) {
                home.typeAndClear(item);
            }


    }
    @Test
    public void searchForMultiplefrommongol() {
        HomePage home = new HomePage(driver);
        List<String> listOfItems = readFromMongo();
        for (String item : listOfItems) {
            home.typeAndClear(item);
        }
    }
}

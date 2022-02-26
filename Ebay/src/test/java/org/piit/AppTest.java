package org.piit;
import base.commonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest  extends commonApi {
// HomePage homePage;

 //@BeforeMethod
// public void getInit() {
 // homePage = PageFactory.initElements(driver, HomePage.class);
 // registration= PageFactory.initElements(driver,Registration.class);
// }

 @Test(enabled = false)
 public void clickOnHelpAndContact() {
  HomePage homePage = new HomePage(driver);
  homePage.helpAndContact();
  String expectedTitle = "Shipping & Tracking | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @Test(enabled = true)
 public void AdvancedMenu() {
  HomePage homePage = new HomePage(driver);
  homePage.Advanced();
  homePage.setFindStoreButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
  //Assert.assertEquals(actualTitle, expectedTitle,  );
 }

 @Test(enabled = false)
 public void BeautyOption2() {
  HomePage homePage = new HomePage(driver);
  homePage.Beauty();
  homePage.setSkincare();
  // String expectedTitle = " skincare | eBay";
  // String actualTitle = homePage.getTitle();
  // Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");

 }

 @Test(enabled = false)
 public void testMotors() {
  HomePage homePage = new HomePage(driver);
  homePage.Motors();
  String expectedTitle = " Panels  | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testCarAndTrucks() {
  HomePage homePage = new HomePage(driver);
  homePage.carAndTrucks();
  String expectedTitle = " chevrolet | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testMenSoes() {
  HomePage homePage = new HomePage(driver);
  homePage.MenShoes();
  String expectedTitle = " Price | eBay";
  String actualTitle = homePage.getTitle();
  // Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testSportingGoods() {
  HomePage homePage = new HomePage(driver);
  homePage.SportingGoods();
  String expectedTitle = " Cycling | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testHomeGarden() {
  HomePage homePage = new HomePage(driver);
  homePage.HomeGarden();
  String expectedTitle = " Bedding | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testJewelry() {
  HomePage homePage = new HomePage(driver);
  homePage.Jewelry();
  String expectedTitle = " Condition | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void testToys() {
  HomePage homePage = new HomePage(driver);
  homePage.toys();
  String expectedTitle = " AgeLevel| eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void CellphonesAccessories() {
  HomePage homePage = new HomePage(driver);
  homePage.CellphoneAccessories();
  String expectedTitle = " Samsung | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void Sell() {
  HomePage homePage = new HomePage(driver);
  homePage.Sell();
  String expectedTitle = " ListAnItem | eBay";
  String actualTitle = homePage.getTitle();
  // Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 ///////////////////////////////////////////////////////////////////////////////
 @Test(enabled = false)
 public void ClickOnCompany() {
  HomePage homePage = new HomePage(driver);
  homePage.Company();
  String expectedTitle = " Carrers | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @
         Test(enabled = false)
 public void ClickOnCollectiblesAndArt() {
  HomePage homePage = new HomePage(driver);
  homePage.CollectiblesAndArt();
  String expectedTitle = " Art| eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @
         Test(enabled = false)
 public void ClickOnStories() {
  HomePage homePage = new HomePage(driver);
  homePage.Stories();
  String expectedTitle = " Financial | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @Test(enabled = false)
 public void ClickOnLeadership() {
  HomePage homePage = new HomePage(driver);
  homePage.Leadership();
  String expectedTitle = " BoardOfDirectors| eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @Test(enabled = false)
 public void ClickOnPurpose() {
  HomePage homePage = new HomePage(driver);
  homePage.Purpose();
  String expectedTitle = " Success | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void ClickOnTech() {
  HomePage homePage = new HomePage(driver);
  homePage.tech();
  String expectedTitle = " Products| eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void ClickOnContactUs() {
  HomePage homePage = new HomePage(driver);
  homePage.ContactUs();
  String expectedTitle = " ContactCarrers| eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @Test(enabled = false)
 public void ClickOnstoresHub() {
  HomePage homePage = new HomePage(driver);
  homePage.StoresHub();
  String expectedTitle = " Bose | eBay";
  String actualTitle = homePage.getTitle();
  // Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }

 @Test(enabled = false)
 public void ClickOnCostumerService() {
  HomePage homePage = new HomePage(driver);
  homePage.CostumerService();
  String expectedTitle = " Bose | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void ClickOnMyGarage() {
  HomePage homePage = new HomePage(driver);
  homePage.MyGarage();
  String expectedTitle = " SellerCenter | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = false)
 public void ClickOnEbayRefurbished() {
  HomePage homePage = new HomePage(driver);
  homePage.EbayRefurbished();
  String expectedTitle = " VeryGood | eBay";
  String actualTitle = homePage.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
 }


 @Test(enabled = true)
 public void BrandOutlerMenu() {
  HomePage homePage = new HomePage(driver);
  homePage.WatchesButton();
  homePage.setClothingButton();
//  String expectedTitle = " Stores  | eBay";
//  String actualTitle = homePage.getTitle();
  //Assert.assertEquals(actualTitle, expectedTitle,  );
 }


}



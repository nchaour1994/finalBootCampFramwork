package org.piit;


import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.Set;

public class AppTest extends HomePage
{
  @Test
    public void createAnAccount(){
      HomePage home= PageFactory.initElements(driver, HomePage.class);
       WebElement expected=home.accountBtn;
       Assert.assertTrue(expected.isEnabled());
       home.clickOnAccountBtn();
       waitFor(2);
       Assert.assertTrue(home.registerBtn.isEnabled());
       home.clickOnRegisterBtn();
       waitFor(2);
       Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
       home.typeOnFirstNameField();
       waitFor(2);
       home.typeOnLastNameField();
       home.typeOnEmailField();
       home.typeOnPasswordField();
       home.clickONCheckboxLinkMyAccount();
       Assert.assertTrue(home.checkboxLinkMyAcoount.isSelected());
       waitFor(3);
//       Actions action= new Actions(driver);
//       action.moveToElement(home.phoneNumberField).sendKeys("32478959").build().perform();
       type(home.phoneNumberField, "3478974599");
       waitFor(3);
       home.typeOnzipCodeField();
       home.flagCheckBoxOver16();
       Assert.assertTrue(home.checkBoxOver16.isSelected());
       home.flagCheckBoxAgreement();
       Assert.assertTrue(home.checkBoxAgreement.isSelected());
       waitFor(10);
    }
   // @Test
    public void createAnAccountFromMenu(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        waitFor(1);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        waitFor(1);
       Assert.assertTrue(home.yourAccountInMenuDropDown.isEnabled());
        home.clickOnAccountMenuInDropDown();
        waitFor(1);
        Assert.assertTrue(home.registerInYourAccountSubMenu.isEnabled());
        home.clickOnregisterInYourAccountSubMenu();
        Assert.assertEquals(driver.getTitle(),"Create Your Account | Walgreens");
        home.typeOnFirstNameField();
        waitFor(2);
        home.typeOnLastNameField();
        home.typeOnEmailField();
        home.typeOnPasswordField();
        home.clickONCheckboxLinkMyAccount();
        Assert.assertTrue(home.checkboxLinkMyAcoount.isSelected());
        waitFor(3);
        type(home.phoneNumberField, "3478974599");
        waitFor(3);
        home.typeOnzipCodeField();
        home.flagCheckBoxOver16();
        Assert.assertTrue(home.checkBoxOver16.isSelected());
        home.flagCheckBoxAgreement();
        Assert.assertTrue(home.checkBoxAgreement.isSelected());
        waitFor(10);

    }
    //@Test
    public void scheduleAnAppointment(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
          Assert.assertTrue(home.scheduleVaccineIcon.isEnabled());
          home.clickOnScheduleVacineIcon();
          waitFor(2);
          home.flagCovid19VaccineCheckBox();
          Assert.assertTrue(home.checkboxCovid19Vaccine.isSelected());
          home.clearZipCodeLoctionForScheduleVaccine();
          home.typeOnZipCodeLoctionForScheduleVaccine();
          home.typeONdateOfBirthForScheduleVaccine();
          home.flagoptionNoInScheduleVaccine();
          Assert.assertTrue(home.optionNoInScheduleVaccine.isSelected());
          home.flagoptionNoHasReceiveAuthorisationCode();
          Assert.assertTrue(home.optionNoHasReceiveAuthorisationCode.isSelected());
          Assert.assertTrue(home.continueBtnOnScheduleVaccine.isEnabled());
          home.clickOncontinueBtnOnScheduleVaccine();
          waitFor(8);
       // (//section[@role='group']/ul/li/span[text()='05:00 pm'])[3]

        //missing script

    }
   // @Test
    public void orderCovidHomeTest(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        String title= driver.getWindowHandle();
        Assert.assertTrue(home.covid19TestingOptions.isEnabled());
        home.clickONcovid19TestingOptions();
        waitFor(3);
        Assert.assertTrue(home.exploreAtHomeTesting.isEnabled());
        home.clickOnexploreAtHomeTesting();
        waitFor(3);
        Assert.assertTrue(home.pcrAtHomeTestingIcon.isEnabled());
        home.selectpcrAtHomeTestingIcon();
        waitFor(3);
        Assert.assertTrue(home.healthConfirmTesting.isEnabled());
        home.clickOnhealthConfirmTesting();
        waitFor(3);
        Assert.assertTrue(home.getStartedBtnInCovidTestingOptions.isEnabled());
        home.clickONgetStartedBtnInCovidTestingOptions();
        waitFor(3);
        Assert.assertTrue(home.gotItBtnInCovidTestingOptions.isEnabled());
        home.clickONgotItBtnInCovidTestingOptions();
        waitFor(3);
        Set<String> windows=driver.getWindowHandles();
        for (String tab:windows) {
            if(!(tab.equalsIgnoreCase(title))){
                driver.switchTo().window(tab);
            }
        }
        Assert.assertTrue(home.orderNowBtnInNewTab.isEnabled());
       home.clickOnorderNowBtnInNewTab();
        waitFor(10);

    }
   // @Test
    public void orderAnItem(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        home.typeOnsearchfield();
       // driver.findElement(By.xpath("//button[@class=\"icon icon__search\"][@title=\"Search\"]")).sendKeys(Keys.RETURN);
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"pickup-ship-btncompare_sku6314909\"]")));
        Assert.assertTrue(home.firstElementInSearchList.isEnabled());
        home.clickOnfirstElementInSearchList();
        Assert.assertTrue(home.pickUpIcon.isEnabled());
        home.clickOnpickUpIcon();
        Assert.assertTrue(home.finishBtn.isEnabled());
        home.clickOnfinishBtn();
        waitFor(5);

    }
  //  @Test
    public void orderAnItemSecondWay(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
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
        Assert.assertTrue(home.firstItemInSearchForKitchenAppliances.isEnabled());
        home.clickOnfirstItemInSearchForKitchenAppliances();
        waitFor(2);
        Assert.assertTrue(home.viewCartBtn.isEnabled());
        home.clickOnviewCartBtn();
        waitFor(2);
        Assert.assertTrue(home.proccedToCheckutBtn.isEnabled());
        home.clickOnproccedToCheckutBtn();
        waitFor(2);
        home.typeOnuserNameFieldInSignIn();
        home.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(home.signInBtn.isEnabled());
        home.clickOnsignInBtn();
        waitFor(3);
        home.typeOnadressFieldInShippingProcess();
        home.typeOncityFieldInShippingProcess();
        home.selectFromdropDownStates();
        Assert.assertNotNull(home.dropDownStates);
        home.typeOnzipCodeInShippingProcess();
        waitFor(10);

    }

   // @Test
    public  void findLocations(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);

       waitFor(3);
       Assert.assertTrue(home.arrowDownForStoreLocation.isEnabled());
       home.clickOnarrowDownForStoreLocation();
       waitFor(3);

       home.typeOnsearchForLocationField();
       Assert.assertNotNull(home.searchForLocationField);
         waitFor(5);
    }
   // @Test
    public void findLOcationUsingMyLocation(){
        //find nearby locations using our location
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        waitFor(3);
        Assert.assertTrue(home.arrowDownForStoreLocation.isEnabled());
        home.clickOnarrowDownForStoreLocation();
        waitFor(2);
        Assert.assertTrue(home.useMyLocationBtn.isEnabled());
        home.clickOnuseMyLocationBtn();
        waitFor(8);

    }
   // @Test
    public void updateMyAccountInformations(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        waitFor(3);
        Assert.assertTrue(home.signInBtnInAccountMenu.isEnabled());
        home.clickOnsignInBtnInAccountMenu();
        waitFor(3);
        home.typeOnuserNameFieldInSignIn();
        home.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(home.signInBtn.isEnabled());
        home.clickOnsignInBtn();
        waitFor(8);
        Assert.assertTrue(home.accountBtn.isEnabled());
        home.clickOnAccountBtn();
        waitFor(2);
        Assert.assertTrue(home.accountHomeInAccountList.isEnabled());
        home.clickOnaccountHomeInAccountList();
        Assert.assertTrue(home.profileBtn.isDisplayed());
        home.hoverOverOnprofileBtn();
        waitFor(5);
        Assert.assertTrue(home.personalInformationInProfile.isDisplayed());
        home.clickOnpersonalInformationInProfile();
        waitFor(5);
        Assert.assertTrue(home.editBtn.isEnabled());
        home.clickOneditBtn();
        waitFor(5);
        home.typeOnadressFieldInMyAccount();

    }
    @Test
    public void test10(){
        HomePage home= PageFactory.initElements(driver, HomePage.class);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        waitFor(2);
        Assert.assertTrue(home.couponOnMenuList.isEnabled());
        home.clickOncouponOnMenuList();
        waitFor(5);

    }


}

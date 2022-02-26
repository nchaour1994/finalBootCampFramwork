package org.piit;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GetProperties;

import java.util.Properties;

public class HomePage extends commonApi {


   public HomePage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

   String zipCode=prop.getProperty("zipCode");




    @FindBy(xpath = "(//*[text()='Sign Out'])[2]")
     WebElement signOutBtn;
   @FindBy(xpath = "(//*[text()='Shopping List'])[2]")
   WebElement shoppingList;
    @FindBy(xpath = "//span[@class=\"inner-focus hide-on-mobile truncate\"]")
    public
    WebElement accountBtn;
    @FindBy(xpath = "//a[@id=\"pf-dropdown-register\"]")
    public
    WebElement registerBtn;
    @FindBy(xpath = "(//*[@class='card__item card__item-new'])[5]")
    WebElement createHealthProfile;

    //----------------------------------------------------------------------------------------------
    @FindBy(xpath = "//strong[contains(text(),'Menu')]")
    public
    WebElement menuBtn;
    @FindBy(xpath = "//a[@data-element-name=\"Your Account\"][@class=\"dropdown__title\"]")
    public
    WebElement yourAccountInMenuDropDown;
    @FindBy(xpath = "//a[@id=\"pf-m-register\"]")
    public
    WebElement registerInYourAccountSubMenu;
    //----------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@class=\"card__item card__item-new\"]")
    public
    WebElement scheduleVaccineIcon ;

    //------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//img[@src=\"/images/adaptive/sp1/1947208_brandstory_tile3_DrClipboard-Full-F2.png\"]")
    public
    WebElement covid19TestingOptions;


    //-------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//input[@name=\"Ntt\"]")
    WebElement searchfield;

    //-----------------------------------------------------------------------------------------------
    @FindBy(css = "#menu-shop-products")
    public
    WebElement shopProductInMenu;
    @FindBy(xpath = "//span[contains(text(),'Home Goods')]")
    public
    WebElement homeGoodInSubMenu;
    @FindBy(xpath = "//span[text()='Small Home Appliances']")
    public
    WebElement smallHomeAppliances;
    @FindBy(css = "a[data-element-name=\"Kitchen Appliances\"]")
    public
    WebElement kitchenAppliances;





    //------------------------------------------------------------------------------------------
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[3]")
    public
    WebElement arrowDownForStoreLocation;
    @FindBy(css = "input#store-header-search")
    public
    WebElement searchForLocationField;
    @FindBy(css = "strong[style=\"vertical-align: top; font-size: large;\"]")
    public
    WebElement useMyLocationBtn;
    //-------------------------------------------------------------------------------------------
    @FindBy(xpath = "(//strong[text()='Sign in'])[2]")
    public
    WebElement signInBtnInAccountMenu;

    @FindBy(xpath = "(//a[text()='Account Home'])[2]")
    public
    WebElement accountHomeInAccountList;


    //----------------------------------------------------------------------
       @FindBy (css = "ul>li>a[data-element-name=\"Coupons\"]")
       public
    WebElement couponOnMenuList;
   //--------------------------------------------------------------------------
   @FindBy(xpath = "//a[@data-element-name='Sign in']")
   WebElement singInBtnInMenu;
   //---------------------------------------------------------------------------
    @FindBy (xpath = "//span[text()='myWalgreens™ Credit Card']")
    WebElement myWalgreensCreditCard;
    @FindBy(xpath = "//Strong[text()='COVID-19 vaccine information']")
    public
    WebElement covid19vaccineInformationIcon;
    @FindBy(xpath = "//a[@data-element-name='Find Care']")
    public
    WebElement findCareInMenu;
    @FindBy(xpath = "//a[@data-element-name='Find Care near you']")
    public
    WebElement findCareNearYouInsubMenu;
    @FindBy(xpath = "//span[text()='Contacts & Glasses']")
    public
    WebElement contactAndGlasses;
    @FindBy(xpath = "//a[text()='Shop All Contact Lenses']")
    public
    WebElement shopAllcontactAndGlasses;
    @FindBy(xpath = "//Strong[text()='Pharmacy Chat']")
    WebElement pharmacyChatIcon;
    @FindBy(xpath = "//span[text()='Weekly Ad']")
    public
    WebElement weeklyAD;
    @FindBy(xpath = "//span[contains(text(),'Find a Store')]")
    public
    WebElement findStoreInMenu;
    @FindBy(css = "#menu-photo")
    WebElement photosInMenu;
    @FindBy(xpath = "//a[@data-element-name='Photo Books']")
    WebElement photoBookInSubMenu;
    @FindBy(css = "#cards__stationery")
    WebElement cardAndStationery;
    @FindBy(xpath = "//a[@data-element-name='Canvas & Décor']")
    WebElement canvasAndDecor;
    @FindBy(xpath = "//a[@data-element-name='Prescriptions']")
    WebElement prescriptionInMenu;
    @FindBy(xpath = "//a[@data-element-name='Getting Started']")
    WebElement gettingStartedInSubMenuPrescription;
    @FindBy(xpath = "//*[@data-element-name='Posters']")
    WebElement postersInsubMenuPhoto;
    @FindBy(xpath = "//a[@data-element-name='myWalgreens™']")
    WebElement myWalgreens;
    @FindBy(xpath = "(//*[text()='Buy It Again'])[2]")
    WebElement buyItAgain;
    @FindBy(css = "#pf-icon__cart")
    WebElement shoppingCart;
    @FindBy(xpath = "//*[@data-element-name='Product Purchase History']")
    WebElement productPurchaseHistoryInMenu;
    @FindBy(xpath = "//*[@data-element-name='Buy It Again']")
    WebElement buyitAgainInMenu;
    @FindBy(xpath = "//*[@data-element-name='Shopping List']")
    WebElement shoppingListInMenu;
    @FindBy(xpath = "//*[@data-element-name='Prescription Status']")
    WebElement prescriptionstatus;
    @FindBy(xpath = "(//a[text()='Prescription Status'])[2]")
    WebElement prescriptionStatusINAccountMenu;
    @FindBy(xpath = "(//a[text()='Messages (0)'])[2]")
    WebElement messageInAccountMenu;
    @FindBy(xpath = "//*[@data-element-name='Messages (0)']")
    WebElement messagesInMenu;
    @FindBy(xpath = "//*[@data-element-name='Sign Out']")
    WebElement signOutBtnInMenu;



    //------------------------------------------------------------------
    public void clickOnAccountBtn(){
        click(accountBtn);
    }
    public void clickOnRegisterBtn(){
        click(registerBtn);
    }

    //-----------------------------------------------------------------------------------------------------------
    public void clickONMenuBtn(){
        click(menuBtn);
    }
    public void clickOnAccountMenuInDropDown(){
        click(yourAccountInMenuDropDown);
    }
    public void clickOnregisterInYourAccountSubMenu(){
        click(registerInYourAccountSubMenu);
    }
    //---------------------------------------------------------------------------------------------------------
    public void clickOnScheduleVacineIcon(){
        click(scheduleVaccineIcon);
    }

    //-----------------------------------------------------------------------------------------
    public void clickONcovid19TestingOptions(){
        click(covid19TestingOptions);
    }


    public void typeOnsearchfield(){
        typeAndEnter(searchfield,"tooth paste");
    }

    public void clickOnshopProductInMenu(){
        click(shopProductInMenu);
    }

    public void clickOnhomeGoodInSubMenu(){
        click(homeGoodInSubMenu);
    }
    public void clickOnsmallHomeAppliances(){
        click(smallHomeAppliances);
    }
    public void clickOnkitchenAppliances(){
        click(kitchenAppliances);
    }



    public void clickOnarrowDownForStoreLocation(){
       // Actions actions=new Actions(driver);
      //  actions.moveToElement(arrowDownForStoreLocation).click().build().perform();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",arrowDownForStoreLocation);

     // hoverOver(driver,arrowDownForStoreLocation);
       // click(arrowDownForStoreLocation);


    }
    public void typeOnsearchForLocationField(){
        typeAndEnter(searchForLocationField,zipCode);
    }
    public void clickOnuseMyLocationBtn(){
        click(useMyLocationBtn);
    }
    public void clickOnsignInBtnInAccountMenu(){
        click(signInBtnInAccountMenu);
    }

    public void clickOnaccountHomeInAccountList(){
        click(accountHomeInAccountList);
    }


    public void clickOncouponOnMenuList(){
        click(couponOnMenuList);
    }
    public void clickOnsingInBtnInMenu(){
        click( singInBtnInMenu);
    }
    public void clickOnmyWalgreensCreditCard(){
        click(myWalgreensCreditCard);
    }
    public void clickOncovid19vaccineInformationIcon(){
        click(covid19vaccineInformationIcon);
    }
    public void clickOnfindCareInMenu(){
        click(findCareInMenu);
    }
    public void clickOnfindCareNearYouInsubMenu(){
        click(findCareNearYouInsubMenu);
    }

    public void clickOncontactAndGlasses(){
        click(contactAndGlasses);
    }
    public void clickOnshopAllcontactAndGlasses(){
        click(shopAllcontactAndGlasses);
    }
    public void clickOnpharmacyChatIcon(){
        click(pharmacyChatIcon);
    }
    public void clickOnweeklyAD(){
        click(weeklyAD);
    }
    public void clickOnfindStoreInMenu(){
        click(findStoreInMenu);
    }

    public void typeAndClear(String itemTOsearch){
        typeAndEnter(searchfield,itemTOsearch);
        clear(searchfield);
    }

    public void clickOnphotosInMenu(){
        click(photosInMenu);
    }
    public void clickOnphotoBookInSubMenu(){
        click(photoBookInSubMenu);
    }
    public void clickOncardAndStationery(){
        click(cardAndStationery);
    }
    public void clickOncanvasAndDecor(){
        click(canvasAndDecor);
    }
    public void clickOnprescriptionInMenu(){
        click(prescriptionInMenu);
    }
    public void clickOngettingStartedInSubMenuPrescription(){
        click(gettingStartedInSubMenuPrescription);
    }
    public void clickOnpostersInsubMenuPhoto(){
        click(postersInsubMenuPhoto);
    }
    public void clickOnmyWalgreens(){
        click(myWalgreens);
    }
    public void clickOnsignOutBtn(){
        click(signOutBtn);
    }
    public void clickOnshoppingList(){
        click(shoppingList);
    }
    public void clickOnbuyItAgain(){
        click(buyItAgain);
    }
    public void clickOnshoppingCart(){
        click(shoppingCart);
    }
    public void clickOncreateHealthProfile(){
        click(createHealthProfile);
    }
    public void scrollTocreateHealthProfile(){
        scrollToView(createHealthProfile);
    }
    public void clickOnproductPurchaseHistoryInMenu(){
        click(productPurchaseHistoryInMenu);
    }
    public void clickOnbuyitAgainInMenu(){
        click(buyitAgainInMenu);
    }
    public void clickOnshoppingListInMenu(){
        click(shoppingListInMenu);
    }
    public void clickOnprescriptionstatus(){
        click(prescriptionstatus);
    }
    public void clickOnprescriptionStatusINAccountMenu(){
        click(prescriptionStatusINAccountMenu);
    }
    public void clickOnmessageInAccountMenu(){
        click(messageInAccountMenu);
    }
    public void clickOnMessageInMenu(){
        click(messagesInMenu);
    }
    public void clickOnsignOutBtnInMenu(){
        click(signOutBtnInMenu);
    }
    public void scrollTosignOutBtnInMenu(){
        scrollToView(signOutBtnInMenu);
    }

    public boolean checkIfmenuBtnIsEnabled(){
        return menuBtn.isEnabled();
    }
    public boolean checkIfcouponOnMenuListIsEnabled(){
        return couponOnMenuList.isEnabled();
    }
    public boolean checkIfAccountBtnIsEnabled(){
        return  accountBtn.isEnabled();
    }
    public boolean checkIfsignInBtnInAccountMenuIsEnabled(){
        return signInBtnInAccountMenu.isEnabled();
    }
    public boolean checkIfbuyItAgainBtnIsEnabled(){
        return buyItAgain.isEnabled();
    }
    public boolean checkIfyourAccountInMenuDropDownIsEnabled(){
        return yourAccountInMenuDropDown.isEnabled();
    }
    public boolean checkIfsingInBtnInMenuIsEnabled(){
        return singInBtnInMenu.isEnabled();
    }
    public boolean checkIfbuyitAgainInMenuIsEnabled(){
        return buyitAgainInMenu.isEnabled();
    }
    public boolean checkIfshoppingListInMenuIsEnabled(){
        return shoppingListInMenu.isEnabled();
    }
    public boolean chekcIfaccountHomeInAccountListIsEnabled(){
        return accountHomeInAccountList.isEnabled();
    }
    public boolean checkIfcreateHealthProfileIsEnabled(){
        return createHealthProfile.isEnabled();
    }
    public boolean checkIfmessageInAccountMenuIsEnabled(){
        return messageInAccountMenu.isEnabled();
    }
    public boolean checkIfmessagesInMenuIsEnabled(){
        return messagesInMenu.isEnabled();
    }
    public boolean checkIfshoppingCartIsEnbled(){
        return shoppingCart.isEnabled();
    }
    public boolean checkIfprescriptionstatusIsEnabled(){
        return prescriptionstatus.isEnabled();
    }
    public boolean checkIfweeklyADIsEnabled(){
        return weeklyAD.isEnabled();
    }
    public boolean checkIfcovid19vaccineInformationIconIsEnabled(){
        return covid19vaccineInformationIcon.isEnabled();
    }
    public boolean checkIfscheduleVaccineIconIsEnabled(){
        return scheduleVaccineIcon.isEnabled();
    }
    public  boolean checkIfFindCareInMenuIsEnabled(){
        return findCareInMenu.isEnabled();
    }
    public boolean checkIfFindCareNearYouInsubMenuIsEnabled(){
        return findCareNearYouInsubMenu.isEnabled();
    }
    public boolean checkIfarrowDownForStoreLocationIsEnabled(){
        return arrowDownForStoreLocation.isEnabled();
    } public boolean checkIfuseMyLocationBtnIsEnabled(){
        return useMyLocationBtn.isEnabled();
    }
    public boolean checkIfsignOutBtnIsEnabled(){
        return signOutBtn.isEnabled();
    }
    public boolean checkIfphotosInMenuIsEnabled(){
        return photosInMenu.isEnabled();
    }
   public boolean checkIfcanvasAndDecorIsEnabled(){
        return canvasAndDecor.isEnabled();
   }
   public boolean checkIfpostersInsubMenuPhotoIsEnabled(){
        return postersInsubMenuPhoto.isEnabled();
   }
   public boolean checkIfcardAndStationeryIsEnabled(){
        return cardAndStationery.isEnabled();
   }
  public boolean checkIfcovid19TestingOptionsIsEnabled(){
        return covid19TestingOptions.isEnabled();
  }
  public boolean checkIfshopProductInMenuIsEnabled(){
        return shopProductInMenu.isEnabled();
  }
  public boolean checkIfhomeGoodInSubMenuIsEnabled(){
        return homeGoodInSubMenu.isEnabled();
  }
  public boolean checkIfsmallHomeAppliancesIsEnabled(){
        return smallHomeAppliances.isEnabled();
  }
  public boolean checkIfkitchenAppliancesIsEnabled(){
        return kitchenAppliances.isEnabled();
  }
  public boolean checkIfcontactAndGlassesIsEnabled(){
        return contactAndGlasses.isEnabled();
  }
  public  boolean checkIfshopAllcontactAndGlassesIsEnabled(){
        return shopAllcontactAndGlasses.isEnabled();
  }



}

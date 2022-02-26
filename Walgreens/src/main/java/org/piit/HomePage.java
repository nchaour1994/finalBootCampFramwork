package org.piit;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends commonApi {
   public HomePage(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }



    @FindBy(xpath = "//span[@class=\"inner-focus hide-on-mobile truncate\"]")
    public
    WebElement accountBtn;
    @FindBy(xpath = "//a[@id=\"pf-dropdown-register\"]")
    public
    WebElement registerBtn;

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
        typeAndEnter(searchForLocationField,"11104");
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




}

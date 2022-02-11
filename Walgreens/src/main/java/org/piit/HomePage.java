package org.piit;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends commonApi {




    @FindBy(xpath = "//span[@class=\"inner-focus hide-on-mobile truncate\"]")
    WebElement accountBtn;
    @FindBy(xpath = "//a[@id=\"pf-dropdown-register\"]")
    WebElement registerBtn;
    @FindBy(xpath = "//input[@name=\"firstName\"]")
     public WebElement firstNameField;
    @FindBy(xpath = "//input[@name=\"lastName\"]")
    WebElement lastNameFiled;
    @FindBy(xpath = "//input[@name=\"registerData\"]")
    WebElement emailField;
    @FindBy(xpath = "//input[@name=\"registerPassword\"]")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id=\"wag-reg-myw-checkbox\"]")
    WebElement checkboxLinkMyAcoount;
    @FindBy(xpath = "//input[@name=\"phoneno\"]")
    public WebElement phoneNumberField;
    @FindBy(xpath = "//input[@name=\"zipcode\"]")
    WebElement zipCodeField;
    @FindBy(xpath = "//input[@id=\"wag-mywterms-checkbox\"]")
    WebElement checkBoxOver16;
    @FindBy(xpath = "//input[@id=\"wag-terms-checkbox\"]")
    WebElement checkBoxAgreement;
    //----------------------------------------------------------------------------------------------
    @FindBy(xpath = "//strong[contains(text(),'Menu')]")
    WebElement menuBtn;
    @FindBy(xpath = "//a[@data-element-name=\"Your Account\"][@class=\"dropdown__title\"]")
    WebElement yourAccountInMenuDropDown;
    @FindBy(xpath = "//a[@id=\"pf-m-register\"]")
    WebElement registerInYourAccountSubMenu;
    //----------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@class=\"card__item card__item-new\"]")
    WebElement scheduleVaccineIcon ;
    @FindBy(xpath = "//input[@id=\"covid-btn\"]")
    WebElement checkboxCovid19Vaccine;
    @FindBy(xpath = "//input[@name=\"location\"]")
    WebElement zipcodeLocationForScheduleVaccine;
    @FindBy(xpath = "//input[@name=\"dob\"]")
    WebElement dateOfBirthForScheduleVaccine;
    @FindBy(xpath = "//input[@id=\"dose1\"]")
    WebElement optionNoInScheduleVaccine;
    @FindBy(xpath = "//input[@id=\"radio-1\"]")
    WebElement optionNoHasReceiveAuthorisationCode;
    @FindBy(xpath = "//span[@name=\"nextBtn\"]")
    WebElement continueBtnOnScheduleVaccine;
    //------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//img[@src=\"/images/adaptive/sp1/1947208_brandstory_tile3_DrClipboard-Full-F2.png\"]")
    WebElement covid19TestingOptions;
    @FindBy(xpath = "//a[@href=\"#at-home-testing\"]")
    WebElement exploreAtHomeTesting;
    @FindBy(xpath = "//img[@src=\"/images/adaptive/sp1/1729776_Icon-envelope@2x.png\"]")
    WebElement pcrAtHomeTestingIcon;
    @FindBy(xpath = "//span [@class='sr-only'][contains(text(),'healthconfirm')]/preceding-sibling::span[contains(text(),'Shop now')]")
    WebElement healthConfirmTesting;
    @FindBy(xpath = "//a[@title=\"Get started \"][@id=\"service_details_cta\"]")
    WebElement getStartedBtnInCovidTestingOptions;
    @FindBy(xpath = "//a[@id=\"navigationButton\"]")
    WebElement gotItBtnInCovidTestingOptions;
    @FindBy(xpath = "(//a[text()=\"ORDER NOW\"])[2]")
    WebElement orderNowBtnInNewTab;
    //-------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//input[@name=\"Ntt\"]")
    WebElement searchfield;
    @FindBy(xpath = "//button[@id=\"pickup-ship-btncompare_sku6314909\"]")
    WebElement firstElementInSearchList;
    @FindBy(xpath = "//button[@class=\"dropdown__title--card\"][@aria-controls=\"PICK_IT\"]")
    WebElement pickUpIcon;
    @FindBy(xpath = "//span[@class=\"btn btn__blue\"][contains(text(),\"Finish\")]")
    WebElement finishBtn;
    //-----------------------------------------------------------------------------------------------
    @FindBy(css = "#menu-shop-products")
    WebElement shopProductInMenu;
    @FindBy(xpath = "//span[contains(text(),'Home Goods')]")
    WebElement homeGoodInSubMenu;
    @FindBy(xpath = "//span[text()='Small Home Appliances']")
    WebElement smallHomeAppliances;
    @FindBy(css = "a[data-element-name=\"Kitchen Appliances\"]")
    WebElement kitchenAppliances;
    @FindBy(css = "button#pickup-ship-btncompare_sku6244026")
    WebElement firstItemInSearchForKitchenAppliances;
    @FindBy(css = "a[name=\"viewcart\"]")
    WebElement viewCartBtn;
    @FindBy(css = "button#wag-cart-proceed-to-checkout")
    WebElement proccedToCheckutBtn;
    @FindBy(css = "input[name='username']")
    WebElement userNameFieldInSignIn;
    @FindBy(css = "input[name='password']")
    WebElement passwordFieldInSignIn;
    @FindBy(css = "#submit_btn")
    WebElement signInBtn;
    @FindBy(css = "input#wag-checkout-shipping-info-address")
    WebElement adressFieldInShippingProcess;
    @FindBy(css = "input#wag-checkout-shipping-info-city")
    WebElement cityFieldInShippingProcess;
    @FindBy(css = "select#wag-checkout-shipping-info-state")
    WebElement dropDownStates;
    @FindBy(css = "input#wag-checkout-shipping-info-zipCode")
    WebElement zipCodeInShippingProcess;
    //------------------------------------------------------------------------------------------
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[3]")
    WebElement arrowDownForStoreLocation;
    @FindBy(css = "input#store-header-search")
    WebElement searchForLocationField;
    @FindBy(css = "strong[style=\"vertical-align: top; font-size: large;\"]")
    WebElement useMyLocationBtn;
    //-------------------------------------------------------------------------------------------
    @FindBy(xpath = "(//strong[text()='Sign in'])[2]")
    WebElement signInBtnInAccountMenu;
    @FindBy(xpath = "//strong[text()='Profile']")
    WebElement profileBtn;
    @FindBy(xpath = "(//a[text()='Account Home'])[2]")
    WebElement accountHomeInAccountList;
    @FindBy(xpath = "(//a[text()='Personal Information'])[1]")
    WebElement personalInformationInProfile;
    @FindBy(css = "span[class=\"btn btn__blue col-xs-12\"]")
    WebElement editBtn;
    @FindBy(css = "input[name=\"wagAddress\"]")
    WebElement adressFieldInMyAccount;
    //----------------------------------------------------------------------
       @FindBy (css = "ul>li>a[data-element-name=\"Coupons\"]")
       WebElement couponOnMenuList;



    //------------------------------------------------------------------
    public void clickOnAccountBtn(){
        click(accountBtn);
    }
    public void clickOnRegisterBtn(){
        click(registerBtn);
    }
    public void typeOnFirstNameField(){
        type(firstNameField,"john");


    }
    public void typeOnLastNameField(){
        type(lastNameFiled,"alba");
    }
    public void typeOnEmailField(){
        type(emailField,"john1994123@gmail.com");
    }
    public void typeOnPasswordField(){
        type(passwordField,"john1994123test");
    }
    public void clickONCheckboxLinkMyAccount(){
        click(checkboxLinkMyAcoount);
    }
    public void typeOnzipCodeField(){
        type(zipCodeField,"11105");
    }
    public void flagCheckBoxOver16(){
        click(checkBoxOver16);
    }
    public void flagCheckBoxAgreement(){
        click(checkBoxAgreement);
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
    public void flagCovid19VaccineCheckBox(){
        click(checkboxCovid19Vaccine);
    }
    public void clearZipCodeLoctionForScheduleVaccine(){
        click(zipcodeLocationForScheduleVaccine);
        clear(zipcodeLocationForScheduleVaccine);
    }
    public void typeOnZipCodeLoctionForScheduleVaccine(){
        type(zipcodeLocationForScheduleVaccine,"11104");
    }
    public void typeONdateOfBirthForScheduleVaccine(){
        type(dateOfBirthForScheduleVaccine,"02021995");
    }
    public void flagoptionNoInScheduleVaccine(){
        click(optionNoInScheduleVaccine);
    }
    public void flagoptionNoHasReceiveAuthorisationCode(){
        click(optionNoHasReceiveAuthorisationCode);
    }
    public void clickOncontinueBtnOnScheduleVaccine(){
        click(continueBtnOnScheduleVaccine);
    }
    //-----------------------------------------------------------------------------------------
    public void clickONcovid19TestingOptions(){
        click(covid19TestingOptions);
    }
    public void clickOnexploreAtHomeTesting(){
        click(exploreAtHomeTesting);
    }
    public void selectpcrAtHomeTestingIcon(){
        click(pcrAtHomeTestingIcon);
    }
    public void clickOnhealthConfirmTesting(){
        click(healthConfirmTesting);
    }
    public void clickONgetStartedBtnInCovidTestingOptions(){
        click(getStartedBtnInCovidTestingOptions);
    }
    public void clickONgotItBtnInCovidTestingOptions(){
        click(gotItBtnInCovidTestingOptions);
    }
    public void clickOnorderNowBtnInNewTab(){
        click(orderNowBtnInNewTab);
    }
    public void typeOnsearchfield(){
        typeAndEnter(searchfield,"tooth paste");
    }
    public void clickOnfirstElementInSearchList(){
        click(firstElementInSearchList);
    }
    public void clickOnpickUpIcon(){
        click(pickUpIcon);
    }
    public void clickOnfinishBtn(){
        click(finishBtn);
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
    public void clickOnfirstItemInSearchForKitchenAppliances(){
        click(firstItemInSearchForKitchenAppliances);
    }
    public void clickOnviewCartBtn(){
        click(viewCartBtn);
    }
    public void clickOnproccedToCheckutBtn(){
        click(proccedToCheckutBtn);
    }
    public void typeOnuserNameFieldInSignIn(){
        type(userNameFieldInSignIn,"john1899@gmail.com");
    }
    public void typeOnpasswordFieldInSignIn(){
        type(passwordFieldInSignIn,"John1899test");
    }
    public void clickOnsignInBtn(){

        click(signInBtn);
    }
    public void typeOnadressFieldInShippingProcess(){
        type(adressFieldInShippingProcess,"5025 42 st sunnyside");
    }
    public void typeOncityFieldInShippingProcess(){
        type(cityFieldInShippingProcess,"new york ");
    }
    public void selectFromdropDownStates(){
        selectDropdownOption( dropDownStates,"NY - New York");
    }
    public void typeOnzipCodeInShippingProcess(){
        type( zipCodeInShippingProcess,"11104");
    }
    public void clickOnarrowDownForStoreLocation(){
        Actions actions=new Actions(driver);
        actions.moveToElement(arrowDownForStoreLocation).click().build().perform();

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
    public void hoverOverOnprofileBtn(){
        hoverOver(driver,profileBtn);
    }
    public void clickOnaccountHomeInAccountList(){
        click(accountHomeInAccountList);
    }
    public void clickOnpersonalInformationInProfile(){
        click(personalInformationInProfile);
    }
    public void clickOneditBtn(){
        click(editBtn);
    }
    public void typeOnadressFieldInMyAccount(){
        type(adressFieldInMyAccount,"5024 42 street ");
    }
    public void clickOncouponOnMenuList(){
        click(couponOnMenuList);
    }




}

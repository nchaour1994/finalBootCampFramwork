package org.piit;


import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage extends commonApi {


    public InsurancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='-oneX-header-top-menu-btn -oneX-header-top-menu-btn__has-submenu'])[1]")
    public
    WebElement insuranceMenu;
    @FindBy(xpath = "//a[text()='Car Insurance']")
    public
    WebElement carInsurance;
    @FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
    public
    WebElement zipCodeField;
    @FindBy(xpath = "//button[@id='quote-main-zip-code-button-1']")
    public
    WebElement startAQuoteBtn;
    @FindBy(xpath = "//input[@id='first_name']")
    public
    WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public
    WebElement lastName;
    @FindBy(xpath = "//input[@placeholder='Street Address*']")
    public
    WebElement streetAddress;
    @FindBy(xpath = "//input[@placeholder='Apt/Unit']")
    public
    WebElement aptUnit;
    @FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
    public
    WebElement dateOfBirth;
    @FindBy(xpath = "//button[@id='btnContinue']")
    public
    WebElement nextVehicles;
//-------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
    public
    WebElement motorcycle;
    @FindBy(xpath = "//input[@id='callout-agent-zip-code-input1']")
    public
    WebElement getZipCodeField;
    @FindBy(xpath = "//button[@id='quote-main-zip-code-button1']")
    public
    WebElement findAnAgent;
//---------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Boat')]")
    public
    WebElement boat;
    @FindBy(xpath = "//input[@class='-oneX-textfield__input find-agent_zip']")
    public
    WebElement zipCodeField0;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement findAnAgent0;
//------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Off-road Vehicles')]")
    public
    WebElement offRoadVehicles;
    @FindBy(css= "#callout-agent-zip-code-input1")
    public
    WebElement zipCodeField1;
    @FindBy(xpath = "//button[@id='quote-main-zip-code-button1']")
    public
    WebElement findAnAgent1;
//--------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Motorhome')]")
    public
    WebElement motorHome;
//    ----------------------------------------------------------------------------------------------------
    @FindBy(css = "a[href='https://www.statefarm.com/claims/get-roadside-assistance'][class='-oneX-link--block menuLevel2 ']  " )
       public
    WebElement roadsideAssistance;
    @FindBy(xpath = "//a[@class='-oneX-btn-primary__anchor -oneX-btn-medium']")
    public
    WebElement getRoadsideAssistance;
    @FindBy(xpath = "//button[@id='start-request']")
    public
    WebElement startMyRequest;
//------------------------------------------------------------------------------------------------------------
    @FindBy(css = "#oneX-1-insurance")
    public
    WebElement homeAndProperty;
    @FindBy(xpath = "//a[@title='Get a Renters Insurance Quote Online & Buy Today']")
    public
    WebElement getRentersInsurance;
//------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[1]/section[1]/div[1]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]")
    public
    WebElement home;
    @FindBy(css = "input#quote-main-zip-code-input")
    public
    WebElement getGetZipCodeField6;
    @FindBy(css = "button#quote-main-zip-code-button-1")
    public
    WebElement getStartAQuoteBtn1;
//--------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Condominium')]")
    public
    WebElement condominium;
    @FindBy(css = "input#quote-main-zip-code-input")
    public
    WebElement getGetZipCodeField7;
    @FindBy(css = "button#quote-main-zip-code-button-1")
    public
    WebElement getStartAQuoteBtn2;
//---------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Renters Insurance')]")
    public
    WebElement rentersInsurance;
    @FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
    public
    WebElement getGetZipCodeField8;
    @FindBy(css = "button#quote-main-zip-code-button-1")
    public
    WebElement getStartAQuoteBtn3;
//--------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Rental Property')]")
    WebElement rentalProperty;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getGetZipCodeField9;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement getStartAQuoteBtn4;
//------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Personal Articles')]")
    public
    WebElement personalArticles;
    @FindBy(css = "input#callout-agent-zip-code-input_1")
    public
    WebElement getGetZipCodeField10;
    @FindBy(css = "button#quote-main-zip-code-button_1")
    public
    WebElement getStartAQuoteBtn5;
//---------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Manufactured Home')]")
    public
    WebElement manufacturedHome;
    @FindBy(css = "input#callout-agent-zip-code-input_1")
    public
    WebElement getGetZipCodeField11;
    @FindBy(css = "button#quote-main-zip-code-button_1")
    public
    WebElement getStartAQuoteBtn6;
//------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Farm and Ranch')]")
    public
    WebElement farmAndRanch;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getGetZipCodeField12;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement getStartAQuoteBtn7;
//-----------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Identity Restoration')]")
    WebElement identityRestoration;
    @FindBy(xpath = "//a[contains(text(),'Talk to a State Farm agent')]")
    WebElement talkToAStateFarmAgent;
    @FindBy(xpath = "//input[@id='locationText']")
    public
    WebElement getStreetAddress;
    @FindBy(css = "button#search")
    public
    WebElement getSearchBtn;
//---------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[@id='oneX-2-insurance']")
    public
    WebElement smallBusiness;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField3;
    @FindBy(xpath = "//button[@id='home']")
    public
    WebElement getFindAnAgent3;
    @FindBy(xpath = "//button[@id='home']")
    public
    WebElement findAnAgent4;
//-----------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Business Owners Policy')]")
    public
WebElement businessOwnerPolicy;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField4;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent5;
//---------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Commercial Auto')]")
    public
WebElement commercialAuto;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField5;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent6;
//-------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Contractors Policy')]")
    public
    WebElement contractorsPolicy;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField6;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent7;
//-------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Liability Umbrella')]")
    public
WebElement liabilityUmbrella;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField7;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent8;
//-------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Workers’ Compensation')]")
    WebElement workersCompensation;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField8;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent9;
//-----------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Surety & Fidelity Bonds')]")
    WebElement suretyAndFidelityBond;
    @FindBy(xpath = "//input[@class='-oneX-textfield--floating-input zip-input']")
    public
    WebElement zipCodeField9;
    @FindBy(xpath = "//button[@id='agentHeader']")
    public
    WebElement findAnAgent10;
//-----------------------------------------------------------------------------------------------------
    @FindBy(css= "#oneX-3-insurance")
    public
    WebElement life;
    @FindBy(xpath = "//select[@class='-oneX-dropdown quoteSelect']")
    public
    WebElement state;
    @FindBy(css = "body.formal.-oneX.-oneX-resize-bound:nth-child(2) section.west.life.life-hero.-w_mt-32.-w_mt-md-30:nth-child(2) div.-oneX-container div.-oneX-row div.-oneX-col-12.-oneX-col-md-8.-oneX-col-xl-6.-w_pr-xl-80:nth-child(3) div.get-quote_outerWrapper div.quote-container-outer div.quote-container-inner form:nth-child(1) div.quoteSelect.-oneX-d-flex.-oneX-flex-row.-w_mb-20.-w_mb-xl-24 div.quote-state.-oneX-d-inline-block:nth-child(5) > button.-oneX-btn-fit-content.-oneX-btn-primary")
    public
    WebElement goBtn;
//-------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = " //header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[1]/section[1]/div[1]/div[1]/div[4]/section[1]/ul[1]/li[1]/a[1]")
    public
WebElement termLife;
    @FindBy(xpath = "//select[@class='-oneX-dropdown quoteSelect']")
    public
    WebElement state1;
    @FindBy(css = "body.formal.-oneX.-oneX-resize-bound:nth-child(2) section.west.term-life.masthead-img.-w_mt-40.-w_mt-md-55.-w_mt-xl-60.-w_mb-80:nth-child(2) div.-oneX-container div.-oneX-row:nth-child(3) div.-oneX-col-12.get-life-quote div.get-quote_outerWrapper:nth-child(2) div.quote-container-outer div.quote-container-inner form:nth-child(1) div.quoteSelect.-oneX-d-flex.-oneX-flex-row.-w_mb-20.-w_mb-xl-24 div.quote-state.-oneX-d-inline-block:nth-child(5) > button.-oneX-btn-fit-content.-oneX-btn-primary")
    public
    WebElement startAQuote;
    @FindBy(xpath = "//input[@id='quoteForYouYes']")
    public
    WebElement yesBtn;
//---------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Whole Life')]")
    public
WebElement wholeLife;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getZipCodeField2;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement getGoBtn;
//------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Universal Life')]")
    public
WebElement universalLife;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getZipCodeField3;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement getGoBtn1;
//-------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[1]/section[1]/div[1]/div[1]/div[4]/section[1]/ul[1]/li[4]/a[1]")
    public
WebElement changePolicy;
    @FindBy(xpath = "//input[@class='-oneX-textfield__input -oneX-prime-white comboInp']")
    public
    WebElement getZipCodeField4;
    @FindBy(xpath = "//button[@class='-oneX-btn-primary comboBtn']")
    public
    WebElement getFindAnAgent;
//-------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//a[contains(text(),'Change Beneficiary')]")
    public
WebElement changeBeneficiary;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getZipCodeField5;
    @FindBy(xpath = "//button[@class='find-agent_submit -oneX-btn-fit-content -oneX-btn-primary -oneX-btn-fit-content']")
    public
    WebElement getGoBtn3;
//--------------------------------------------------------------------------------------------------
    @FindBy(css = "a#oneX-4-insurance")
    public
    WebElement health;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getGetZipCodeField4;
    @FindBy(css = "button#quote-main-zip-code-button1")
    public
    WebElement getFindAnAgent4;
//------------------------------------------------------------------------------------------------------
    @FindBy(css = "a#oneX-6-insurance")
    public
    WebElement disability;
    @FindBy(xpath = "//input[@class='-oneX-textfield__input -oneX-prime-white comboInp']")
    public
    WebElement getGetZipCodeField5;
    @FindBy(xpath = "//button[@class='-oneX-btn-primary comboBtn']")
    public
    WebElement getFindAnAgent5;
//--------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//body[1]/header[1]/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[1]")
    public
    WebElement bankingMenu;
    @FindBy(xpath = "//span[contains(text(),'Investments')]")
    public
    WebElement investmentsMenu;
    @FindBy(xpath = "//span[contains(text(),'Get a Quote')]")
    public
    WebElement getAQuoteMenu;
    @FindBy(xpath = "//span[contains(text(),'Pay a Bill')]")
    public
    WebElement payABillMenu;
    @FindBy(xpath = "//span[contains(text(),'Claims')]")
    public
    WebElement claimsMenu;
    @FindBy(xpath = "//span[contains(text(),'Find an Agent')]")
    public
    WebElement findAnAgentMenu;
    @FindBy(xpath = "//a[contains(text(),'Pay insurance bill')]")
    WebDriver payInsuranceBillMenu;
    @FindBy(xpath = "//a[contains(text(),'Enroll in AutoPay')]")
    public
    WebElement enrollInAutoPayMenu;
    @FindBy(xpath = "//a[contains(text(),'Go paperless')]")
    public
    WebElement goPaperLessMenu;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public
    WebElement search;
    @FindBy(xpath = "//span[contains(text(),'Help')]")
    public
    WebElement help;


    public void insuranceMenu() {
        click(insuranceMenu);
    }

    public void carInsurance() {
        click(carInsurance);
    }

    public void zipCodeField() {
        type(zipCodeField, "11233");
    }

    public void startAQuoteBtn() {
        click(startAQuoteBtn);
    }


    public void firstName() {
        type(firstName, "Amar");
    }

    public void lastName() {
        type(lastName, "Akbar");
    }

    public void streetAddress() {
        type(streetAddress, "667 Greene Ave");
    }

    public void aptUnit() {
        type(aptUnit, "3B");
    }

    public void dateOfBirth() {
        type(dateOfBirth, "04181999");
    }

    public void nextVehicles() {
        click(nextVehicles);
    }


    public void motorcycle() {
        click(motorcycle);
    }
    public void getZipCodeField() {type(getZipCodeField,"11233");
    }

    public void findAnAgent() {click(findAnAgent);
    }



    public void boat() {
        click(boat);
    }
    public void zipCodeField0() {type(zipCodeField0,"11233");
    }

    public void findAnAgent0() {click(findAnAgent0);
    }


    public void offRoadVehicles() {
        click(offRoadVehicles);
    }
    public void zipCodeField1() {type(zipCodeField1,"11233");
    }

    public void findAnAgent1() {click(findAnAgent1);
    }
    public void motorHome() {click(motorHome);
    }



    public void roadsideAssistance() {
        click(roadsideAssistance);
    }

    public void getRoadsideAssistance() {click(getRoadsideAssistance);
    }

    public void startMyRequest() {click(startMyRequest);
    }

    public void bankingMenu() {
        click(bankingMenu);
    }


    public void investmentsMenu() {
        click(investmentsMenu);
    }


    public void getAQuoteMenu() {
        click(getAQuoteMenu);
    }

    public void payABillMenu() {
        click(payABillMenu);
    }


    public void claimsMenu() {
        click(claimsMenu);
    }


    public void findAnAgentMenu() {
        click(findAnAgentMenu);
    }

    public void payInsuranceBillMenu() {
        click(payABillMenu);
    }

    public void enrollInAutoPayMenu() {
        click(enrollInAutoPayMenu);
    }

    public void goPaperLessMenu() {
        click(goPaperLessMenu);
    }

    public void search() {
        click(search);
    }

    public void help() {
        click(help);
    }


    public void homeAndProperty() {click(homeAndProperty);
    }

    public void getRentersInsurance() {click(getRentersInsurance);
    }

    public void smallBusiness() {click(smallBusiness);
    }

    public void zipCodeField3() {type(zipCodeField3,"11233");
    }

    public void getFindAnAgent3() {click(getFindAnAgent3);
    }

    public void life() {click(life);
    }

    public void findAnAgent4() {click(findAnAgent4);
    }

    public void state() {type(state,"NY");
    }

    public void goBtn() {click(goBtn);
    }

    public void health() {click(health);
    }

    public void getGetZipCodeField4() {type(getGetZipCodeField4,"11233");
    }

    public void getFindAnAgent4() {click(getFindAnAgent4);
    }

    public void disability() {click(disability);
    }

    public void getGetZipCodeField5() {type(getGetZipCodeField5,"07097");
    }

    public void getFindAnAgent5() {click(getFindAnAgent5);
    }

    public void home() {click(home);
    }

    public void getGetZipCodeField6() {type(getGetZipCodeField6,"11233");
    }

    public void getStartAQuoteBtn1() {click(getStartAQuoteBtn1);
    }

    public void getGetZipCodeField7() {type(getGetZipCodeField7,"11233");
    }

    public void getStartAQuoteBtn2() {click(getStartAQuoteBtn2);
    }

    public void condominium() {click(condominium);
    }

    public void rentersInsurance() {click(rentersInsurance);
    }

    public void getGetZipCodeField8() {type(getGetZipCodeField8,"11233");
    }

    public void getStartAQuoteBtn3() {click(getStartAQuoteBtn3);
    }

    public void rentalProperty() {click(rentalProperty);
    }

    public void getGetZipCodeField9() {type(getGetZipCodeField9,"11233");
    }

    public void getStartAQuoteBtn4() {click(getStartAQuoteBtn4);
    }

    public void personalArticles() {click(personalArticles);
    }

    public void getGetZipCodeField10() {type(getGetZipCodeField10,"11233");
    }

    public void getStartAQuoteBtn5() {click(getStartAQuoteBtn5);
    }

    public void manufacturedHome() {click(manufacturedHome);
    }

    public void getGetZipCodeField11() {type(getGetZipCodeField11,"11233");
    }

    public void getStartAQuoteBtn6() {click(getStartAQuoteBtn6);
    }

    public void farmAndRanch() {click(farmAndRanch);
    }

    public void getGetZipCodeField12() {type(getGetZipCodeField12,"11233");
    }

    public void getStartAQuoteBtn7() {click(getStartAQuoteBtn7);
    }

    public void identityRestoration() {click(identityRestoration);
    }

    public void talkToAStateFarmAgent() {click(talkToAStateFarmAgent);
    }

    public void getStreetAddress() {type(getStreetAddress,"234 Logan Street, Brooklyn, NY, USA");
    }

    public void getSearchBtn() {click(getSearchBtn);
    }

    public void businessOwnerPolicy() {click(businessOwnerPolicy);
    }

    public void zipCodeField4() {type(zipCodeField4,"11233");
    }

    public void findAnAgent5() {click(findAnAgent5);
    }

    public void commercialAuto() {click(commercialAuto);
    }

    public void zipCodeField5() {type(zipCodeField5,"11233");
    }

    public void findAnAgent6() {click(findAnAgent6);
    }

    public void contractorsPolicy() {click(contractorsPolicy);
    }

    public void zipCodeField6() {type(zipCodeField6,"11233");
    }

    public void findAnAgent7() {click(findAnAgent7);
    }

    public void liabilityUmbrella() {click(liabilityUmbrella);
    }

    public void zipCodeField7() {type(zipCodeField7,"11233");
    }

    public void findAnAgent8() {click(findAnAgent8);
    }

    public void workersCompensation() {click(workersCompensation);
    }

    public void zipCodeField8() {type(zipCodeField8,"11233");
    }

    public void findAnAgent9() {click(findAnAgent9);
    }

    public void suretyAndFidelityBond() {click(suretyAndFidelityBond);
    }

    public void zipCodeField9() {type(zipCodeField9,"11233");
    }

    public void findAnAgent10() {click(findAnAgent10);
    }

    public void termLife() {click(termLife);
    }

    public void state1() {type(state1,"AZ");
    }

   public void startAQuote() {click(startAQuote);
    }

    public void yesBtn() {click(yesBtn);
    }

    public void wholeLife() {click(wholeLife);
    }

    public void zipCodeField2() {type(zipCodeField,"11233");
    }

    public void getGoBtn() {click(getGoBtn);
    }

    public void getZipCodeField2() {type(getZipCodeField2,"11233");
    }

    public void universalLife() {click(universalLife);
    }

    public void getZipCodeField3() {type(getZipCodeField3,"11233");
    }

    public void getGoBtn1() {click(getGoBtn1);
    }

    public void changePolicy() {click(changePolicy);
    }

    public void getFindAnAgent() {click(getFindAnAgent);
    }

    public void getZipCodeField4() {type(getZipCodeField4,"11233");
    }

    public void changeBeneficiary() {click(changeBeneficiary);
    }

    public void getZipCodeField5() {type(getZipCodeField5,"11233");
    }

    public void getGetGoBtn() {click(getGoBtn);
    }

    public void getGoBtn3() {click(getGoBtn3);
    }
}








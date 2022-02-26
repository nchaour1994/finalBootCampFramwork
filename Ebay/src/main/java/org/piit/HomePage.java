package org.piit;
import base.commonApi;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.ObjectView;
import java.util.List;

public class HomePage extends commonApi {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'register')]")
    WebElement registerButton;
    @FindBy(xpath = "//a[text()='Creat new account']")
    WebElement searchField;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement searchButton;
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    WebElement menuDropdown;
    @FindBy(css = "#searchDropdownBox option")
    List<WebElement> menuDropdownOptions;
    @FindBy(xpath = "//*[text()='Account & Lists']")
    WebElement helloMenu;
    @FindBy(xpath = "//span[contains(text(),'Watchlist')]]")
    WebElement watchListLink;

    ///////////////////////////////////////////////////////////////////////// ;
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement helpContact;
    @FindBy(xpath = "//span[contains(text(),'Shipping & Tracking')]")
    WebElement shipingTrucking;
    @FindBy(xpath = "//a[@id='gh-as-a']")
    WebElement AdvancedButton;
    @FindBy(xpath = "//a[contains(text(),'Find Stores')]")
    WebElement FindStoreButton;
    @FindBy(xpath = "//h2[contains(text(),'Stores')]")
    WebElement Stores;
    @FindBy(xpath = "//span[contains(text(),'Beauty')]")
    WebElement Beauty;
    @FindBy(xpath = "//body[1]/div[5]/div[4]/ul[1]/li[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement makeup;
    @FindBy(xpath = "//span[contains(text(),'Skin Care')]")
    WebElement skincare;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
    WebElement Motors;
    @FindBy(xpath = "//div[contains(text(),'Exterior Parts')]")
    WebElement ExteriorParts;
    @FindBy(xpath = "//body/div[6]/div[4]/div[4]/section[1]/div[2]/a[1]")
    WebElement BumpersAndCompenents;
    @FindBy(xpath = "//div[contains(text(),'Grilles')]")
    WebElement Grilles;
    @FindBy(xpath = "//body/div[6]/div[4]/div[4]/section[1]/div[2]/a[6]/div[1]/img[1]")
    WebElement Panels;
    @FindBy(xpath = "//a[contains(text(),'Cars & Trucks')]")
    WebElement CarAndTrucks;
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]")
    WebElement Chevrolet;
    @FindBy(xpath = "//p[contains(text(),'Camaro')]")
    WebElement Camaro;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[1]/div[1]/h3[1]")
    WebElement ModelYear;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[2]/div[1]/h3[1]")
    WebElement BodyType;
    @FindBy(xpath = "//span[contains(text(),\"Men's Shoes\")]")
    WebElement MenShoes;
    @FindBy(xpath = "//h3[contains(text(),'Brand')]")
    WebElement Brand;
    @FindBy(xpath = "//body/div[5]/div[4]/ul[1]/li")
    WebElement adidas;
    @FindBy(xpath = "//h3[contains(text(),'EU Sho")
    WebElement UsshoeSize;
    @FindBy(xpath = "//h3[contains(text(),'Price')]")
    WebElement Price;
    @FindBy(xpath = "//span[contains(text(),'Sporting Goods')]")
    WebElement sportinggood;
    @FindBy(xpath = "//span[contains(text(),'Cycling')]")
    WebElement Cycling;
    @FindBy(xpath = "//span[contains(text(),'Team Sports')]")
    WebElement Sports;
    @FindBy(xpath = "//h3[contains(text(),'Condition')]")
    WebElement Condition;
    @FindBy(xpath = "//h3[contains(text(),'Price')]")
    WebElement price;
    @FindBy(xpath = "//span[contains(text(),'Home & Garden')]")
    WebElement HomeGarden;
    @FindBy(xpath = "//span[contains(text(),'Home Décor')]")
    WebElement Homedecor;
    @FindBy(xpath = "//span[contains(text(),'Furniture')]")
    WebElement Furniture;
    @FindBy(xpath = "//span[contains(text(),'Bedding')]")
    WebElement Bedding;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]")
    WebElement Jewelry;
    @FindBy(xpath = "//a[contains(text(),\"Men's Jewelry\")]\n")
    WebElement Mensjewelry;
    @FindBy(xpath = "//p[contains(text(),'Rings')]")
    WebElement Ring;
    @FindBy(xpath = "//span[contains(text(),'Condition')]")
    WebElement condition;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
    WebElement Toys;
    @FindBy(xpath = "//body/div[5]/div[4]/div[4]/section[1]/div[2]/a[3]/div[2]\n")
    WebElement Games;
    @FindBy(xpath = "//a[contains(text(),'Electronic Games')]\n")
    WebElement ElecronicGames;
    @FindBy(xpath = "//span[contains(text(),'Age Level')]\n")
    WebElement AgeLevel;
    @FindBy(xpath = "//span[text()='Cell Phone Accessories']")
    WebElement CellphoneAccessories;
    @FindBy(xpath = "//body/div[5]/div[4]/ul[1]/li")
    WebElement Samsung;
    @FindBy(xpath = "//a[@class='gh-p'][normalize-space()='Sell']")
    WebElement Sell;
    @FindBy(xpath = "//body/div[1]/div[2]/main[1]/div[1]/div[1]/section[6]/div[1]/div[1]/a[1]")
    WebElement ListAnItem;
    /////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[2]/a[1]")
    WebElement Company;
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[6]/a[1]")
    WebElement Invistors;
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[7]/a[1]")
    WebElement Carrers;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]")
    WebElement CollectiblesAndArt;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/")
    WebElement Antiques;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[7]/a[1]")
    WebElement Art;
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[3]/a[1]")
    WebElement Stories;
    @FindBy(xpath = "//a[contains(text(),'Announcements')]")
    WebElement Announcement;
    @FindBy(xpath = "//body/div[@id='main-content']/main[1]/aside[1]/div[1]/a[3]")
    WebElement Commerce;
    @FindBy(xpath = "//body/div[@id='main-content']/main[1]/aside[1]/div[1]/a[7]")
    WebElement Financial;
    @FindBy(xpath = "//a[contains(text(),'Leadership')]")
    WebElement Leadership;
    @FindBy(xpath = "//h3[contains(text(),'eBay Names Steve Priest Chief Financial Officer')]")
    WebElement FinancialOfficer;
    @FindBy(xpath = "//h3[contains(text(),'eBay Names Julie Loeger Global Chief Growth Office')]")
    WebElement ChiefGrowthOfficer;
    @FindBy(xpath = "//h3[contains(text(),'eBay Inc. Announces Changes to its Board of Direct')]")
    WebElement BoardOfDirectors;
    @FindBy(xpath = "//a[contains(text(),'Purpose')]")
    WebElement Purpose;
    @FindBy(xpath = "//h3[contains(text(),'Giving")
    WebElement GivingForGood;
    @FindBy(xpath = "//h3[contains(text(),\"eBay Launches 2021 'Up & Running Grants' to Suppor\")]")
    WebElement Success;
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[5]/a[1]")
    WebElement tech;
    @FindBy(xpath = "//header/nav[1]/div[1]/ul")
    WebElement Archive;
    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement Events;
    @FindBy(xpath = "//header/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement Products;
    @FindBy(xpath = "//header/div[@id='sticky-wrap-sticky-el-0']/div[1]/div[2]/div[2]/div[2]/span[4]/a[1]")
    WebElement ContactUs;
    @FindBy(xpath = "//a[contains(text(),'Get Directions')]\n")
    WebElement GetDirections;
    @FindBy(xpath = "//body/div[@id='main-content']/main[1]/div[1]/div[3]/p[2]/a[2]")
    WebElement PressRoom;
    @FindBy(xpath = "//a[contains(text(),'Contact Careers')]")
    WebElement ContactCarrers;
    @FindBy(xpath = "//a[contains(text(),'Stores Hub')]")
    WebElement StoresHub;
    @FindBy(xpath = "//a[contains(text(),'Open a Store')]\n")
    WebElement OpenAstore;
    @FindBy(xpath = "//h3[normalize-space()='BuyDig']")
    WebElement BuyDig;
    @FindBy(xpath = "//body/div[5]/div[4]/div[4]/section[5]/div[2]/a[9]/div[2]")
    WebElement Bose;
    @FindBy(xpath = "//a[contains(text(),'Deals')]")
    WebElement Deals;
    @FindBy(xpath = "//a[contains(text(),'Customer Service')]")
    WebElement CustomerService;
    @FindBy(xpath = "//span[contains(text(),'Contact us')]")
    WebElement Contactus;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/div[2]/div[1]/nav[1]/ul[1]/li[7]/a[1]")
    WebElement MyGarage;
    @FindBy(xpath = "//a[contains(text(),'Announcements')]")
    WebElement Announcements;
    @FindBy(xpath = "//a[contains(text(),'Announcements')]")
    WebElement Community;
    @FindBy(xpath = "//a[contains(text(),'Seller Center')]")
    WebElement SellerCenter;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[13]/div[2]/a[10]")
    WebElement EbayRefurbished;
    @FindBy(xpath = "//body[1]/div[5]/div[4]/div[4]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement CertifiedRefurbished;
    @FindBy(xpath = "//body[1]/div[5]/div[4]/div[4]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement Exellent;
    @FindBy(xpath = "//body[1]/div[5]/div[4]/div[4]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement VeryGood;
    ///////////////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "(//a[@class='gh-p'])[2]")
    WebElement BrandOutletButton;
    @FindBy(xpath = "//span[contains(text(),'Clothing')]")
    WebElement ClothingButton;
    @FindBy(xpath = "//span[contains(text(),'Handbags')]")
    WebElement Handbags;
    @FindBy(xpath = "//span[contains(text(),'Watches')]")
    WebElement WatchesButton;
    @FindBy(xpath = "//a[contains(text(),'Daily Deals')]")
    WebElement DailyDealsButton;
    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    WebElement FeaturedButton;
    @FindBy(xpath = "//span[contains(text(),'Sales & Events')]")
    WebElement SalesEventsButton;
    @FindBy(xpath = "//h3[contains(text(),'For friends')]")
    WebElement ForFriendsButton;
    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
    WebElement AutomotiveButton;
    @FindBy(xpath = "//body/main[@id='mainContent']/div[@id='refit-spf-container']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")
    WebElement LifeTimeWarantyButton;
    @FindBy(xpath = "//span[contains(text(),'Automotive Tools')]")
    WebElement AutomotiveTools;
    @FindBy(xpath = "//a[contains(text(),'Site Map')]")
    WebElement SiteMap;
    @FindBy(xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement FashionButton;
    @FindBy(xpath = "//span[contains(text(),\"Men's Shoes\")]")
    WebElement MensShoesButton;
    @FindBy(xpath = "//body/main[@id='mainContent']/div[@id='refit-spf-container']/div[1]/h1[1]/a[1]")
    WebElement DealsButton;
    @FindBy(xpath = "//body/main[@id='mainContent']/div[@id='refit-spf-container']/div[2]/div[1]/div[1]/map[1]/area[1]")
    WebElement GetTheSavingsButton;
    @FindBy(xpath = "//a[normalize-space()='Policies']")
    WebElement PoliciesButton;
    @FindBy(xpath = "//a[normalize-space()='Cookie Notice']")
    WebElement CookieNoticeButton;
    @FindBy(xpath = "//a[normalize-space()='Affiliates']")
    WebElement AffiliatesButton;
    @FindBy(xpath = "//a[normalize-space()='Solutions']")
    WebElement Solutions;
    @FindBy(xpath = "//a[normalize-space()='Site Map']")
    WebElement siteMap;
    @FindBy(xpath = "//a[normalize-space()='Buy']")
    WebElement BuyButton;
    @FindBy(xpath = "//a[normalize-space()='Security Center']")
    WebElement SecurityCenterButton;
    @FindBy(xpath = "//a[normalize-space()='Security Researchers']")
    WebElement SecurityResearchers;
    @FindBy(xpath = "//div[@id='main-nav-menu']//div[2]//span[2]//a[1]")
    WebElement PressRoomButton;
    @FindBy(xpath = "//a[contains(text(),'Infographics')]")
    WebElement Infographics;
    @FindBy(xpath = "//a[contains(text(),'Campus Photos')]")
    WebElement CampusPhotos;
    @FindBy(xpath = "//a[normalize-space()='News']")
    WebElement NewsButton;
    @FindBy(xpath = "//a[normalize-space()='Commerce']")
    WebElement commerceButton;
    @FindBy(xpath = "//body/div[@id='main-content']/main[1]/div[2]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]")
    WebElement PressRelease;
    @FindBy(xpath = "//a[normalize-space()='Diversity & Inclusion']")
    WebElement DeversityInclusion;
    @FindBy(xpath = "//nav[@aria-label='Section']//a[normalize-space()='Overview']")
    WebElement Overview;
    @FindBy(xpath = "//a[@href='/impact/economic-opportunity/']")
    WebElement LearnMore;
    @FindBy(xpath = "//a[normalize-space()='Automotive Hand Wrenches']")
    WebElement AutomotiveHandWrenches;
    @FindBy(xpath = "//span[normalize-space()='Ratchets']")
    WebElement RatchetsButton;
    @FindBy(xpath = "//h3[normalize-space()='Chanel']")
    WebElement ChanelButton;
    @FindBy(xpath = "//h3[normalize-space()='Style']")
    WebElement Style;
    @FindBy(xpath = "//h3[normalize-space()='Gucci']")
    WebElement GucciButton;
    @FindBy(xpath = "//span[normalize-space()='Clutch']")
    WebElement ClutchButton;
    @FindBy(xpath = "//h3[normalize-space()='Rolex']")
    WebElement RolexButton;
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement WomenButton;
    @FindBy(xpath = "//a[normalize-space()='Developers']")
    WebElement DevelopersButton;
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement RegisterButton;
    @FindBy(xpath = "//a[normalize-space()='Company info']")
    WebElement CompanyInfoButton;
    @FindBy(xpath = "//div[@id='main-nav-menu']//div[2]//span[3]//a[1]")
    WebElement FollowUsButton;
    @FindBy(xpath = "//a[@aria-label='Follow eBay on LinkedIn - For company news, culture, and career opportunities.']//strong[contains(text(),'eBay')]")
    WebElement EbayButton;
    @FindBy(xpath = "//a[normalize-space()='Start selling']")
    WebElement StartSelling;
    @FindBy(xpath = "//a[normalize-space()='Learn more about fees.']")
    WebElement Fees;
    @FindBy(xpath = "//a[normalize-space()='Investors']")
    WebElement Investors;
    @FindBy(xpath = "//nav[@aria-label='Section']//a[normalize-space()='Investor Day']")
    WebElement InvestorDay;
    @FindBy(xpath = "//a[normalize-space()='Global Impact']")
    WebElement GlobalImpact;
    @FindBy(xpath = "//a[@class='js-l1-link'][normalize-space()='Impact']")
    WebElement ImpactButton;





    //////////////////////////////////////////////////////////////////////////////

    public void selectDropdownOption(String option) {
        selectDropdownOption(menuDropdown, option);
    }

    public List<WebElement> selectDropdownOptions() {
        return getDropdownOptions(menuDropdown);
    }

    public void clickOnMenuDropDown() {
        click(menuDropdown);
    }

    public void selectFromDropdownOptionsList(String choice) {
        List<WebElement> dropdownList = menuDropdownOptions;
        for (WebElement element : dropdownList) {
            if (element.getText().equals(choice)) {
                element.click();
            }
        }
    }

    public void hoverOverHelloMenu(WebDriver driver) {
        hoverOver(driver, helloMenu);
    }

    public void clickOnWatchList() {
        clickById(watchListLink);
    }

    ////////////////////////////////////////////////////
    public void helpAndContact() {
        click(helpContact);
        waitFor(3);
        click(shipingTrucking);
        waitFor(3);
    }

    public void Advanced() {
        click(AdvancedButton);
    }

    public void setFindStoreButton() {
        click(FindStoreButton);
    }

    public void Beauty() {
        click(Beauty);
    }

    public void makup() {
        click(makeup);
    }

    public void setSkincare() {
        click(skincare);

    }

    public void Motors() {
        click(Motors);
        waitFor(3);
        click(ExteriorParts);
        waitFor(3);
        click(BumpersAndCompenents);
        waitFor(3);
        click(Grilles);
        waitFor(3);
        click(Panels);
        waitFor(3);
    }

    public void carAndTrucks() {
        click(Chevrolet);
        waitFor(3);
        click(Camaro);
        waitFor(3);
        click(ModelYear);
        waitFor(3);
        click(BodyType);
        waitFor(3);

    }

    public void MenShoes() {
        click(Brand);
        waitFor(3);
        click(adidas);
        waitFor(3);
        click(UsshoeSize);
        waitFor(3);
        click(Price);
        waitFor(3);
    }


    public void SportingGoods() {
        click(Cycling);
        waitFor(3);
        click(Sports);
        waitFor(3);
        click(Condition);
        waitFor(3);
        click(price);
        waitFor(3);
    }

    public void HomeGarden() {
        click(Homedecor);
        waitFor(3);
        click(Furniture);
        waitFor(3);
        click(Bedding);
        waitFor(3);

    }


    public void Jewelry() {
        click(Mensjewelry);
        waitFor(3);
        click(Ring);
        waitFor(3);
        click(Condition);
        waitFor(3);

    }

    public void toys() {
        click(Games);
        waitFor(3);
        click(ElecronicGames);
        waitFor(3);
        click(AgeLevel);
        waitFor(3);

    }

    public void CellphoneAccessories() {
        click(CellphoneAccessories);
        waitFor(3);
        click(Samsung);
        waitFor(3);

    }

    public void Sell() {
        click(Sell);
        waitFor(3);
        click(ListAnItem);
        waitFor(3);

    }


    ///////////////////////////////////////////////////////////////////////////////
    public void Company() {
        click(Company);
        waitFor(3);
        click(Invistors);
        waitFor(3);
        click(Carrers);
        waitFor(3);

    }

    public void CollectiblesAndArt() {
        click(CollectiblesAndArt);
        waitFor(3);
        click(Antiques);
        waitFor(3);
        click(Art);
        waitFor(3);

    }

    public void Stories() {
        click(Stories);
        waitFor(3);
        click(Announcement);
        waitFor(3);
        click(Commerce);
        waitFor(3);
        click(Financial);
        waitFor(3);

    }

    public void Leadership() {
        click(Leadership);
        waitFor(3);
        click(FinancialOfficer);
        waitFor(3);
        click(ChiefGrowthOfficer);
        waitFor(3);
        click(BoardOfDirectors);
        waitFor(3);

    }


    public void Purpose() {
        click(Purpose);
        waitFor(3);
        click(GivingForGood);
        waitFor(3);
        click(Success);
        waitFor(3);

    }

    public void tech() {
        click(Archive);
        waitFor(3);
        click(Events);
        waitFor(3);
        click(Products);
        waitFor(3);

    }

    public void ContactUs() {
        click(GetDirections);
        waitFor(3);
        click(PressRoom);
        waitFor(3);
        click(ContactCarrers);
        waitFor(3);

    }

    public void StoresHub() {
        click(OpenAstore);
        waitFor(3);
        click(BuyDig);
        waitFor(3);
        click(Bose);
        waitFor(3);

    }

    public void CostumerService() {
        click(CustomerService);
        waitFor(3);
        click(ContactUs);
        waitFor(3);


    }

    public void MyGarage() {
        click(Announcement);
        waitFor(3);
        click(Community);
        waitFor(3);
        click(SellerCenter);
        waitFor(3);
    }

    public void EbayRefurbished() {
        click(CertifiedRefurbished);
        waitFor(3);
        click(Exellent);
        waitFor(3);
        click(VeryGood);
        waitFor(3);
    }


    public void setBrandOutlet() {
        click(BrandOutletButton);

    }

    public void setClothingButton() {
        click(ClothingButton);

    }

    public void Handbags() {
        click(Handbags);
    }

    public void WatchesButton() {
        click(WatchesButton);

    }


    public void DailyDeals() {
        click(DailyDealsButton);
    }

    public void setFeaturedButton() {
        click(FeaturedButton);
    }


    public void SalesEvents() {
        click(SalesEventsButton);
    }

    public void setForFriendsButton() {
        click(ForFriendsButton);

    }

    public void setCertifiedRefurbishedAnker() {
        click(CertifiedRefurbished);
    }

    public void Automotive() {
        click(AutomotiveButton);

    }

    public void setLifeTimeWaranty() {
        click(LifeTimeWarantyButton);
    }

    public void AutomotiveTools() {
        click(AutomotiveTools);
    }

    public void SiteMap() {
        click(SiteMap);
    }

    public void Fashion() {
        click(FashionButton);
    }

    public void setMensShoesButton() {
        click(MensShoesButton);
    }

    public void Deals() {
        click(DealsButton);
    }

    public void setGetTheSavingsButton() {
        click(GetTheSavingsButton);
    }

    public void Policies() {
        click(PoliciesButton);
    }

    public void SetCockieNotice() {
        click(CookieNoticeButton);

    }

    public void Affiliates() {

        click(AffiliatesButton);
    }

    public void SetSolutions() {

        click(Solutions);
    }

    public void siteMap() {

        click(siteMap);
    }

    public void SetBuy() {
        click(BuyButton);
    }

    public void SecurityCenter() {
        click(SecurityCenterButton);
    }

    public void setSecurityResearchers() {
        click(SecurityResearchers);
    }

    public void PressRoom() {
        click(PressRoomButton);
    }

    public void Infographic() {
        click(Infographics);
    }

    public void setCampusPhotos() {
        click(CampusPhotos);
    }

    public void PressRoomButton() {
        click(PressRoomButton);
    }

    public void News() {
        click(NewsButton);
    }

    public void setCommerceButton() {
        click(commerceButton);
    }

    public void PressRelease() {
        click(PressRelease);
    }

    public void DeversityInclusion() {
        click(DeversityInclusion);
    }


    public void setOverview() {
        click(Overview);

    }


    public void LearnMore() {
        click(LearnMore);
    }


    public void AutomotiveHandWrenches() {
        click(AutomotiveHandWrenches);
    }

    public void setRatchetsButton() {
        click(RatchetsButton);
    }


    public void ChanelButton() {
        click(ChanelButton);
    }

    public void setStyle() {
        click(Style);
    }


    public void Gucci() {
        click(GucciButton);

    }

    public void setClutchButton() {
        click(ClutchButton);
    }


    public void Rolex() {
        click(RolexButton);
    }

    public void setWomenButton() {
        click(WomenButton);
    }

    public void Developers() {
        click(DevelopersButton);
    }

    public void setRegisterButton() {
        click(RegisterButton);
    }

    ///////////////////////////////////////////////////////
    public void CompanyInfo() {
        click(CompanyInfoButton);
    }

    public void FollowUs() {
        click(FollowUsButton);
    }


    public void setEbayButton() {
        click(EbayButton);
    }

    public void StartSelling() {
        click(StartSelling);
    }

    public void setFees() {
        click(Fees);
    }

    public void Investors() {
        click(Investors);
    }

    public void setInvestorDay() {
        click(InvestorDay);
    }

    public void GlobalImpact() {
        click(GlobalImpact);
    }

    public void setImpactButton(){
             click(ImpactButton);
    }
}

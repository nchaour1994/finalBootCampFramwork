package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingPage extends commonApi {


    public BankingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public
    WebElement bankingMenu;
    @FindBy(xpath = "//a[@class='-oneX-link--block menuLevel2 ']")
    public
    WebElement checking;
    @FindBy(xpath = "//a[@class='-oneX-btn-primary__anchor']")
    public
    WebElement compareCheckingAccountsBtn;
    @FindBy(xpath = "//a[@id='thirdPartyLinkModal-continue']")
    public
    WebElement continueBtn;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]")
    public
    WebElement saving;
    @FindBy(xpath = "//a[@class='-oneX-btn-primary__anchor']")
    public
    WebElement compareSavingsAccounts;
    @FindBy(xpath = "//a[@id='thirdPartyLinkModal-continue']")
    WebElement getContinueBtn;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[3]/a[1]")
    public
    WebElement creditCards;
    @FindBy(xpath = "//a[@class='-oneX-btn-primary__anchor -oneX-btn-fit-content']")
    public
    WebElement learnMoreWithUSBank;
    @FindBy(xpath = "//a[@id='thirdPartyLinkModal-continue']")
    public
    WebElement continueBtn0;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")
    public
    WebElement CDs;
    @FindBy(xpath = "//a[@class='-oneX-link--block -oneX-d-block mobile-border -w_pb-25 -w_pb-md-40 -w_pb-xl-48']")
    public
    WebElement learnMoreAboutStandardCDs;
    @FindBy(xpath = "//a[@id='thirdPartyLinkModal-continue2']")
    public
    WebElement continueBtn1;
    @FindBy(xpath = "//a[contains(text(),'Home Loans')]")
    public
    WebElement homeLoans;
    @FindBy(xpath = "//a[contains(text(),'Learn more')]")
    public
    WebElement learnMore;
    @FindBy(xpath = "//input[@id='callout-agent-zip-code-input1']")
    public
    WebElement zipCodeField;
    @FindBy(xpath = "//button[@id='quote-main-zip-code-button1']")
    public
    WebElement findAnAgentBtn;
    @FindBy(xpath = "//a[contains(text(),'Retirement CDs')]")
    public
    WebElement retirementCDs;
    @FindBy(xpath = "//a[contains(text(),'Learn more about Retirement CDs')]")
    public
    WebElement learnMoreAboutRetirementCDs;
    @FindBy(xpath = "//a[contains(text(),'Checking, Savings & Money Market')]")
    public
    WebElement checkingSavingsAndMoneyMarket;
    @FindBy(css = "a[aria-describedby=silver]")
    public
    WebElement applyForASilverBusinessCheckingPackage;
    @FindBy(css = "button#submit.-oneX-btn-secondary")
    public
    WebElement continueAsGuest;
    @FindBy(xpath = "//a[contains(text(),'Payment Solutions')]")
    public
    WebElement paymentSolutions;
    @FindBy(xpath = "//a[contains(text(),'Find your payment solution')]")
    public
    WebElement findYourPaymentSolution;
    @FindBy(css = "button#submit.-oneX-btn-secondary")
    public
    WebElement getContinueAsGuest;
    @FindBy(css = "input#input_checkbox_Countertop")
    public
    WebElement counterTop;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[2]/section[1]/ul[1]/li[4]/a[1]")
    public
    WebElement getCreditCards;
    @FindBy(xpath = "//a[contains(text(),'Loans & Lines of Credit')]")
    public
    WebElement loansAndLinesOfCredit;







    public void checking() {click(checking);}
    public void compareCheckingAccountsBtn() {click(compareCheckingAccountsBtn);}
    public void continueBtn() {click(continueBtn);}
    public void saving() {click(saving);}
    public void compareSavingsAccounts() {click(compareSavingsAccounts);}


    public void creditCards() {click(creditCards);}
    public void learnMoreWithUSBank() {click(learnMoreWithUSBank);}
    public void continueBtn0() {click(continueBtn0);}

    public void CDs() {click(CDs);}

    public void learnMoreAboutStandardCDs() {click(learnMoreAboutStandardCDs);}


    public void continueBtn1() {click(continueBtn1);}

    public void homeLoans() {click(homeLoans);}

    public void learnMore() {click(learnMore);}

    public void zipCodeField() {type(zipCodeField,"11233");}

    public void findAnAgentBtn() {click(findAnAgentBtn);}

    public void retirementCDs() {click(retirementCDs);}

    public void learnMoreAboutRetirementCDs() {click(learnMoreAboutRetirementCDs);}

    public void checkingSavingsAndMoneyMarket() {click(checkingSavingsAndMoneyMarket);}

    public void applyForASilverBusinessCheckingPackage() {click(applyForASilverBusinessCheckingPackage);}

    public void continueAsGuest() {click(continueAsGuest);}

    public void paymentSolutions() {click(paymentSolutions);
    }

    public void findYourPaymentSolution() {click(findYourPaymentSolution);}

    public void getContinueAsGuest() {click(getContinueAsGuest);}

    public void counterTop() {click(counterTop);}

    public void getCreditCards() {click(getCreditCards);}

    public void loansAndLinesOfCredit() {click(loansAndLinesOfCredit);}
}

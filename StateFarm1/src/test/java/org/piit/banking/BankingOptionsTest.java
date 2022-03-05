package org.piit.banking;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.BankingPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingOptionsTest extends commonApi {

    @Test
    public void personalBankingCheckingTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.checking.isEnabled());
        bankingPage.checking();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(bankingPage.compareCheckingAccountsBtn.isEnabled());
        bankingPage.compareCheckingAccountsBtn();
        Assert.assertTrue(bankingPage.continueBtn.isEnabled());
        bankingPage.continueBtn();
        Assert.assertEquals(getTitle(), "Open an Online Checking Account that Fits Your Needs");
    }

    @Test
    public void personalBankingSavingTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.saving.isEnabled());
        bankingPage.saving();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(bankingPage.compareSavingsAccounts.isEnabled());
        bankingPage.compareSavingsAccounts();
        Assert.assertTrue(bankingPage.continueBtn.isEnabled());
        bankingPage.continueBtn();
        Assert.assertEquals(getTitle(), "Types of Savings Accounts - State Farm®");

    }

    @Test
    public void personalBankingCreditCardTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.creditCards.isEnabled());
        bankingPage.creditCards();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(bankingPage.learnMoreWithUSBank.isEnabled());
        bankingPage.learnMoreWithUSBank();
        Assert.assertTrue(bankingPage.continueBtn0.isEnabled());
        bankingPage.continueBtn0();
        Assert.assertEquals(getTitle(), "Visa Credit Cards from U.S. Bank® – State Farm®");

    }

    @Test
    public void personalBankingCDsTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.CDs.isEnabled());
        bankingPage.CDs();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,7050)");
        Assert.assertTrue(bankingPage.learnMoreAboutStandardCDs.isEnabled());
        bankingPage.learnMoreAboutStandardCDs();
        Assert.assertTrue(bankingPage.continueBtn1.isEnabled());
        bankingPage.continueBtn1();
        Assert.assertEquals(getTitle(), "Certificate of Deposit (CD) Accounts, Retirement CDs & Rates – State Farm®");
    }
    @Test
    public void personalBankingHomeLoansTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.homeLoans.isEnabled());
        bankingPage.homeLoans();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,550)");
        Assert.assertTrue(bankingPage.learnMore.isEnabled());
        bankingPage.learnMore();
        Assert.assertTrue(bankingPage.zipCodeField.isEnabled());
        bankingPage.zipCodeField();
        Assert.assertTrue(bankingPage.findAnAgentBtn.isEnabled());
        bankingPage.findAnAgentBtn();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");
    }
   @Test
    public void personalBankingRetirementCDsTest() {
       InsurancePage homePageV = new InsurancePage(driver);
       BankingPage bankingPage = new BankingPage(driver);
       Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
       Assert.assertTrue(homePageV.bankingMenu.isEnabled());
       homePageV.bankingMenu();
       Assert.assertTrue(bankingPage.retirementCDs.isEnabled());
       bankingPage.retirementCDs();
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,5050)");
       Assert.assertTrue(bankingPage.learnMoreAboutRetirementCDs.isEnabled());
       bankingPage.learnMoreAboutRetirementCDs();
       Assert.assertEquals(getTitle(), "Certificate of Deposit (CD) Accounts, Retirement CDs & Rates – State Farm®");

    }

        @Test
        public void businessCheckingSavingsAndMoneyMarketTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.checkingSavingsAndMoneyMarket.isEnabled());
        bankingPage.checkingSavingsAndMoneyMarket();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,9050)");
        Assert.assertTrue(bankingPage.applyForASilverBusinessCheckingPackage.isEnabled());
        bankingPage.applyForASilverBusinessCheckingPackage();
        Assert.assertTrue(bankingPage.continueAsGuest.isEnabled());
        bankingPage.continueAsGuest();
              }

    @Test
    public void businessBankingPaymentSolutionsTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.paymentSolutions.isEnabled());
        bankingPage.paymentSolutions();
        waitFor(1);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,9550)");
        Assert.assertTrue(bankingPage.findYourPaymentSolution.isEnabled());
        bankingPage.findYourPaymentSolution();
        Assert.assertTrue(bankingPage.getContinueAsGuest.isEnabled());
        bankingPage.getContinueAsGuest();
        waitFor(1);
        Assert.assertTrue(bankingPage.counterTop.isEnabled());
        bankingPage.counterTop();
        Assert.assertEquals(getTitle(), "talech POS");



    }

    @Test
    public void businessBankingCreditCardsTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.getCreditCards.isEnabled());
        bankingPage.getCreditCards();
        Assert.assertEquals(getTitle(), "Visa Credit Cards from U.S. Bank® – State Farm®");
    }
    @Test
    public void businessBankingLoansAndLinesOfCreditTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        BankingPage bankingPage = new BankingPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.bankingMenu.isEnabled());
        homePageV.bankingMenu();
        Assert.assertTrue(bankingPage.loansAndLinesOfCredit.isEnabled());
        bankingPage.loansAndLinesOfCredit();
        Assert.assertEquals(getTitle(), "Business Loans and Lines of Credit");
    }


}
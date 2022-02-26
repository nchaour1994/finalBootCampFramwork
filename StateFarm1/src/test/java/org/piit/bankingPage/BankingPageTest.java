package org.piit.bankingPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.piit.BankingPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingPageTest extends commonApi {

   @Test

    public void bankingPageTest(){
        InsurancePage homePageV = new InsurancePage(driver);
       BankingPage bankingPage=new BankingPage(driver);
       Assert.assertTrue(bankingPage.bankingMenu.isEnabled());


      homePageV.bankingMenu();
       bankingPage.personalBanking();
       waitFor(2);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
       bankingPage.bankingOption();

       bankingPage.checkingAccount();

       homePageV.bankingMenu();
       bankingPage.saving();

        homePageV.bankingMenu();
        bankingPage.creditCard();

        homePageV.bankingMenu();
        bankingPage.cDS();

        homePageV.bankingMenu();
        bankingPage.retirementCds();

        homePageV.bankingMenu();












    }





}

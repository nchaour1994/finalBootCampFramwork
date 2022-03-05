package org.piit.investments;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.InsurancePage;
import org.piit.InvestmentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InvestmentsFeaturesTest extends commonApi {

 @Test
    public void retirementAndIRATest() {
     InsurancePage homePageV = new InsurancePage(driver);
     InvestmentsPage investmentsPage = new InvestmentsPage(driver);
     Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
     Assert.assertTrue(homePageV.investmentsMenu.isEnabled());
     homePageV.investmentsMenu();
     investmentsPage.retirementAndIRA();
     Assert.assertTrue(investmentsPage.learnAboutIraBonus.isEnabled());
     investmentsPage.learnAboutIraBonus();
     waitFor(2);
     Set<String> handlesSet = driver.getWindowHandles();
     List<String> handlesList = new ArrayList<String>(handlesSet);
     driver.switchTo().window(handlesList.get(1));
     driver.close();
     driver.switchTo().window(handlesList.get(0));
     Assert.assertEquals(getTitle(), "Individual Retirement Accounts - State Farm®");

 }
     @Test
     public void mutualFundsTest() {
         InsurancePage homePageV = new InsurancePage(driver);
         InvestmentsPage investmentsPage = new InvestmentsPage(driver);
         Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
         Assert.assertTrue(homePageV.investmentsMenu.isEnabled());
         homePageV.investmentsMenu();
         Assert.assertTrue(investmentsPage.mutualFunds.isEnabled());
         investmentsPage.mutualFunds();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,250)");
         Assert.assertTrue(investmentsPage.learnMoreAboutIraBonus.isEnabled());
         investmentsPage.learnMoreAboutIraBonus();
         Assert.assertEquals(getTitle(), "Mutual Funds - State Farm®");
     }

         @Test
         public void educationSavingsTest() {
             InsurancePage homePageV = new InsurancePage(driver);
             InvestmentsPage investmentsPage = new InvestmentsPage(driver);
             Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
             Assert.assertTrue(investmentsPage.investmentsMenu.isEnabled());
             homePageV.investmentsMenu();
             Assert.assertTrue(investmentsPage.educationSavings.isEnabled());
             investmentsPage.educationSavings();
             JavascriptExecutor jse = (JavascriptExecutor)driver;
             jse.executeScript("window.scrollBy(0,250)");
             Assert.assertTrue(investmentsPage.learnmMoreATheStateFarm529SavingsPlan.isEnabled());
             investmentsPage.learnmMoreATheStateFarm529SavingsPlan();
             Assert.assertEquals(getTitle(), "529 Savings Plan - State Farm®");
         }
    @Test
    public void estatePlanningTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        InvestmentsPage investmentsPage = new InvestmentsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(investmentsPage.investmentsMenu.isEnabled());
        homePageV.investmentsMenu();
        Assert.assertTrue(investmentsPage.estatePlanning.isEnabled());
        investmentsPage.estatePlanning();
        Assert.assertTrue(investmentsPage.zipCodeField.isEnabled());
        investmentsPage.zipCodeField();
        Assert.assertTrue(investmentsPage.goBtn.isEnabled());
        investmentsPage.goBtn();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

    }
    @Test
    public void annuitiesTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        InvestmentsPage investmentsPage = new InvestmentsPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(investmentsPage.investmentsMenu.isEnabled());
        homePageV.investmentsMenu();
        Assert.assertTrue(investmentsPage.annuities.isEnabled());
        investmentsPage.annuities();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,5050)");
        Assert.assertTrue(investmentsPage.getZipCodeField.isEnabled());
        investmentsPage.getZipCodeField();
        Assert.assertEquals(getTitle(), "Retirement Annuity Products - State Farm®");






       }
}
package org.piit.investmentsPage;

import base.commonApi;
import org.piit.BankingPage;
import org.piit.InsurancePage;
import org.piit.InvestmentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InvestmentsPageTest extends commonApi {

// @Test
    public void investmentsPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        InvestmentsPage investmentsPage = new InvestmentsPage(driver);
         Assert.assertTrue(investmentsPage.investmentsMenu.isEnabled());
        homePageV.investmentsMenu();
        waitFor(2);
        investmentsPage.retirementAndIRA();
        waitFor(2);
        investmentsPage.learnAboutIraBonus();
        waitFor(2);
     Set<String> handlesSet = driver.getWindowHandles();
     List<String> handlesList = new ArrayList<String>(handlesSet);
     driver.switchTo().window(handlesList.get(1));
     driver.close();
     driver.switchTo().window(handlesList.get(0));
        homePageV.investmentsMenu();
        investmentsPage.mutualFunds();
        waitFor(2);
        homePageV.investmentsMenu();
        investmentsPage.educationSavings();
        waitFor(2);
        homePageV.investmentsMenu();
        investmentsPage.estatePlanning();
        waitFor(2);
        homePageV.investmentsMenu();
        investmentsPage.annuities();
        waitFor(2);



    }
}
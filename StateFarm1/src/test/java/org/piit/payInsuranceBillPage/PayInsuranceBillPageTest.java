package org.piit.payInsuranceBillPage;

import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.piit.FindAnAgentPage;
import org.piit.InsurancePage;
import org.piit.PayInsuranceBillPage;
import org.testng.annotations.Test;

import static org.piit.PayABillPage.payABillPage;

public class PayInsuranceBillPageTest extends commonApi {
    @Test
    public void payInsuranceBillPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        PayInsuranceBillPage payInsuranceBillPage = new PayInsuranceBillPage(driver);
        //Assert.assertTrue(PayInsuranceBillPage.payInsuranceBillPage.isEnabled());


        homePageV.payABillMenu();

        payInsuranceBillPage.phoneNumberField();

        payInsuranceBillPage.dateOfBirthField();

        payInsuranceBillPage.payNowBtn();














    }











}

package org.piit.insurancePage;


import base.commonApi;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsurancePageTest extends commonApi
{

    @Test

    public void carInsurance(){
        InsurancePage homePageV=new InsurancePage(driver);
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
//         Assert.assertTrue(insurancePage.carInsuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        waitFor(2);
        homePageV.carInsurance();
        waitFor(2);
        homePageV.insuranceMenu();
        homePageV.motorcycle();
        waitFor(2);
        homePageV.insuranceMenu();
        homePageV.boat();
        waitFor(2);
        homePageV.insuranceMenu();
        homePageV.offRoadVehicles();
        waitFor(2);
        homePageV.insuranceMenu();
        homePageV.roadsideAssistance();

        waitFor(2);


    }

}

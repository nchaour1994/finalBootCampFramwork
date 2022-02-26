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

        homePageV.carInsurance();

        homePageV.insuranceMenu();
        homePageV.motorcycle();

        homePageV.insuranceMenu();
        homePageV.boat();

        homePageV.insuranceMenu();
        homePageV.offRoadVehicles();

        homePageV.insuranceMenu();
        homePageV.roadsideAssistance();

        waitFor(2);


    }

}

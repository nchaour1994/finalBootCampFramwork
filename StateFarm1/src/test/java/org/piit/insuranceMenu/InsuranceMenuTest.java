package org.piit.insuranceMenu;


import base.commonApi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.piit.BankingPage;
import org.piit.InsurancePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsuranceMenuTest extends commonApi {

    @Test
    public void carInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.carInsurance.isEnabled());
        insurancePage.carInsurance();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
            Assert.assertTrue(insurancePage.zipCodeField.isEnabled());
        insurancePage.zipCodeField();
            Assert.assertTrue(insurancePage.startAQuoteBtn.isEnabled());
        insurancePage.startAQuoteBtn();
            Assert.assertTrue(insurancePage.firstName.isEnabled());
        insurancePage.firstName();
            Assert.assertTrue(insurancePage.lastName.isEnabled());
        insurancePage.lastName();
            Assert.assertTrue(insurancePage.streetAddress.isEnabled());
        insurancePage.streetAddress();
            Assert.assertTrue(insurancePage.aptUnit.isEnabled());
        insurancePage.aptUnit();
            Assert.assertTrue(insurancePage.dateOfBirth.isEnabled());
        insurancePage.dateOfBirth();
            Assert.assertEquals(getTitle(), "Welcome - Auto Quote - State Farm");

          }
    @Test
    public void motorcycleInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.motorcycle.isEnabled());
        insurancePage.motorcycle();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.getZipCodeField.isEnabled());
        insurancePage.getZipCodeField();
        Assert.assertTrue(insurancePage.findAnAgent.isEnabled());
        insurancePage.findAnAgent();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");


              }
    @Test
    public void boatInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.boat.isEnabled());
        insurancePage.boat();
        waitFor(1);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,370)");
        Assert.assertTrue(insurancePage.zipCodeField0.isEnabled());
        insurancePage.zipCodeField0();
        Assert.assertTrue(insurancePage.findAnAgent0.isEnabled());
        insurancePage.findAnAgent0();
    Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

    }


    @Test
    public void motorHomeInsurance(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.motorHome.isEnabled());
       insurancePage.motorHome();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,350)");
        Assert.assertTrue(insurancePage.zipCodeField1.isEnabled());
        insurancePage.zipCodeField1();
        Assert.assertTrue(insurancePage.findAnAgent1.isEnabled());
        insurancePage.findAnAgent1();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");




    }
    @Test
    public void roadsideAssistanceInsurance(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.roadsideAssistance.isEnabled());
       insurancePage.roadsideAssistance();
        Assert.assertTrue(insurancePage.getRoadsideAssistance.isEnabled());
       insurancePage.getRoadsideAssistance();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.startMyRequest.isEnabled());
        insurancePage.startMyRequest();
        Assert.assertEquals(getTitle(), "Emergency Roadside Service");
        }
    @Test
    public void homeAndPropertyInsurance(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.homeAndProperty.isEnabled());
        insurancePage.homeAndProperty();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1050)");
        Assert.assertTrue(insurancePage.getRentersInsurance.isEnabled());
        insurancePage.getRentersInsurance();
        Assert.assertEquals(getTitle(), "Get a Renters Insurance Quote Online & Buy Today - State Farm®");
                }
    @Test
    public void homeInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.home.isEnabled());
        insurancePage.home();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2050)");
        Assert.assertTrue(insurancePage.getGetZipCodeField6.isEnabled());
        insurancePage.getGetZipCodeField6();
        Assert.assertTrue(insurancePage.getStartAQuoteBtn1.isEnabled());
        insurancePage.getStartAQuoteBtn1();
        Assert.assertEquals(getTitle(), "Homeowners Insurance - Free Quote Now Online - State Farm®");
    }
        @Test
        public void condominiumInsurance() {
    InsurancePage homePageV = new InsurancePage(driver);
    InsurancePage insurancePage = new InsurancePage(driver);
    Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
    Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
    homePageV.insuranceMenu();
    Assert.assertTrue(insurancePage.condominium.isEnabled());
    insurancePage.condominium();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2050)");
    Assert.assertTrue(insurancePage.getGetZipCodeField7.isEnabled());
    insurancePage.getGetZipCodeField7();
    Assert.assertTrue(insurancePage.getStartAQuoteBtn2.isEnabled());
    insurancePage.getStartAQuoteBtn2();
    waitFor(2);
    Assert.assertEquals(getTitle(), "Welcome - Condo Unitowners Quote - State Farm");
}
@Test
public void rentersInsurance() {
    InsurancePage homePageV = new InsurancePage(driver);
    InsurancePage insurancePage = new InsurancePage(driver);
    Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
    Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
    homePageV.insuranceMenu();
    Assert.assertTrue(insurancePage.rentersInsurance.isEnabled());
    insurancePage.rentersInsurance();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2050)");
    Assert.assertTrue(insurancePage.getGetZipCodeField8.isEnabled());
    insurancePage.getGetZipCodeField8();
    Assert.assertTrue(insurancePage.getStartAQuoteBtn3.isEnabled());
    insurancePage.getStartAQuoteBtn3();
    waitFor(2);
    Assert.assertEquals(getTitle(), "FireUI Renters");

}
@Test
public void rentalPropertyInsurance() {
    InsurancePage homePageV = new InsurancePage(driver);
    InsurancePage insurancePage = new InsurancePage(driver);
    Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
    Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
    homePageV.insuranceMenu();
    Assert.assertTrue(insurancePage.rentersInsurance.isEnabled());
    insurancePage.rentalProperty();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,2050)");
    Assert.assertTrue(insurancePage.getGetZipCodeField9.isEnabled());
    insurancePage.getGetZipCodeField9();
    Assert.assertTrue(insurancePage.getStartAQuoteBtn4.isEnabled());
    insurancePage.getStartAQuoteBtn4();
    Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

}

    @Test
    public void farmAndRanchInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.farmAndRanch.isEnabled());
        insurancePage.farmAndRanch();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.getGetZipCodeField12.isEnabled());
        insurancePage.getGetZipCodeField12();
        Assert.assertTrue(insurancePage.getStartAQuoteBtn7.isEnabled());
        insurancePage.getStartAQuoteBtn7();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

    }
    @Test
    public void identityRestoration1() {
    InsurancePage homePageV = new InsurancePage(driver);
    InsurancePage insurancePage = new InsurancePage(driver);
    Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
    Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
    homePageV.insuranceMenu();
    Assert.assertTrue(insurancePage.rentersInsurance.isEnabled());
    insurancePage.identityRestoration();
    waitFor(2);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,6050)");
    insurancePage.talkToAStateFarmAgent();
    Assert.assertTrue(insurancePage.getStreetAddress.isEnabled());
    insurancePage.getStreetAddress();
    insurancePage.getSearchBtn();
    Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");
}
    @Test
        public void smallBusinessInsurance(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.smallBusiness.isEnabled());
        insurancePage.smallBusiness();
        Assert.assertTrue(insurancePage.zipCodeField3.isEnabled());
        insurancePage.zipCodeField3();
        Assert.assertTrue(insurancePage.findAnAgent4.isEnabled());
        insurancePage.findAnAgent4();
        Assert.assertEquals(getTitle(), "Find an Agent");
    }
        @Test
        public void businessOwnersPolicy(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.businessOwnerPolicy.isEnabled());
        insurancePage.businessOwnerPolicy();
        Assert.assertTrue(insurancePage.zipCodeField4.isEnabled());
        insurancePage.zipCodeField4();
        Assert.assertTrue(insurancePage.findAnAgent5.isEnabled());
        insurancePage.findAnAgent5();
        Assert.assertEquals(getTitle(), "Find an Agent");
    }
@Test
public void commercialAuto(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.commercialAuto.isEnabled());
        insurancePage.commercialAuto();
        waitFor(1);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.zipCodeField5.isEnabled());
        insurancePage.zipCodeField5();
        Assert.assertTrue(insurancePage.findAnAgent5.isEnabled());
        insurancePage.findAnAgent6();
        Assert.assertEquals(getTitle(), "Find an Agent");
}
@Test
public void contractorsPolicy(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.contractorsPolicy.isEnabled());
        insurancePage.contractorsPolicy();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.zipCodeField6.isEnabled());
        insurancePage.zipCodeField6();
        Assert.assertTrue(insurancePage.findAnAgent7.isEnabled());
        insurancePage.findAnAgent7();
        Assert.assertEquals(getTitle(), "Find an Agent");
}
@Test
public void liabilityUmbrella(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.liabilityUmbrella.isEnabled());
        insurancePage.liabilityUmbrella();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.zipCodeField7.isEnabled());
        insurancePage.zipCodeField7();
        Assert.assertTrue(insurancePage.findAnAgent8.isEnabled());
        insurancePage.findAnAgent8();
        Assert.assertEquals(getTitle(), "Find an Agent");
}
@Test
public void workersCompensation(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.liabilityUmbrella.isEnabled());
        insurancePage.workersCompensation();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.zipCodeField8.isEnabled());
        insurancePage.zipCodeField8();
        Assert.assertTrue(insurancePage.findAnAgent9.isEnabled());
        insurancePage.findAnAgent9();
        Assert.assertEquals(getTitle(), "Find an Agent");
}
@Test
public void suretyAndFidelityBonds(){
        InsurancePage homePageV=new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.liabilityUmbrella.isEnabled());
        insurancePage.suretyAndFidelityBond();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.zipCodeField9.isEnabled());
        insurancePage.zipCodeField9();
        Assert.assertTrue(insurancePage.findAnAgent10.isEnabled());
        insurancePage.findAnAgent10();
        Assert.assertEquals(getTitle(), "Find an Agent");
}
    @Test
    public void lifeInsurance() {
            InsurancePage homePageV = new InsurancePage(driver);
            InsurancePage insurancePage = new InsurancePage(driver);
            Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
            Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
            homePageV.insuranceMenu();
            Assert.assertTrue(insurancePage.life.isEnabled());
            insurancePage.life();
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,250)");
            Assert.assertTrue(insurancePage.state.isEnabled());
            insurancePage.state();
            Assert.assertTrue(insurancePage.goBtn.isEnabled());
            insurancePage.goBtn();
            Assert.assertEquals(getTitle(), "Life Insurance - State Farm®");
        }

        @Test
        public void termLife() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.termLife.isEnabled());
        insurancePage.termLife();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(insurancePage.state1.isEnabled());
        insurancePage.state1();
        Assert.assertTrue(insurancePage.startAQuote.isEnabled());
        insurancePage.startAQuote();
        Assert.assertTrue(insurancePage.yesBtn.isEnabled());
        insurancePage.yesBtn();
        Assert.assertEquals(getTitle(), "Life Quote - State Farm");
    }
    @Test
    public void wholeLife() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.wholeLife.isEnabled());
        insurancePage.wholeLife();
        waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2550)");
        Assert.assertTrue(insurancePage.getZipCodeField2.isEnabled());
        insurancePage.getZipCodeField2();
        Assert.assertTrue(insurancePage.getGoBtn.isEnabled());
        insurancePage.getGoBtn();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

    }
    @Test
    public void universalLife() {
    InsurancePage homePageV = new InsurancePage(driver);
    InsurancePage insurancePage = new InsurancePage(driver);
    Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
    Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
    homePageV.insuranceMenu();
    Assert.assertTrue(insurancePage.universalLife.isEnabled());
    insurancePage.universalLife();
    waitFor(2);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,350)");
    Assert.assertTrue(insurancePage.getZipCodeField3.isEnabled());
    insurancePage.getZipCodeField3();
    Assert.assertTrue(insurancePage.getGoBtn1.isEnabled());
    insurancePage.getGoBtn1();
    Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");

}
    @Test
    public void changePolicy() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.changePolicy.isEnabled());
        insurancePage.changePolicy();
        Assert.assertTrue(insurancePage.getZipCodeField4.isEnabled());
        insurancePage.getZipCodeField4();
        Assert.assertTrue(insurancePage.getFindAnAgent.isEnabled());
        insurancePage.getFindAnAgent();
        Assert.assertEquals(getTitle(), "Find State Farm® Agents Near You - State Farm®");
    }

    @Test
    public void healthInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.health.isEnabled());
        insurancePage.health();
        Assert.assertTrue(insurancePage.getGetZipCodeField4.isEnabled());
        insurancePage.getGetZipCodeField4();
        Assert.assertEquals(getTitle(), "Health Insurance - State Farm®");


    }
    @Test
    public void disabilityInsurance() {
        InsurancePage homePageV = new InsurancePage(driver);
        InsurancePage insurancePage = new InsurancePage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.insuranceMenu.isEnabled());
        homePageV.insuranceMenu();
        Assert.assertTrue(insurancePage.disability.isEnabled());
        insurancePage.disability();
        Assert.assertTrue(insurancePage.getGetZipCodeField5.isEnabled());
        insurancePage.getGetZipCodeField5();
        Assert.assertTrue(insurancePage.getFindAnAgent5.isEnabled());
        insurancePage.getFindAnAgent5();
        Assert.assertEquals(getTitle(), "Page Not Found");
 }

    }
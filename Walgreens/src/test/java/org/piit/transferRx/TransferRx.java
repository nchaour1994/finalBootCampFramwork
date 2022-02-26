package org.piit.transferRx;

import base.commonApi;
import org.piit.GuestPage;
import org.piit.GuestTransferRx;
import org.piit.HomePage;
import org.piit.PharmacyServicesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferRx extends commonApi {

    @Test
    public void TransferRx(){
        HomePage home =new HomePage(driver);
        PharmacyServicesPage pharmacyServicesPage=new PharmacyServicesPage(driver);
        GuestPage guestPage=new GuestPage(driver);
        GuestTransferRx guestTransferRx=new GuestTransferRx(driver);
        home.clickONMenuBtn();
        home.clickOnprescriptionInMenu();
        home.clickOngettingStartedInSubMenuPrescription();
        Assert.assertEquals(getTitle(),"Pharmacy Services");
        pharmacyServicesPage.clickOnTransferRxBtn();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        guestPage.clickOncontinueAsGuestBtn();
        Assert.assertEquals(getTitle(),"Guest Transfer RX | Pharmacy | Walgreens");
        guestTransferRx.typeOnpharmacyNameField();
        guestTransferRx.typeOnpharmacyphoneField();

        guestTransferRx.typeOnDrugNameField();

        guestTransferRx.selectCheckboxSupply();
        guestTransferRx.clickOncontinueBtn();
        guestTransferRx.typeOnfirstNameField();
        guestTransferRx.typeOnlastNameField();
        guestTransferRx.selectGender();
        guestTransferRx.typeOndob();
        guestTransferRx.typeOnphoneNumber();
        guestTransferRx.selecttypePhone();



    }
}

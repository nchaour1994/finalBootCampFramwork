package org.piit;

import base.commonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestTransferRx extends commonApi {
    public GuestTransferRx(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "#pharmacyName")
    WebElement pharmacyNameField;
    @FindBy(css= "#pharmacyPhone")
    WebElement pharmacyphoneField;
    @FindBy(css = "#drugName_0")
    WebElement drugNameField;
    @FindBy(xpath = "//label[@for='90day_supply_checkbox-01']")
    WebElement checkboxSupply;
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueBtn;
    @FindBy(css = "#firstName")
    WebElement firstNameField;
    @FindBy(css = "#lastName")
    WebElement lastNameField;
    @FindBy(css = "#gender")
    WebElement gender;
    @FindBy(xpath = "//input[@name='patientBirthDate']")
    WebElement dob;
    @FindBy(xpath = "//input[@name='patientPhoneNumber']")
    WebElement phoneNumber;
    @FindBy(css = "#phoneType")
    WebElement typePhone;





    public void typeOnpharmacyNameField(){
        type(pharmacyNameField,"steinway");
    }
    public void typeOnpharmacyphoneField(){
        type(pharmacyphoneField,"3478965412");
    }
    public void typeOnDrugNameField(){
        type(drugNameField,"Panadol ");
      drugNameField.sendKeys(Keys.ARROW_DOWN);
        drugNameField.sendKeys(Keys.ARROW_DOWN);
        drugNameField.sendKeys(Keys.ENTER);


    }
    public void selectCheckboxSupply(){
        click(checkboxSupply);
    }
    public void clickOncontinueBtn(){
        click(continueBtn);
    }
    public void typeOnfirstNameField(){
        type(firstNameField,"lorry");
    }
    public void typeOnlastNameField(){
        type(lastNameField,"karla");
    }
    public void selectGender(){
        selectDropdownOption(gender,"Male");
    }
   public void typeOndob(){
        type(dob,"02041998");
   }
    public void typeOnphoneNumber(){
        type(phoneNumber,"3478987455");
    }
    public void selecttypePhone(){
        selectDropdownOption(typePhone,"Work");
    }




}

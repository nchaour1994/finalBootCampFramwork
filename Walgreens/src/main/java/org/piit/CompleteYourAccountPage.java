package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.GetProperties;

import java.util.Properties;

public class CompleteYourAccountPage extends commonApi {

    Properties prop = GetProperties.loadProperties("..\\Walgreens\\src\\test\\resources\\config.properties");
    String dob=prop.getProperty("dateOfBirth");
    String typeGender=prop.getProperty("gender");
    String myAdress=prop.getProperty("adress");
    String myCity=prop.getProperty("city");
    String myState=prop.getProperty("state");
    String mySecurityQuestion= prop.getProperty("securityQuestion");
    String securityQuestionAnswer=prop.getProperty("answerSecurity");
    public CompleteYourAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#wag-RXUser-DOB")
   public WebElement dobField;
    @FindBy(css = "#wag-regpharmacy-gender")
    WebElement gender;
    @FindBy(xpath = "//input[@name='wagAddress']")
    WebElement adress;
    @FindBy(xpath = "//input[@name='wagCity']")
    WebElement city;
    @FindBy(css = "#wag-regpharmacy-state")
    WebElement state;
    @FindBy(css = "#wag-securityquestion-select")
    WebElement securityQuestion;
    @FindBy(css = "#wag-RXUser-securityanswer")
    WebElement answerSecurityQuestion;

    public void typeOndobField(){
        type(dobField,dob);
    }
    public void selectfromgender(){
        selectDropdownOption(gender,typeGender);
    }
    public void typeOnadress(){
        type(adress,myAdress);
    }
    public void typeOncity(){
        type(city,myCity);
    }
    public void selectfromstate(){
        selectDropdownOption(state,myState);
    }
    public void selectfromsecurityQuestion(){
        selectDropdownOption(securityQuestion,mySecurityQuestion);
    }
    public void typeOnanswerSecurityQuestion(){
        type(answerSecurityQuestion,securityQuestionAnswer);
    }

    public String getValueOfDob(){
        return dobField.getAttribute("value");
    }
    public  String getValueOfAdress(){
        return adress.getAttribute("value");
    }
    public String getValueOfcity(){
        return city.getAttribute("value");
    }
    public String getValueOfanswerSecurityQuestion(){
        return answerSecurityQuestion.getAttribute("value");
    }


}

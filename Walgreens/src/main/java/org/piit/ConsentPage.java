package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ConsentPage extends commonApi {
    public ConsentPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

   @FindBy(xpath = "//*[@class='tab-findcare']")
   WebElement healthProfile;
    @FindBy(xpath = "//*[@class='btn-signin btn__aqua']")
    WebElement signInBtn;
    @FindBy(xpath = "//*[text()='Health Profile']")
    public
    WebElement healthProfileActive;
    @FindBy(css = "#myWag_icon")
    WebElement myWalgreensHealthGoals;
    @FindBy(css = "#appointment_icon")
    WebElement appointments;
   public void clickOnhealthProfile(){
       click(healthProfile);
   }
   public void clickOnsignInBtn(){
       click(signInBtn);
   }
    public void clickOnhealthProfileActive(){
        click(healthProfileActive);
    }
    public void clickOnmyWalgreensHealthGoals(){
       click(myWalgreensHealthGoals);
    }
    public void clickOnappointments(){
       click(appointments);
    }
    public boolean checkIfhealthProfileISEnabled(){
       return healthProfile.isEnabled();
    }
    public boolean checkIfsignInBtnIsEnabled(){
       return signInBtn.isEnabled();
    }
    public boolean checkIfhealthProfileActiveIsEnabled(){
       return healthProfileActive.isEnabled();
    }

}

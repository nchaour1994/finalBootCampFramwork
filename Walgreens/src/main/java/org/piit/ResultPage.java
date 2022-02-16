package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends commonApi {
    public  ResultPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id=\"pickup-ship-btncompare_sku6314909\"]")
    public
    WebElement firstElementInSearchList;
    @FindBy(xpath = "//button[@class=\"dropdown__title--card\"][@aria-controls=\"PICK_IT\"]")
    public
    WebElement pickUpIcon;
    @FindBy(xpath = "//span[@class=\"btn btn__blue\"][contains(text(),\"Finish\")]")
    public
    WebElement finishBtn;
    //---------------------------------------------------------------------------------------
    @FindBy(css = "button#pickup-ship-btncompare_sku6244026")
    public
    WebElement firstItemInSearchForKitchenAppliances;
    @FindBy(css = "a[name=\"viewcart\"]")
    public
    WebElement viewCartBtn;
    //-------------------------------------------------------------------------------------
    @FindBy(xpath = "//span[text()='Acuvue Oasys 12 pack']/..")
    WebElement AcuvueOasys12pack;

    public void clickOnfirstElementInSearchList(){
        click(firstElementInSearchList);
    }
    public void clickOnpickUpIcon(){
        click(pickUpIcon);
    }
    public void clickOnfinishBtn(){
        click(finishBtn);
    }
    //------------------------------------------------------------------------------------------
    public void clickOnfirstItemInSearchForKitchenAppliances(){
        click(firstItemInSearchForKitchenAppliances);
    }
    public void clickOnviewCartBtn(){
        click(viewCartBtn);
    }
    public void clickOnAcuvueOasys12pack(){
        click(AcuvueOasys12pack);
    }
}

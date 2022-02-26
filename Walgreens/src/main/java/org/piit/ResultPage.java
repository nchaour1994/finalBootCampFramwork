package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    public
    WebElement AcuvueOasys12pack;

    @FindBy(xpath = "//*[@class='description']")
    List<WebElement> allItem;

    @FindBy(css = "#onSortOptionChangeHandler")
    WebElement sortBy;

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
    public void selectFromsortBy(){
        selectDropdownOption(sortBy,"Top Sellers");
    }
    public void printAllItems(){
         List<WebElement> l=allItem;
        for (WebElement element : l) {
           if((element.getText()).equals("Stain Fighter Teeth Whitening Toothpaste Clean Mint Paste")){
               element.click();
               System.out.println("clicked");
           }
            System.out.println(element.getText());
           // to see
        }
    }
    public boolean checkIffirstElementInSearchListIsEnabled(){
        return firstElementInSearchList.isEnabled();
    }
    public boolean checkIfpickUpIconIsEnabled(){
        return pickUpIcon.isEnabled();
    }
    public boolean checkIffinishBtnIsEnabled(){
        return finishBtn.isEnabled();
    }
    public boolean checkIffirstItemInSearchForKitchenAppliancesIsEnabled(){
        return firstItemInSearchForKitchenAppliances.isEnabled();
    }
    public boolean checkIfviewCartBtnIsEnabled(){
        return viewCartBtn.isEnabled();
    }
    public boolean checkIfAcuvueOasys12packIsEnabled(){
        return AcuvueOasys12pack.isEnabled();
    }
}

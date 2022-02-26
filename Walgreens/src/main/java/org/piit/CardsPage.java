package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardsPage extends commonApi {
    public CardsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Business']")
    WebElement businessInMenu;
    @FindBy(xpath = "(//a[text()='Postcards '])[2]")
    WebElement postcards;


    public void HoverOverbusinessInMenu(){
        hoverOver(driver,businessInMenu);
    }
    public void clickOnpostcards(){
      click(postcards);
    }
    public boolean checkIfpostcardsIsEnabled(){
        return postcards.isEnabled();
    }
}

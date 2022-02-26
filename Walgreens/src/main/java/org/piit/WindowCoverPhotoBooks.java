package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowCoverPhotoBooks extends commonApi {

    public WindowCoverPhotoBooks(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[text()='Everyday Adventures']")
    WebElement everyAdventures;
    @FindBy(css = "#buttonId")
    WebElement makeThisPhotoBook;

    public void clickONeveryAdventures(){
        click(everyAdventures);
    }
    public void clickOnmakeThisPhotoBook(){
        click(makeThisPhotoBook);
    }
}

package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoBooks extends commonApi {

    public PhotoBooks(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='8.5x11 Window Cover Photo Book']")
    WebElement windowCoverPhotoBook;


    public void clickOnwindowCoverPhotoBook(){
        click(windowCoverPhotoBook);
    }
}

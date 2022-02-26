package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PosterAndBannerPage extends commonApi {
    public PosterAndBannerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[text()='Posters'])[4]")
    WebElement posters;
    @FindBy(xpath = "(//a[text()='Banners'])[2]")
    WebElement banners;



    public void clickOnposters(){
        click(posters);
    }
    public void clickOnbanners(){
        click(banners);
    }

}

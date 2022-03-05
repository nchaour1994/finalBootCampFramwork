package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class ShopAllPhotoPage extends commonApi {
           public ShopAllPhotoPage(WebDriver driver){
               this.driver=driver;
               PageFactory.initElements(driver,this);
           }

    @FindBy(xpath = "//a[text()='Passport Photos']")
    WebElement passportPhotos;
    @FindBy(xpath = "//a[@title='Find a location near you opens new window']")
    WebElement findLocationNearYou;
    @FindBy(xpath = "//a[@title='Cards & Stationery']")
    WebElement cardAndStationary;
    @FindBy(xpath = "//a[text()='Full Photo ']")
    public
    WebElement fullPhoto;
    @FindBy(xpath = "//a[text()='Birthday  ']")
    public
    WebElement Birthday;
    @FindBy(xpath = "//a[text()='Magnet Cards ']")
    public
    WebElement magnetCard;
    @FindBy(css = "#header_subnav_Calendars")
    WebElement calendar;
    @FindBy(xpath = "//a[text()='Desk ']")
    public
    WebElement desk;
    @FindBy(xpath = "//a[text()='Desktop Calendar']")
    WebElement deskTopCalendar;
    @FindBy(xpath = "//*[@title='Same Day']")
    WebElement sameDay;
    @FindBy(xpath = "//*[text()='Custom Puzzle ']")
    WebElement customPuzzle;
    @FindBy(xpath = "//*[@title='Prints']")
    WebElement prints;
    @FindBy(xpath = "//*[text()='PrintBooks ']")
    public
    WebElement printBook;
    @FindBy(xpath = "//*[@title='Deals']")
    WebElement deals;
    @FindBy(xpath = "//a[@id='header_subnav_Canvas_&_Décor']")
    WebElement canvasAndDecor;
    @FindBy(xpath = "//a[text()='Wood Panels ']")
    WebElement woodPanel;
    @FindBy(xpath = "//a[@id='header_subnav_Posters']")
    WebElement posters;
    @FindBy(xpath = "(//a[text()='Posters'])[3]")
    WebElement poster;
    @FindBy(xpath = "")
    WebElement banners;
    @FindBy(xpath = "//a[text()='Banners']")
    WebElement banner;







    public void clickOnpassportPhotos(){
        click(passportPhotos);
    }
    public void clickOnfindLocationNearYou(){
        click(findLocationNearYou);
    }
    public boolean checkIfpassportPhotosIsEnabled(){
        return passportPhotos.isEnabled();
    }
    public boolean checkIfFindLocationNearYouIsEnabled(){
        return findLocationNearYou.isEnabled();
    }
    public  void hoverOncardAndStationary(){
        hoverOver(driver,cardAndStationary);
    }
    public void clickOnfullPhoto(){
        click(fullPhoto);
    }
    public boolean checkIfcardAndStationaryIsDisplayed(){
        return cardAndStationary.isDisplayed();
    }
    public boolean checkIfFullPhotoIsDisplayed(){
        return fullPhoto.isDisplayed();
    }
    public void clickOnBirthday(){
        click(Birthday);
    }
    public void clickOnmagnetCard(){
        click(magnetCard);
    }
    public void hoverOncalendar(){
        hoverOver(driver,calendar);
    }
    public void clickOndesk(){
        click(desk);
    }
    public void hoverOnsameDay(){
        hoverOver(driver,sameDay);
    }
    public void clickOncustomPuzzle(){
        click(customPuzzle);
    }
    public void hoverOnPrints(){
        hoverOver(driver,prints);
    }
    public void clickOnprintBook(){
        click(printBook);
    }
    public void clickOnDeals(){
        click(deals);
    }
    public void clickOndeskTopCalendar(){
        click(deskTopCalendar);
    }
    public void hoverOncanvasAndDecor(){
        hoverOver(driver,canvasAndDecor);
    }
    public void clickOnwoodPanel(){
        click(woodPanel);
    }
    public void hoverOnPosters(){
        hoverOver(driver,posters);
    }
    public void clickOnposter(){
        click(poster);
    }

    public void clickOnBanner(){
        click(banner);
    }
    public boolean checkIfmagnetCardIsDisplayed(){
        return magnetCard.isDisplayed();
    }
    public boolean checkIfBirthdayIsDisplayed(){
        return Birthday.isDisplayed();
    }
    public boolean checkIfcalendarIsDisplayed(){
        return calendar.isDisplayed();
    }
    public boolean checkIFdeskIsDisolayed(){
        return desk.isDisplayed();
    }
    public boolean checkIfprintBookIsDisplayed(){
        return printBook.isDisplayed();
    }






}

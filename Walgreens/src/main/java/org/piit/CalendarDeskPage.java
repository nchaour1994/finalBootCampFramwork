package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class CalendarDeskPage extends commonApi {

    public CalendarDeskPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[text()='Together Always']")
    WebElement toghtherAlways;

    @FindBy(xpath = "(//span[text()='4x8 '])[2]")
    WebElement sizeAndType;
    @FindBy(xpath = "(//div[text()='8.5\" x 11\"'])[2]")
    WebElement wallCalendarsize;
    @FindBy(xpath = "//*[text()='January 2022']")
    WebElement startingMonth;
    @FindBy(xpath = "//*[@id='startingMonthDropDown-qv']/li[text()=' May 2022 ']")
    WebElement startingMonths;
    @FindBy(css = "#buttonId")
    WebElement makeThisCalendarBtn;

    public void clickOntoghtherAlways(){
        click(toghtherAlways);
    }
    public void clickOnsizeAndType(){
        click(sizeAndType);
        click(wallCalendarsize);

    }
    public void clickOnstartingMonth(){
        click(startingMonth);
        click(startingMonths);

    }
    public void clickOnmakeThisCalendarBtn(){
        click(makeThisCalendarBtn);
    }
    public boolean checkIfmakeThisCalendarBtnIsEnabled(){
        return makeThisCalendarBtn.isEnabled();
    }

}

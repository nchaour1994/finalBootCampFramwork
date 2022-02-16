package org.piit.findCare;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.piit.CityMdPage;
import org.piit.FindCarePage;
import org.piit.HomePage;
import org.testng.annotations.Test;

import java.util.Set;

public class FindCare extends commonApi {

    @Test
    public void findCare(){
        HomePage home=new HomePage(driver);
        FindCarePage findCarePage=new FindCarePage(driver);
        CityMdPage cityMdPage=new CityMdPage(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOnfindCareInMenu();
        waitFor(2);
        home.clickOnfindCareNearYouInsubMenu();
        findCarePage.typeOnsymptomField();
        findCarePage.clickOnfindLocationInCityMd();
        waitFor(2);
        findCarePage.clickOngotItBtnInCityMd();
        waitFor(2);
        String parent=driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                waitFor(5);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",cityMdPage.findCityMD);

             //   driver.findElement(By.xpath("(//a[text()='Find a CityMD'])[1]")).click();
               // cityMdPage.clickOnfindCityMD();
                waitFor(5);
            }
        }


    }
}

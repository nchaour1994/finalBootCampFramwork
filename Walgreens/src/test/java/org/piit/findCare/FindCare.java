package org.piit.findCare;

import base.commonApi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.CityMdPage;
import org.piit.FindCarePage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

public class FindCare extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleFindCarePage=prop.getProperty("titleFindCarePage");
    String symptom=prop.getProperty("symptom");
    String titleCityMdPage=prop.getProperty("titleCityMdPage");
    String titleLocationsInCityMdPage=prop.getProperty("titleLocationsInCityMdPage");

    @Test
    public void testFindCare(){
        HomePage home=new HomePage(driver);
        FindCarePage findCarePage=new FindCarePage(driver);
        CityMdPage cityMdPage=new CityMdPage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.findCareInMenu));
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.checkIfFindCareNearYouInsubMenuIsEnabled());
        home.clickOnfindCareNearYouInsubMenu();
        Assert.assertEquals(getTitle(),titleFindCarePage);
        findCarePage.typeOnsymptomField();
        Assert.assertEquals(findCarePage.getValueOfsymptomField(),symptom);
        Assert.assertTrue(findCarePage.checkIffindLocationBtnInCityMdIsEnabled());
        findCarePage.clickOnfindLocationInCityMd();
        wait.until(ExpectedConditions.elementToBeClickable(findCarePage.gotItBtnInCityMd));
        Assert.assertTrue(findCarePage.checkIfgotItBtnInCityMdIsEnabled());
        findCarePage.clickOngotItBtnInCityMd();
        String parent=driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleCityMdPage);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",cityMdPage.findCityMD);
                Assert.assertEquals(getTitle(),titleLocationsInCityMdPage);

               // cityMdPage.clickOnfindCityMD();
                //search btn not working

            }
        }


    }

    @Test
    public void testFindCareFromHome(){
        HomePage home=new HomePage(driver);
        FindCarePage findCarePage=new FindCarePage(driver);
        CityMdPage cityMdPage=new CityMdPage(driver);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnhealthServices();
        Assert.assertEquals(getTitle(),titleFindCarePage);
        findCarePage.typeOnsymptomField();
        Assert.assertEquals(findCarePage.getValueOfsymptomField(),symptom);
        Assert.assertTrue(findCarePage.checkIffindLocationBtnInCityMdIsEnabled());
        findCarePage.clickOnfindLocationInCityMd();
        wait.until(ExpectedConditions.elementToBeClickable(findCarePage.gotItBtnInCityMd));
        Assert.assertTrue(findCarePage.checkIfgotItBtnInCityMdIsEnabled());
        findCarePage.clickOngotItBtnInCityMd();
        String parent=driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleCityMdPage);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",cityMdPage.findCityMD);
                Assert.assertEquals(getTitle(),titleLocationsInCityMdPage);

                // cityMdPage.clickOnfindCityMD();
                //search btn not working

            }
        }


    }
}

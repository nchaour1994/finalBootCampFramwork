package org.piit.findCare;

import base.commonApi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.piit.CityMdPage;
import org.piit.FindCarePage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.GetProperties;

import java.util.Properties;
import java.util.Set;

public class FindCare extends commonApi {

    String titleHomePage=prop.getProperty("titleHomePage");
    String titleFindCarePage=prop.getProperty("titleFindCarePage");
    String symptom=prop.getProperty("symptom");
    String titleCityMdPage=prop.getProperty("titleCityMdPage");

    @Test
    public void TestfindCare(){
        HomePage home=new HomePage(driver);
        FindCarePage findCarePage=new FindCarePage(driver);
        CityMdPage cityMdPage=new CityMdPage(driver);
        Assert.assertTrue(home.checkIfmenuBtnIsEnabled());
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickONMenuBtn();
        waitFor(1);
        Assert.assertTrue(home.checkIfFindCareInMenuIsEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.checkIfFindCareNearYouInsubMenuIsEnabled());
        home.clickOnfindCareNearYouInsubMenu();
        Assert.assertEquals(getTitle(),titleFindCarePage);
        findCarePage.typeOnsymptomField();
        Assert.assertEquals(findCarePage.getValueOfsymptomField(),symptom);
        Assert.assertTrue(findCarePage.checkIffindLocationBtnInCityMdIsEnabled());
        findCarePage.clickOnfindLocationInCityMd();
        waitFor(2);
        Assert.assertTrue(findCarePage.checkIfgotItBtnInCityMdIsEnabled());
        findCarePage.clickOngotItBtnInCityMd();
        waitFor(2);
        String parent=driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                waitFor(5);
                Assert.assertEquals(getTitle(),titleCityMdPage);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",cityMdPage.findCityMD);
             //   driver.findElement(By.xpath("(//a[text()='Find a CityMD'])[1]")).click();
               // cityMdPage.clickOnfindCityMD();

            }
        }


    }
}

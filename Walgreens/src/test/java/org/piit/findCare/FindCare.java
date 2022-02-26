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

import java.util.Set;

public class FindCare extends commonApi {

    @Test
    public void TestfindCare(){
        HomePage home=new HomePage(driver);
        FindCarePage findCarePage=new FindCarePage(driver);
        CityMdPage cityMdPage=new CityMdPage(driver);
        Assert.assertTrue(home.menuBtn.isEnabled());
        home.clickONMenuBtn();
        Assert.assertTrue(home.findCareInMenu.isEnabled());
        home.clickOnfindCareInMenu();
        Assert.assertTrue(home.findCareNearYouInsubMenu.isEnabled());
        home.clickOnfindCareNearYouInsubMenu();
        Assert.assertEquals(driver.getTitle(),"Find Care | Services | Walgreens");
        findCarePage.typeOnsymptomField();
        Assert.assertTrue(findCarePage.findLocationBtnInCityMd.isEnabled());
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
                Assert.assertEquals(driver.getTitle(),"CityMD Urgent Care Walk-in Medical Clinic | CityMD");
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",cityMdPage.findCityMD);
             //   driver.findElement(By.xpath("(//a[text()='Find a CityMD'])[1]")).click();
               // cityMdPage.clickOnfindCityMD();

            }
        }


    }
}

package org.piit.qualificationForCreditCard;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QualifyForCreditCard extends commonApi {
  //  @Test
    public void TestseeIfIQualify(){
        HomePage home=new HomePage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        home.clickONMenuBtn();
        waitFor(1);
        home.clickOnmyWalgreensCreditCard();
        Assert.assertEquals(getTitle(),"myWalgreens | Credit Card");
        myWalgreensCreditCardPage.clickOnseeIfIqualifyBtn();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
        waitFor(2);
        myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
        waitFor(8);

        String parent = driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();

        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),"WALGREENS");
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();
               // js.executeScript("arguments[0].value='4587';",  driver.findElement(By.xpath("//label[@for='pfLandinglast4SSN']")));
             // startApplicationPage.typeOnadressFieldInApplication();
             // startApplicationPage.typeOncityAndstateInApplication();


            }

        }
    }
    @Test
    public void applyForCreditCardFromShoppinCart(){
        String parent=driver.getWindowHandle();

        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickOnAccountBtn();
        waitFor(1);
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        home.clickOnshoppingCart();
        shoppingCartPage.clickOnlearnMoreAndApply();
        Set<String>allWindows=driver.getWindowHandles();
        for (String window:allWindows) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
                waitFor(2);
                myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
                waitFor(8);
                Set<String>allWin=driver.getWindowHandles();
                ArrayList<String> allTabs=new ArrayList<>(allWin);
                System.out.println(allTabs);
                driver.switchTo().window(allTabs.get(2));
                System.out.println(allTabs.get(1));
                waitFor(9);
                Assert.assertEquals(getTitle(),"WALGREENS");
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();


            }

        }





    }
}

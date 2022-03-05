package org.piit.qualificationForCreditCard;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piit.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QualifyForCreditCard extends commonApi {
    String titleMyWalgreensCreditPage=prop.getProperty("titleMyWalgreensCreditPage");
    String titleHomePage=prop.getProperty("titleHomePage");
    String titleSignInPage=prop.getProperty("titleSignInPage");
    String email=prop.getProperty("email");
    String password=prop.getProperty("passwordAccount");
    String titleApplicationCreditCard=prop.getProperty("titleApplicationCreditCard");
   @Test
    public void testSeeIfIQualify(){
        HomePage home=new HomePage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        home.clickONMenuBtn();
        wait.until(ExpectedConditions.visibilityOf(home.myWalgreensCreditCard));
        home.clickOnmyWalgreensCreditCard();
        Assert.assertEquals(getTitle(),titleMyWalgreensCreditPage);
        myWalgreensCreditCardPage.clickOnseeIfIqualifyBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
        wait.until(ExpectedConditions.elementToBeClickable(myWalgreensCreditCardPage.startMyApplicationBtn));
        myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
        waitFor(8);
        String parent = driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);
               // js.executeScript("arguments[0].value='4587';",  driver.findElement(By.xpath("//label[@for='pfLandinglast4SSN']")));
             // startApplicationPage.typeOnadressFieldInApplication();
             // startApplicationPage.typeOncityAndstateInApplication();


            }

        }
    }
    @Test
    public void testApplyForCreditCardFromShoppinCart(){
        String parent=driver.getWindowHandle();
        HomePage home=new HomePage(driver);
        SignInPage signInPage=new SignInPage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        Assert.assertEquals(getTitle(),titleHomePage);
        home.clickOnAccountBtn();
        wait.until(ExpectedConditions.visibilityOf(home.signInBtnInAccountMenu));
        home.clickOnsignInBtnInAccountMenu();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        Assert.assertTrue(signInPage.signInBtn.isEnabled());
        signInPage.clickOnsignInBtn();
        home.clickOnshoppingCart();
        shoppingCartPage.clickOnlearnMoreAndApply();
        Set<String>allWindows=driver.getWindowHandles();
        for (String window:allWindows) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
                wait.until(ExpectedConditions.elementToBeClickable(myWalgreensCreditCardPage.startMyApplicationBtn));
                myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
                waitFor(8);
                Set<String>allWin=driver.getWindowHandles();
                ArrayList<String> allTabs=new ArrayList<>(allWin);
                System.out.println(allTabs);
                driver.switchTo().window(allTabs.get(2));
                System.out.println(allTabs.get(1));
                waitFor(9);
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);

            }

        }

    }

    @Test
    public void testSeeIfQualifyFromHomePage(){
        HomePage home=new HomePage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
        home.clickOncreditCard();
        Assert.assertEquals(getTitle(),titleMyWalgreensCreditPage);
        myWalgreensCreditCardPage.clickOnseeIfIqualifyBtn();
        Assert.assertEquals(getTitle(),titleSignInPage);
        signInPage.typeOnuserNameFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfuserNameFieldInSignIn(),email);
        signInPage.typeOnpasswordFieldInSignIn();
        Assert.assertEquals(signInPage.getValueOfpasswordFieldInSignIn(),password);
        signInPage.clickOnsignInBtn();
        myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
        wait.until(ExpectedConditions.elementToBeClickable(myWalgreensCreditCardPage.startMyApplicationBtn));
        myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
        waitFor(8);
        String parent = driver.getWindowHandle();
        Set<String> allTabs=driver.getWindowHandles();
        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();
                Assert.assertEquals(getTitle(),titleApplicationCreditCard);
            }

        }





    }
}

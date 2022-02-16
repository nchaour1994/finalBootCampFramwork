package org.piit.qualificationForCreditCard;

import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.piit.HomePage;
import org.piit.MyWalgreensCreditCardPage;
import org.piit.SignInPage;
import org.piit.StartApplicationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class QualifyForCreditCard extends commonApi {
    @Test
    public void seeIfIQualify(){
        HomePage home=new HomePage(driver);
        MyWalgreensCreditCardPage myWalgreensCreditCardPage=new MyWalgreensCreditCardPage(driver);
        SignInPage signInPage=new SignInPage(driver);
        StartApplicationPage startApplicationPage=new StartApplicationPage(driver);
        home.clickONMenuBtn();
        waitFor(2);
        home.clickOnmyWalgreensCreditCard();
        waitFor(2);
        Assert.assertEquals("","");

        myWalgreensCreditCardPage.clickOnseeIfIqualifyBtn();
        Assert.assertEquals("","");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();
        myWalgreensCreditCardPage.clickOnsetWithoutAddingAsPreferred();
        waitFor(2);
        myWalgreensCreditCardPage.clickOnstartMyApplicationBtn();
        waitFor(12);
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> allTabs=driver.getWindowHandles();

        for (String window:allTabs) {
            if(!(parent.equals(window))){
                driver.switchTo().window(window);
                System.out.println(window);
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("window.scrollBy(0,200)");
                startApplicationPage.typeOnssnField();
                startApplicationPage.typeOnphoneNumberFieldInApplication();
                startApplicationPage.clickOncontinueBtnInApplication();


               // js.executeScript("arguments[0].value='4587';",  driver.findElement(By.xpath("//label[@for='pfLandinglast4SSN']")));
              //  driver.findElement(By.xpath("//label[@for='pfLandinglast4SSN']")).sendKeys("4569");


                 waitFor(10);



//                startApplicationPage.typeOnadressFieldInApplication();
//                startApplicationPage.typeOncityAndstateInApplication();


            }

        }




    }
}

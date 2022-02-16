package org.piit;


import base.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppTest  extends commonApi
{
   @Test
    public void test01(){
    homePage home = PageFactory.initElements(driver,homePage.class);
    //Instragram  user can access  Validation with valid  credential
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
       home.logIn();
       waitFor(4);}

    //@Test
    public void test02(){homePage home = PageFactory.initElements(driver,homePage.class);
        //save your login info button
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);}
    //@Test
    public void test03(){homePage home = PageFactory.initElements(driver,homePage.class);
        //notifications button
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(4);}
  //@Test
    public void test04(){homePage home = PageFactory.initElements(driver,homePage.class);
        //home button
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(4);
        home.inHomeButton();
        waitFor(8);}
  // @Test
    public void test05(){homePage home = PageFactory.initElements(driver,homePage.class);
        //search
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(4);
        home.onSearch();
        waitFor(8);}
   // @Test
    public void test06(){homePage home = PageFactory.initElements(driver,homePage.class);
        //search
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(8);
        home.inProfile();
        waitFor(8);
        home.onProfile();
        waitFor(4);
        ////*[@aria-label='Home']
    }
   // @Test
    public void test07(){
        homePage home = PageFactory.initElements(driver,homePage.class);
        //Wrong Password
        home.enterEmail();
        waitFor(4);
        home.enterWrongPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);}
    //@Test
    public void test08(){
        homePage home = PageFactory.initElements(driver,homePage.class);
        //Wrong email
        home.enterWrongEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);}
   // @Test
    public void test09(){homePage home = PageFactory.initElements(driver,homePage.class);
        //Followers
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(8);
        home.onProfile();
        waitFor(4);
        home.onFollower();
        waitFor(4);}
    @Test
    public void test10(){homePage home = PageFactory.initElements(driver,homePage.class);
        //Following
        home.enterEmail();
        waitFor(4);
        home.enterPassword();
        waitFor(4);
        home.logIn();
        waitFor(4);
        home.loginnotNow();
        waitFor(4);
        home.turnOnNotifications();
        waitFor(4);
        home.inProfile();
        waitFor(8);
        home.onProfile();
        waitFor(4);
        home.onFollowing();
        waitFor(4);}

}




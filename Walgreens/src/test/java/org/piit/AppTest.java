package org.piit;


import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AppTest extends commonApi
{
     homePage homepage=new homePage();



    @Test
    public void test01(){
        waitFor(3);
        homepage.testtheclick();


    }

}

package org.piit.writeAReview;

import base.commonApi;
import org.piit.AntiGenQuickViewTestPage;
import org.piit.Covid19TestingPage;
import org.piit.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WriteReview extends commonApi {


    @Test
    public void testWriteReview(){
        HomePage home = new HomePage(driver);
        Covid19TestingPage covid19Testing = new Covid19TestingPage(driver);
        AntiGenQuickViewTestPage antiGenQuickViewTestPage=new AntiGenQuickViewTestPage(driver);
        String title = driver.getWindowHandle();
        Assert.assertTrue(home.covid19TestingOptions.isEnabled());
        home.clickONcovid19TestingOptions();
        covid19Testing.clickOnshopNowBtn();
        antiGenQuickViewTestPage.ScrollTowriteReviewBtn();
        antiGenQuickViewTestPage.clickOnwriteReviewBtn();
        antiGenQuickViewTestPage.clickOnratingStars();
        antiGenQuickViewTestPage.typeOnreviewTitle();
        antiGenQuickViewTestPage.typeOnreview();
        antiGenQuickViewTestPage.typeOnnickName();
        antiGenQuickViewTestPage.typeOnEmail();

    }
}

package org.piit.takePhotos;

import base.commonApi;
import org.piit.HomePage;
import org.piit.PhotoBooks;
import org.piit.SignInPage;
import org.piit.WindowCoverPhotoBooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakePhotoBook extends commonApi {



    @Test
    public void TestmakePhotoBook(){
        HomePage home=new HomePage(driver);
        PhotoBooks photoBooks=new PhotoBooks(driver);
        WindowCoverPhotoBooks windowCoverPhotoBooks=new WindowCoverPhotoBooks(driver);
        SignInPage signInPage=new SignInPage(driver);

        Assert.assertEquals(getTitle(),"Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        home.clickONMenuBtn();
        home.clickOnphotosInMenu();
        home.clickOnphotoBookInSubMenu();
        Assert.assertEquals(getTitle(),"Photo Books - Create Custom Photo Books | Walgreens Photo");
        photoBooks.clickOnwindowCoverPhotoBook();
        Assert.assertEquals(getTitle(),"8.5x11 Window Cover Photo Book - Same Day Pickup | Walgreens Photo");
        windowCoverPhotoBooks.clickONeveryAdventures();
        windowCoverPhotoBooks.clickOnmakeThisPhotoBook();
        Assert.assertEquals(getTitle(),"Sign In or Register to Get Started Using Walgreens.com");
        signInPage.typeOnuserNameFieldInSignIn();
        signInPage.typeOnpasswordFieldInSignIn();
        signInPage.clickOnsignInBtn();





    }
}

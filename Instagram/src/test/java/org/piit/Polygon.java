package org.piit;
import base.commonApi;
import org.testng.Assert;
import org.testng.annotations.Test;
//1
public class Polygon extends commonApi{
   @Test
    public void testPolygonButton(){
        PolygonButton polygonButton = new PolygonButton(driver);
        SaveLoginNotNow saveLogin=new SaveLoginNotNow(driver);
        SignInPage sign = new SignInPage(driver);
        sign.enterEmail();
        sign.enterPassword();
        sign.logIn();
        saveLogin.saveLoginNotNow();
        sign.turnOnNotifications();
       Assert.assertEquals(driver.getTitle(),"Instagram");
        polygonButton.onPolygon();
        waitFor(4);}
}

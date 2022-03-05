package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Restrict extends commonApi{
    public Restrict(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//button[contains(text(),'Restrict Account')]")
    WebElement RestrictAccount;
    public void clickRestrictAccount(){click(RestrictAccount);}
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement RestrictCancel;
    public void clickRestrictCancel(){click(RestrictCancel);}
    @FindBy(xpath = "//button[contains(text(),'Unrestrict')]")
    WebElement UnRestrictCancel;
    public void clickUnRestrictCancel(){click(UnRestrictCancel);}
    @FindBy(xpath = "//button[contains(text(),'Copy Embed Code')]")
    WebElement EmbeddedCode;
    public void clickEmbeddedCode(){click(EmbeddedCode);}
}

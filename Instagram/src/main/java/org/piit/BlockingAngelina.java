package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BlockingAngelina extends commonApi{
    public BlockingAngelina(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//button[contains(text(),'Block')]")
    WebElement Blocking;
    public void clickBlocking(){click(Blocking);}
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement Cancel;
    public void clickCancel(){click(Cancel);}

}

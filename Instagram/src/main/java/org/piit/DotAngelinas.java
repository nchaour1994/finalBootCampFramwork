package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DotAngelinas extends commonApi{
    public DotAngelinas(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//header/section[1]/div[1]/div[2]/button[1]/div[1]/*[1]")
    WebElement Dot;
    public void clickOnDot(){click(Dot);}
    @FindBy(xpath = "//button[contains(text(),'Block')]")
    WebElement Block;
    public void clickOnBlock(){click(Block);}
    @FindBy(xpath = "//button[contains(text(),'Restrict')]")
    WebElement Restrict;
    public void clickOnRestrict(){click(Restrict);}
    @FindBy(xpath = "//button[contains(text(),'Report')]")
    WebElement Report;
    public void clickOnReport(){click(Report);}
    @FindBy(xpath = "//button[contains(text(),'Embed')]")
    WebElement Embed;
    public void clickOnEmbed(){click(Embed);}
    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement Cancel;
    public void clickOnCancel(){click(Cancel);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement FirstStory;
    public void clickOnFirst(){click(FirstStory);}
}

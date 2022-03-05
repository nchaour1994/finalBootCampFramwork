package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SeeStory extends commonApi{
    public SeeStory(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/button[1]/div[1]/span[1]/img[1]")
    WebElement FirstStory;
    public void seeFirstSnap(){click(FirstStory);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/button[1]/div[1]/span[1]/img[1]")
    WebElement SecondStory;
    public void seeSecondSnap(){click(SecondStory);}
    @FindBy(xpath = "//a[contains(text(),'somayh_saleh')]")
    WebElement FirstStoryClickProfile;
    public void seeFirstSnapThanProfile(){click(FirstStoryClickProfile);}
}

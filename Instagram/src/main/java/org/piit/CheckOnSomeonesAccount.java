package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOnSomeonesAccount extends commonApi {
    public CheckOnSomeonesAccount(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//header/section[1]/ul[1]/li[2]/a[1]/div[1]")
    WebElement AngelinasFollower;
    public void clickAngelinasFollower(){click(AngelinasFollower);}
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement AngelinasHashtag;
    public void clickAngelinasHashtags(){click(AngelinasHashtag);}
    @FindBy(xpath = "//div[contains(text(),'People')]")
    WebElement AngelinasPeople;
    public void clickAngelinasPeople(){click(AngelinasPeople);}
    @FindBy(xpath = "//header/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement AngelinasFollowing;
    public void clickAngelinasFollowing(){click(AngelinasFollowing);}
    @FindBy(xpath = "//header/section[1]/ul[1]/li[1]/div[1]")
    WebElement AngelinasPost;
    public void clickAngelinasPost(){click(AngelinasPost);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[1]/a[2]")
    WebElement AngelinasVideos;
    public void clickAngelinasVideos(){click(AngelinasVideos);}
    @FindBy(xpath = "//header/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[2]/button[1]/div[1]/span[1]/*[1]")
    WebElement AngelinasArrow;
    public void clickAngelinasArrows(){click(AngelinasArrow);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[3]/article[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]")
    WebElement FirstPhoto;
    public void clickOnFirstPhoto(){click(FirstPhoto);}
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[2]/section[1]/span[1]/button[1]/div[2]/span[1]/*[1]")
    WebElement AngelinasLike;
    public void clickAngelinasLike(){click(AngelinasLike);}
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[2]/section[2]/div[1]/div[1]/div[1]/a[1]/div[1]")
    WebElement CountLikes;
    public void clickCountLikes(){click(CountLikes);}
}

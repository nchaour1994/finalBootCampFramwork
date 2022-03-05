package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ReportAccount extends commonApi{
    public ReportAccount(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//div[contains(text(),'Report Post, Message or Comment')]")
    WebElement ReportPost;
    public void clickReportsPost(){click(ReportPost);}
    @FindBy(xpath = "//div[contains(text(),'Report Account')]")
    WebElement ReportAccount;
    public void clickReportsAccount(){click(ReportAccount);}
}

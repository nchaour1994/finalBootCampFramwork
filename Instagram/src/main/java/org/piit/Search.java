package org.piit;
import base.commonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search extends commonApi {
    public Search(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")
    public WebElement Search;
    public void onSearch(){
        type(Search,"@angelinajolie");
        waitFor(3);
        //Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/ul[1]/div[1]/a[1]/div[1]/div[3]/button[1]/div[1]/*[1]")
    public WebElement Cross;
    public void onCross(){click(Cross);}
    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")
    public WebElement SearchBox;
    public void onSearchBox(){click(SearchBox);}
}

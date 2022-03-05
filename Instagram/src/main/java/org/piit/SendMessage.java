package org.piit;
import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessage extends commonApi {
    public SendMessage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
    WebElement Message;
    public void sendMessage(){
        click(Message);}
    @FindBy(xpath = "//h5[contains(text(),'1 Request')]")
    WebElement MessageRequest;
    public void seeMessageRequest(){click(MessageRequest);}
    @FindBy(xpath = "//button[contains(text(),'Delete All')]")
    WebElement DeleteAll;
    public void seeDeleteAll(){click(DeleteAll);}
    @FindBy(xpath = "//button[contains(text(),'+ New Collection')]")
    WebElement NewCollectionPic;
    public void clickCollectionPic(){click(NewCollectionPic);}
    @FindBy(xpath = "//h3[contains(text(),'Food')]")
    WebElement FoodCollection;
    public void foodCollectionPhoto(){click(FoodCollection);}

}

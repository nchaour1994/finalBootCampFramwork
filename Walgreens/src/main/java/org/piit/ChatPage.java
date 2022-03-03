package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage extends commonApi {
    public ChatPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ChatButton")
    WebElement chatBtn;
    @FindBy(xpath = "//div[@class='d2102020']")
    public
    WebElement chatWindow;

    public void clickOnchatBtn(){
        click(chatBtn);
    }
    public void dragChatWindow(){
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(chatWindow,500,7).build().perform();
    }
    public boolean checkIfchatWindowIsDsplayed(){
        return chatWindow.isDisplayed();
    }
}

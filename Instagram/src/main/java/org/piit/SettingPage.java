package org.piit;
import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.v6.B;
public class SettingPage extends commonApi{
    public SettingPage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//a[contains(text(),'Change Password')]")
    WebElement ChangePassword;
    public void changePasswords(){click(ChangePassword);}
    @FindBy(xpath ="//a[contains(text(),'Forgot Password?')]")
    WebElement Forgot;
    public void clickForgot(){click(Forgot);}

    @FindBy(xpath = "//a[contains(text(),'Apps and Websites')]")
    WebElement AppsWeWebsites;
    public void clickAppWebsite(){click(AppsWeWebsites);}
    @FindBy(xpath = "//span[contains(text(),'Expired')]")
    WebElement Expired;
    public void clickExpired(){click(Expired);}
    @FindBy(xpath = "//span[contains(text(),'Removed')]")
    WebElement Removed;
    public void clickRemoved(){click(Removed);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[5]/label[1]")
    WebElement NewEmails;
    public void clickNewEmails(){click(NewEmails);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[6]/label[1]")
    WebElement ShoppingBrands;
    public void clickShopping(){click(ShoppingBrands);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[7]/label[1]")
    WebElement ShoppingEmails;
    public void clickShoppingEmails(){click(ShoppingEmails);}
    @FindBy(xpath = "//a[contains(text(),'Email and SMS')]")
    WebElement EmailSMS;
    public void clickEmailSMS(){click(EmailSMS);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[4]/label[1]")
    WebElement ProductEmail;
    public void clickProductEmail(){click(ProductEmail);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/label[1]")
    WebElement Feedback;
    public void clickFeedback(){click(Feedback);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[3]/label[1]")
    WebElement Reminder;
    public void clickReminder(){click(Reminder);}
    @FindBy(xpath = "//a[contains(text(),'Push Notifications')]")
    WebElement PushNotifications;
    public void  clickPushNotification(){click(PushNotifications);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/section[1]/div[2]/fieldset[1]/label[2]/div[1]")
    WebElement FromPeople;
    public void clickFromPeople(){click(FromPeople);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/section[2]/div[2]/fieldset[1]/label[1]/div[1]")
    WebElement Commentsoff;
    public void clickCommentsOff(){click(Commentsoff);}
    @FindBy(xpath = "//h2[contains(text(),'Reminders')]")
    WebElement ReminderOff;
    public void clickReminderOff(){click(ReminderOff);}

    @FindBy(xpath = "//a[contains(text(),'Manage Contacts')]")
    WebElement ManageContacts;
    public void clickManageContacts(){click(ManageContacts);}

    @FindBy(xpath = "//a[contains(text(),'Privacy and Security')]")
    WebElement PrivacySecurity;
    public void clickPrivacySecurity(){click(PrivacySecurity);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/main[1]/section[1]/div[2]/div[1]/div[1]/label[1]")
    WebElement PrivateAccount;
    public void clickPrivate(){click(PrivateAccount);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/main[1]/section[2]/div[2]/div[1]/div[1]/label[1]")
    WebElement ActivityStatus;
    public void clickActivityStatus(){click(ActivityStatus);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/main[1]/section[11]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]")
    WebElement NoOne;
    public void clickNoOne(){click(NoOne);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/main[1]/section[13]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")
    WebElement Hides;
    public void clickHides(){click(Hides);}
    @FindBy(xpath = "//a[contains(text(),'View Account Data')]")
    WebElement AccountData;
    public void clickAccountData(){click(AccountData);}

    @FindBy(xpath = "//a[contains(text(),'Login Activity')]")
    WebElement loginActivity;
    public void clickLoginActivity(){click(loginActivity);}
    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[2]/div[1]")
    WebElement WasNotMe;
    public void clickWasNot(){click(WasNotMe);}
    @FindBy(xpath = "//button[contains(text(),'Not Now')]")
    WebElement NotNow;
    public void clickNotNow(){click(NotNow);}

    @FindBy(xpath = "//a[contains(text(),'Emails from Instagram')]")
    WebElement EmailsInstagram;
    public void clickEmailsInstagram(){click(EmailsInstagram);}
    @FindBy(xpath = "//span[contains(text(),'Other')]")
    WebElement Others;
    public void clickOthers(){click(Others);}

    @FindBy(xpath = "//a[contains(text(),'Help')]")
    WebElement Helps;
    public void clickHelp(){click(Helps);}
    @FindBy(xpath = "//a[contains(text(),'Switch to Professional Account')]")
    WebElement ProfessionalAccount;
    public void clickProfessionalAccount(){click(ProfessionalAccount);}

    @FindBy(xpath = "//label[contains(text(),'Gender')]")
    WebElement Gender;
    public void clickGender(){click(Gender);}

}


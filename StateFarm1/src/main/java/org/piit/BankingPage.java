package org.piit;

import base.commonApi;
import com.sun.deploy.config.JREInfo;
import com.sun.glass.ui.MenuItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingPage extends commonApi {


    public BankingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body[1]/header[1]/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[1]")
    public
    WebElement bankingMenu;
    @FindBy(css = "#oneX-0-banking")
    WebElement personalBanking;
    @FindBy(xpath = "//a[contains(text(),'Checking, savings, CDs, and credit cards')]")
    WebElement bankingOption;
    @FindBy(css = "body.formal.-oneX.-oneX-resize-bound:nth-child(2) section.west.bank-landing.-oneX-primary-khaki-04:nth-child(4) div.-oneX-container div.-oneX-row div.-oneX-col-12.-oneX-col-md-5.-oneX-offset-md-1.-oneX-col-xl-4.-oneX-offset-xl-2.-w_pr-md-0.-w_pl-md-5:nth-child(1) div.-oneX-row div.-oneX-col-12 div.-w_mb-55.-w_mb-md-60 > a.-oneX-link--block.-oneX-link-acquisition")
    WebElement checkingAccount;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]")
    WebElement saving;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[3]/a[1]")
    WebElement creditCard;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")
    WebElement cDS;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[5]/a[1]")
    WebElement retirementCds;




    public void bankingMenu() {click(bankingMenu);
    }

    public void personalBanking() {
        click(personalBanking);
    }

    public void bankingOption() {click(bankingOption);
    }

    public void checkingAccount() {click(checkingAccount);
    }

    public void saving() {click(saving);
    }

    public void creditCard() {click(creditCard);
    }

    public void cDS() {click(cDS);
    }

    public void retirementCds() {click(retirementCds);
    }
}




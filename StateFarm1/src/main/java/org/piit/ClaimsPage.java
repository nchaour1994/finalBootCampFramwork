package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimsPage extends commonApi {
    public ClaimsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public
    WebElement fileAClaim;
    @FindBy(xpath = "//label[contains(text(),'Auto & Motorcycle')]")
    public
    WebElement autoMotorcycle;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[6]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    public
    WebElement roadsideAssistance;
    @FindBy(css = "body.informal.-oneX.-oneX-resize-bound:nth-child(2) section.masthead.spacing-64.spacing-sm-32:nth-child(2) div.container div.row.no-gutters div.col-12 div.row div.col-12 div.-oneX-body--primary > a.-oneX-btn-primary__anchor.-oneX-btn-medium:nth-child(2)")
    public
    WebElement getRoadsideAssistance;
    @FindBy(xpath = "//button[@id='start-request']")
    public
    WebElement startMyRequest;
    @FindBy(xpath = "//a[contains(text(),'Track a Claim')]")
    public
    WebElement trackAClaim;
    @FindBy(css = "body.formal.-oneX.-oneX-resize-bound:nth-child(2) section.west.customer.-w_pb-40:nth-child(5) div.-oneX-container div.-oneX-row div.-oneX-col-12.-oneX-col-md-11.-oneX-col-lg-10.-oneX-offset-md-1.-oneX-offset-lg-2:nth-child(2) div:nth-child(1) div.-oneX-d-flex > a.-oneX-link--block.-oneX-d-block.-w_ml-15.-w_ml-sm-30.-w_pt-15")
    public
    WebElement createAnAccount;
    @FindBy(css = "input#inputphoneNumber")
    public
    WebElement phoneNumberField;
    @FindBy(css = "input#inputdateOfBirth")
    public
    WebElement dateOfBirthField;
    @FindBy(css = "input#inputemailAddress")
    public
    WebElement emailField;
    @FindBy(css = "button#customer-search-submit")
    public
    WebElement continueBtn;
    @FindBy(xpath = "//a[contains(text(),'Claims Help')]")
    public
    WebElement claimsHelp;
    @FindBy(css = "a#open-auto-drawer-undefined")
    public
    WebElement seeTheSteps;







    public void fileAClaim() {click(fileAClaim);
    }



    public void roadsideAssistance() {click(roadsideAssistance);
    }

    public void getRoadsideAssistance() {click(getRoadsideAssistance);
    }

    public void startMyRequest() {click(startMyRequest);
    }

    public void trackAClaim() {click(trackAClaim);
    }

    public void createAnAccount() {click(createAnAccount);
    }

    public void phoneNumberField() {type(phoneNumberField,"2121111111");
    }

    public void dateOfBirthField() {type(dateOfBirthField,"02031999");
    }

    public void emailField() {type(emailField,"abcd@gmail.com");
    }

    public void continueBtn() {click(continueBtn);
    }

    public void claimsHelp() {click(claimsHelp);
    }

    public void seeTheSteps() {click(seeTheSteps);
    }

    public void autoMotorcycle() {click(autoMotorcycle);
    }
}

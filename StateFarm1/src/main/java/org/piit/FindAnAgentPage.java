package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAnAgentPage extends commonApi {
    public FindAnAgentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='oneX-findAnAgentZipCode']")
    WebElement zipCodeField;
    @FindBy(xpath = "//button[@id='findAnAgentButton']")
    WebElement findAnAgentBtn;
    @FindBy(xpath = "//span[@id='search-options-toggle']")
    WebElement advanceSearchOptions;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//button[@id='search_advSearchOptions']")
    WebElement searchBtn;


    public void zipCodeField() {type(zipCodeField,"11233");
    }
    public void findAnAgentBtn() {click(findAnAgentBtn);
    }

    public void advanceSearchOptions() {click(advanceSearchOptions);
    }

    public void firstNameField() {type(firstNameField,"Joseph");
    }

    public void lastNameField() {type(lastNameField,"Biden");
    }

    public void searchBtn() {click(searchBtn);
    }



}

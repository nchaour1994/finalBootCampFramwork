package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends commonApi {
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#util-sf-search")
    WebElement searchField;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchBtn;
    @FindBy(css = "body.-oneX.-oneX-resize-bound:nth-child(2) div.-oneX-container.-oneX.search-table:nth-child(2) div.search-container section.filter-navigation div.filter-hidden div.filter div.filter-results ul.filter-result-list li:nth-child(3) > a.-oneX-body--secondary.-oneX-link--inline")
    WebElement auto;
    @FindBy(xpath = "//a[contains(text(),'What to Do After a Car Accident - State Farm®')]")
    WebElement whatToDoAfterAccident;


    public void searchField() {type(searchField,"report an accident");
    }

    public void searchBtn() {click(searchBtn);
    }

    public void auto() {click(auto);
    }

    public void whatToDoAfterAccident() {click(whatToDoAfterAccident);
    }
}

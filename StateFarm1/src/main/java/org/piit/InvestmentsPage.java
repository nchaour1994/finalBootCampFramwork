package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestmentsPage extends commonApi {

    public InvestmentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//span[contains(text(),'Investments')]")
public
WebElement investmentsMenu;
    @FindBy(css = "#oneX-0-investments")
    WebElement retirementAndIRAs;
    @FindBy(xpath = "//a[contains(text(),'Learn more about the IRA Bonus')]")
    WebElement learnAboutIraBonus;
    @FindBy(css = "#oneX-1-investments")
    WebElement mutualFunds;
    @FindBy(css = ("#oneX-2-investments"))
    WebElement educationSavings;
    @FindBy(css = "#oneX-3-investments")
    WebElement estatePlanning;
    @FindBy(css = "#oneX-4-investments")
    WebElement annuities;


    public void retirementAndIRA() {click(retirementAndIRAs);
    }

    public void learnAboutIraBonus() {click(learnAboutIraBonus);
    }

    public void mutualFunds() {click(mutualFunds);
    }

    public void educationSavings() {click(educationSavings);
    }

    public void estatePlanning() {click(estatePlanning);
    }

    public void annuities() {click(annuities);
    }
}
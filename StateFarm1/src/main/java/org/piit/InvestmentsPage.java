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
    public
    WebElement learnAboutIraBonus;
    @FindBy(css = "#oneX-1-investments")
    public
    WebElement mutualFunds;
    @FindBy(xpath = "//a[contains(text(),'Learn more about the IRA Bonus')]")
    public
    WebElement learnMoreAboutIraBonus;
    @FindBy(css = ("#oneX-2-investments"))
    public
    WebElement educationSavings;
    @FindBy(css = "body.informal.-oneX.-oneX-resize-bound:nth-child(2) section.copyblock.spacing-64.spacing-sm-32:nth-child(4) div.container div.row.justify-content-center div.col-12 div.-oneX-body--primary > a.-oneX-link--block.footNoteStyles.-oneX-link--inline:nth-child(2)")
    public
    WebElement learnmMoreATheStateFarm529SavingsPlan;
    @FindBy(css = "#oneX-3-investments")
    public
    WebElement estatePlanning;
    @FindBy(xpath = "//input[@class='-oneX-textfield__input -oneX-prime-white comboInp']")
    public
    WebElement zipCodeField;
    @FindBy(xpath = "//button[contains(text(),'Go')]")
    public
    WebElement goBtn;

    @FindBy(css = "#oneX-4-investments")
    public
    WebElement annuities;
    @FindBy(css = "input#callout-agent-zip-code-input1")
    public
    WebElement getZipCodeField;


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

    public void learnMoreAboutIraBonus() {click(learnMoreAboutIraBonus);
    }

    public void learnmMoreATheStateFarm529SavingsPlan() {click(learnmMoreATheStateFarm529SavingsPlan);
    }

    public void zipCodeField() {type(zipCodeField,"11233");
    }

    public void goBtn() {click(goBtn);
    }

    public void getZipCodeField() {type(getZipCodeField,"11233");
    }
}
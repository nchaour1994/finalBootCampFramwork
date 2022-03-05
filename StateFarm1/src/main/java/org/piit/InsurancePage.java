package org.piit;


import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage extends commonApi {


    public InsurancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='-oneX-header-top-menu-btn -oneX-header-top-menu-btn__has-submenu'])[1]")
    public
    WebElement insuranceMenu;
    @FindBy(xpath = "//a[text()='Car Insurance']")
    WebElement carInsurance;
    @FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
    WebElement motorcycle;
    @FindBy(xpath = "//a[contains(text(),'Boat')]")
    WebElement boat;
    @FindBy(xpath = "//a[contains(text(),'Off-road Vehicles')]")
    WebElement offRoadVehicles;
    @FindBy(css = "body.informal.-oneX.-oneX-resize-bound:nth-child(2) header.-oneX.noindex.-oneX-header-app-open:nth-child(11) nav.-oneX-header.-oneX-container-fluid section.-oneX-header-nav-apps-container div.-oneX-header-nav-container:nth-child(1) div.-oneX-header-main-nav ul.-oneX-header-main-nav-menu li.-oneX-header-main-nav-list:nth-child(1) section.-oneX-header-submenu-container.-oneX-header-menu div.-oneX-mainmenu-section-wrapper div.-oneX-submenu-section:nth-child(2) div.-oneX-submenu-section-wrapper.-oneX-hide-link-master:nth-child(1) section.-oneX-sub-navigation-menu ul.-oneX-subMenu-items.-oneX-hidden.-oneX-links-as-heading:nth-child(2) li:nth-child(5) > a.-oneX-link--block.menuLevel2")
    WebElement motorHome;
    @FindBy(xpath = "//header/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[1]/section[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[6]/a[1]")
    WebElement roadsideAssistance;
    @FindBy(xpath = "//body[1]/header[1]/nav[1]/section[3]/div[1]/div[1]/ul[1]/li[2]/div[1]/button[1]/span[1]")
    WebElement bankingMenu;
    @FindBy(xpath = "//span[contains(text(),'Investments')]")
    WebElement investmentsMenu;
    @FindBy(xpath = "//span[contains(text(),'Get a Quote')]")
    WebElement getAQuoteMenu;
    @FindBy(xpath = "//span[contains(text(),'Pay a Bill')]")
    WebElement payABillMenu;
    @FindBy(xpath = "//span[contains(text(),'Claims')]")
    WebElement claimsMenu;
    @FindBy(xpath = "//span[contains(text(),'Find an Agent')]")
    WebElement findAnAgentMenu;
    @FindBy(xpath = "//a[contains(text(),'Pay insurance bill')]")
    WebDriver payInsuranceBillMenu;
    @FindBy(xpath = "//a[contains(text(),'Enroll in AutoPay')]")
    WebElement enrollInAutoPayMenu;
    @FindBy(xpath = "//a[contains(text(),'Go paperless')]")
    WebElement goPaperLessMenu;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement search;
    @FindBy(xpath = "//span[contains(text(),'Help')]")
    public
    WebElement help;







    public void insuranceMenu() {
        click(insuranceMenu);
    }

    public void carInsurance() {
        click(carInsurance);
    }


    public void motorcycle() {click(motorcycle);
    }

    public void boat() {click(boat);
    }


    public void offRoadVehicles() {click(offRoadVehicles);
    }




    public void roadsideAssistance() {click(roadsideAssistance);
    }


    public void bankingMenu() {click(bankingMenu);
    }


    public void investmentsMenu() {click(investmentsMenu);
    }


    public void getAQuoteMenu() {click(getAQuoteMenu);
    }

    public void payABillMenu() {click(payABillMenu);
    }


    public void claimsMenu() {click(claimsMenu);
    }


    public void findAnAgentMenu() {click(findAnAgentMenu);
    }

    public void payInsuranceBillMenu() {click(payABillMenu);
    }

    public void enrollInAutoPayMenu() {click(enrollInAutoPayMenu);
    }

    public void goPaperLessMenu() {click(goPaperLessMenu);
    }

    public void search() {click(search);
    }

    public void help() {click(help);
    }
}



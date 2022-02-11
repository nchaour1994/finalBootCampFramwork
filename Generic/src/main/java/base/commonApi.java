package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class commonApi {

    public static  WebDriver driver;
    String path = System.getProperty("user.home");
    @Parameters({"os","browserName","URL"})
    @BeforeMethod
    public void init(@Optional("windows") String os, @Optional("chrome")String browserName, @Optional("https://www.google.com") String url){
        getDriver(os,browserName);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public WebDriver getDriver(String os ,String browserName ){
        if (browserName.equalsIgnoreCase("chrome")){
            if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver",path+"\\IdeaProjects\\finalBootCampFramwork\\Generic\\src\\Drivers\\chromedriver.exe");
            }else{
                System.setProperty("webdriver.chrome.driver",path+"\\IdeaProjects\\finalBootCampFramwork\\Generic\\src\\Drivers\\chromedriver");
            }
            driver=new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){
            if(os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.gecko.driver",path+"\\IdeaProjects\\finalBootCampFramwork\\Generic\\src\\Drivers\\geckodriver.exe");
            }else{
                System.setProperty("webdriver.gecko.driver",path+"\\IdeaProjects\\finalBootCampFramwork\\Generic\\src\\Drivers\\chromedriver");
            }

            driver=new FirefoxDriver();
        }
        return driver;
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getTitle(){

        return driver.getTitle();
    }

    public void typeAndEnter(WebElement element, String text){

        element.sendKeys(text, Keys.ENTER);
    }
    public void click(WebElement element){

        element.click();
    }
    public void clickById(WebElement element){
        element.click();

    }
    public void clear(WebElement element){

        element.clear();
    }
    public void type(WebElement element, String text){

        element.sendKeys(text);
    }
    public String getText(WebElement element){
        String text;
        text = element.getText();
        return text;
    }
    public void selectDropdownOption(WebElement element, String option){
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        }catch (Exception e){
            select.selectByValue(option);
        }
    }
    public List<WebElement> getDropdownOptions(WebElement element){
        Select select = new Select(element);
        List<WebElement> list = select.getOptions();
        return list;
    }
    public void hoverOver(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void pressEnter(WebElement element){
        element.sendKeys(Keys.ENTER);
    }
    public void checkIfChecked(WebElement element){
        Assert.assertTrue(element.isSelected());
    }
    public void checkIfNotChecked(WebElement element){
        Assert.assertFalse(element.isSelected());
    }
    public void checkIfVisible(WebElement element){
        Assert.assertTrue(element.isSelected());
    }
    public void checkIfNotVisible(WebElement element){
        Assert.assertFalse(element.isDisplayed());
    }
    public void checkIfEnabled(WebElement element){
        Assert.assertTrue(element.isEnabled());
    }
    public void checkIfDisabled(WebElement element){
        Assert.assertFalse(element.isEnabled());
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void scrollToView(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }
    public void switchToFrame(String id){
        try {
            driver.switchTo().frame(id);
        }catch (Exception e){
            driver.switchTo().frame(Integer.parseInt(id));
        }

    }



}

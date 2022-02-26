package org.piit;


import base.commonApi;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.v6.B;
public class ProfileSelections extends commonApi{
 public ProfileSelections(WebDriver driver){this.driver=driver;
  PageFactory.initElements(driver, this);}
 // <---------------------------------------->
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
 WebElement Meta;
 public void clickOnMeta(){click(Meta);}
 @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
 WebElement Who;
 public void clickWho(){click(Who);}
 /////////////////////////////////////////////////////
 @FindBy(xpath = "//div[contains(text(),'About')]")
 WebElement About;
 public void clickOnAbout(){click(About);}
 @FindBy(xpath = "//a[contains(text(),'probalshela')]")
 WebElement AboutHome;
 public void clickAboutHome(){click(AboutHome);}
 /////////////////////////////////////////////////////

 @FindBy(xpath = "//div[contains(text(),'Blog')]")
 WebElement Blog;
 public void clickOnBlog(){click(Blog);}
 @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/div[1]/div[1]/div[1]/div[1]/a[1]/p[1]")
 WebElement Product;
 public void clickProduct(){click(Product);}

 @FindBy(xpath = "//div[contains(text(),'Jobs')]")
 WebElement Jobs;
 public void clickOnJobs(){click(Jobs);}
 @FindBy(xpath = "//body/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[4]/button[1]")
 WebElement Teams;
 public void clickTeams(){click(Teams);}


 @FindBy(xpath = "//div[contains(text(),'Help')]")
 WebElement Help;
 public void clickOnHelp(){click(Help);}

 @FindBy(xpath = "//a[contains(text(),'COVID-19 Information Center')]")
 WebElement Covid;
 public void clickCovid(){click(Covid);}

 @FindBy(xpath = "//div[contains(text(),'API')]")
 WebElement API;
 public void clickOnAPI(){click(API);}
 @FindBy(xpath = "//div[contains(text(),'API')]")
 WebElement Tools;
 public void clickTools(){click(Tools);}

 @FindBy(xpath = "//div[contains(text(),'Privacy')]")
 WebElement Privacy;
 public void clickOnPrivacy(){click(Privacy);}

 @FindBy(xpath = "//div[contains(text(),'Terms')]")
 WebElement Terms;
 public void clickOnTerms(){click(Terms);}
 // <---------------------------------------->
 @FindBy(xpath = "//div[contains(text(),'Top Accounts')]")
 WebElement TopAccounts;
 public void clickOnTopAccounts(){click(TopAccounts);}
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[2]/div[1]/ul[1]/li[2]")
 WebElement One;
 public void clickOne(){click(One);}
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[2]/div[1]/ul[3]/li[1]")
 WebElement Six;
 public void clickSix(){click(Six);}
 // <---------------------------------------->
 @FindBy(xpath = "//div[contains(text(),'Hashtags')]")
 WebElement Hashtags;
 public void clickOnHastags(){click(Hashtags);}
 @FindBy(xpath = "//a[contains(text(),'4')]")
 WebElement Four;
 public void clickFour(){click(Four);}
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[2]")
 WebElement HashDir;
 public void clickHashDir(){click(HashDir);}
 // <---------------------------------------->
 @FindBy(xpath ="//div[contains(text(),'Locations')]")
 WebElement Locations;
 public void clickLocations(){click(Locations);}
 @FindBy(xpath ="//a[contains(text(),'United States')]")
 WebElement USALocations;
 public void clickUSALocations(){click(USALocations);}
 @FindBy(xpath ="//a[contains(text(),'Flushing')]")
 WebElement FluLocations;
 public void clickFluLocations(){click(FluLocations);}
 @FindBy(xpath ="//a[contains(text(),'M Tea')]")
 WebElement Mtea;
 public void clickMtea(){click(Mtea);}
 @FindBy(xpath ="//a[contains(text(),'Bangladesh')]")
 WebElement Bangladesh;
 public void clickBangladesh(){click(Bangladesh);}
 @FindBy(xpath ="//a[contains(text(),'Dhaka')]")
 WebElement Dhaka;
 public void clickDhaka(){click(Dhaka);}
 @FindBy(xpath ="//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[3]/div[1]/ul[2]/li[16]")
 WebElement Sultans;
 public void clickSultans(){click(Sultans);}
 @FindBy(xpath ="//a[contains(text(),'United Arab Emirates')]")
 WebElement Emirates;
 public void clickEmirates(){click(Emirates);}
 @FindBy(xpath ="//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")
 WebElement Dubai;
 public void clickDubai(){click(Dubai);}
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/a[1]")
 WebElement Burj;
 public void clickBurj(){click(Burj);}
 @FindBy(xpath ="//a[contains(text(),'Turkey')]")
 WebElement Turkey;
 public void clickTurkey(){click(Turkey);}
 @FindBy(xpath = "//a[contains(text(),'Istanbul')]")
 WebElement Istanbul;
 public void clickIstanbul(){click(Istanbul);}
 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/div[1]/div[3]/div[1]/ul[2]/li[1]/a[1]")
 WebElement Aya;
 public void clickAya(){click(Aya);}
 // <---------------------------------------->
 @FindBy(xpath = "//div[contains(text(),'See More')]")
 WebElement SeeMores;
 public void clickMore(){click(SeeMores);}

 @FindBy(xpath = "//div[contains(text(),'Instagram Lite')]")
 WebElement InstagramLite;
 public void clickInstagramLite(){click(InstagramLite);}

 @FindBy(xpath = "//body/div[@id='react-root']/section[1]/footer[1]/div[1]/div[2]/div[1]/span[1]/select[1]")
 WebElement English;
 public void clickEnglish(){click(English);}

 @FindBy(xpath = "//div[contains(text(),'© 2022 Instagram from Meta')]")
 WebElement InstagramMeta;
 public void clickInstaMeta(){click(InstagramMeta);}}
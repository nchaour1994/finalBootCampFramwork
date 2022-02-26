package org.piit;

import base.commonApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AntiGenQuickViewTestPage extends commonApi {

    public AntiGenQuickViewTestPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#wag-pickup-tab")
    WebElement pickUpIcon;
    @FindBy(css = "#receiveing-addToCartbtn")
    WebElement addForPickUpBtn;
    @FindBy(css = "#addToCart-cart-checkout")
    WebElement viewCartBtn;
    @FindBy(css = "#wag-shipping-tab")
    WebElement shippingIcon;
    @FindBy(xpath = "//*[text()=' Write a review   ']")
    WebElement writeReviewBtn;
    @FindBy(css = "#bv-radio-rating-4")
    WebElement ratingStars;
    @FindBy(css = "#bv-text-field-title")
    WebElement reviewTitle;
    @FindBy(css = "#bv-textarea-field-reviewtext")
    WebElement review;
    @FindBy(css = "#bv-text-field-usernickname")
    WebElement nickName;
    @FindBy(css = "#bv-email-field-hostedauthentication_authenticationemail")
    WebElement email;



    public void clickOnpickUpIcon(){
        click(pickUpIcon);
    }
    public void clickOnaddForPickUpBtn(){
        click(addForPickUpBtn);
    }
    public void clickOnaviewCartBtn(){
        click(viewCartBtn);
    }
    public void clickOnshippingIcon(){
        click(shippingIcon);
    }
    public void clickOnwriteReviewBtn(){
        click(writeReviewBtn);
    }
    public void ScrollTowriteReviewBtn(){
        scrollToView(writeReviewBtn);
    }
    public void clickOnratingStars(){
        click(ratingStars);
    }
    public void typeOnreviewTitle(){
        type(reviewTitle,"great covid test");
    }
    public void typeOnreview(){
        type(review,"am happy to buy this product ");
    }
    public void typeOnnickName(){
        type(nickName,"john187");
    }
    public void typeOnEmail(){
        type(email,"john1899@gmail.com");
    }
    public boolean checkIfaddForPickUpBtnIsEnabled(){
        return addForPickUpBtn.isEnabled();
    }
    public boolean checkIfviewCartBtnIsEnabled(){
        return viewCartBtn.isEnabled();
    }

}

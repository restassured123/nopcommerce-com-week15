package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumia extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCard;
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement closeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckBox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerTab;


    public void changeNokiaQuantity() {
        WebElement element = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        element.clear();
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"), "2");
    }

    public void addToCartNokia() {
        Reporter.log("Click on add to Cart" + addToCard.toString());
        CustomListeners.test.log(Status.PASS," Click on add to Cart " + addToCard);
        clickOnElement(addToCard);
    }

    public void closeGreenMessage() {
        Reporter.log("Close Message" + closeMessage.toString());
        CustomListeners.test.log(Status.PASS," Close Message " + closeMessage);
        clickOnElement(closeMessage);
    }

    public void hoverFromShoppingToGoCart() {
        Reporter.log("Hover on Shopping Cart" + shoppingCart.toString());
        Reporter.log("Click on go to cart" + goToCart.toString());
        CustomListeners.test.log(Status.PASS,"Hover on Shopping Cart " + shoppingCart);
        CustomListeners.test.log(Status.PASS," Click on go to cart " + goToCart);
        mouseHoverFromOneElementToAnotherAndClick(shoppingCart, goToCart);
    }

    public void selectClickOnCheckBox() {
        Reporter.log("select Click On Check Box" + clickOnCheckBox.toString());
        CustomListeners.test.log(Status.PASS," select Click On Check Box " + clickOnCheckBox);
        clickOnElement(clickOnCheckBox);
    }

    public void clickOnCheckOut() {
        Reporter.log("Click On Check out button" + checkOutButton.toString());
        CustomListeners.test.log(Status.PASS," Click On Check out button" + checkOutButton);
        clickOnElement(checkOutButton);
    }

    public void clickOnRegisterTab() {
        Reporter.log("Click On register tab" + registerTab.toString());
        CustomListeners.test.log(Status.PASS," Click On register tab " + registerTab);
        clickOnElement(registerTab);
    }


}

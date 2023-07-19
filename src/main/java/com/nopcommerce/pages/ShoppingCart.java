package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCart extends Utility {

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsAndCondition;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutButton;


    public void clickOnTermsAndCondition() {
        Reporter.log("click On Terms And Condition " + termsAndCondition.toString());
        CustomListeners.test.log(Status.PASS, "click On Terms And Condition  " + termsAndCondition);
        clickOnElement(termsAndCondition);
    }

    public void clickOnCheckOut() {
        Reporter.log("click On CheckOut" + checkOutButton.toString());
        CustomListeners.test.log(Status.PASS, "click On CheckOut  " + checkOutButton);
        clickOnElement(checkOutButton);
    }
}


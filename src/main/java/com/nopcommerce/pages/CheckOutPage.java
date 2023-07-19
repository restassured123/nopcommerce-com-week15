package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmOrder;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonThatTakesToHomePage;


    public void checkOutContinue() {
        Reporter.log("click On continue " + clickOnContinue.toString());
        CustomListeners.test.log(Status.PASS, "click On continue " + clickOnContinue);
        clickOnElement(clickOnContinue);
    }

    public void selectNextDayAir() {
        Reporter.log("click On Next Day option " + nextDayButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Next Day option" + nextDayButton);
        clickOnElement(nextDayButton);
    }

    public void clickOnContinue() {
        Reporter.log("click On continue " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "click On continue " + continueButton);
        clickOnElement(continueButton);
    }

    public void clickOnConfirm() {
        Reporter.log("click On confirm Tab " + confirmOrder.toString());
        CustomListeners.test.log(Status.PASS, "click On confirm Tab" + confirmOrder);
        clickOnElement(confirmOrder);
    }

    public void setClickOnContinue() {
        Reporter.log("click On continue Tab " + continueButtonThatTakesToHomePage.toString());
        CustomListeners.test.log(Status.PASS, "click On continue Tab" + continueButtonThatTakesToHomePage);
        clickOnElement(continueButtonThatTakesToHomePage);
    }

}

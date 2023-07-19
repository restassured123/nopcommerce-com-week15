package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']")
    WebElement desktopButton;


    public void clickOnDesktop() {
        Reporter.log("click On Desktop " + desktopButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Desktop " + desktopButton);
        clickOnElement(desktopButton);

    }
}


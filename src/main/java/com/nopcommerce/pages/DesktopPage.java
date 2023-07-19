package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = " //option[contains(text(),'Name: Z to A')]")
    WebElement sortByButton;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement sortByAToZ;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCardButton;


    public void sortByButton() {
        Reporter.log("sort by Button" + sortByButton.toString());
        CustomListeners.test.log(Status.PASS, "sort by Button" + sortByButton);
        clickOnElement(sortByButton);
    }

    public void setSortByAToZ() {
        Reporter.log("set Sort By A To Z " + sortByAToZ.toString());
        CustomListeners.test.log(Status.PASS, "set Sort By A To Z " + sortByAToZ);
        clickOnElement(sortByAToZ);
    }

    public void clickAddToCardButton() {
        Reporter.log("click Add To Card Button " + addToCardButton.toString());
        CustomListeners.test.log(Status.PASS, "click Add To Card Button " + addToCardButton);
        clickOnElement(addToCardButton);
    }


}

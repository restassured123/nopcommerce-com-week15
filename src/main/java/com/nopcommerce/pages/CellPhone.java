package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhone extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//a[@title = 'Show details for Nokia Lumia 1020']")
    WebElement nokiaLumia;


    public void clickOnListView() {
        Reporter.log("click On List ViewIcon " + listView.toString());
        CustomListeners.test.log(Status.PASS,"click On List ViewIcon " + listView);
        clickOnElement(listView);
    }

    public void clickOnNokia() {
        Reporter.log("click On Nokia Lumia  " + nokiaLumia.toString());
        CustomListeners.test.log(Status.PASS,"click On Nokia Lumia " + nokiaLumia);
        clickOnElement(nokiaLumia);
    }


}

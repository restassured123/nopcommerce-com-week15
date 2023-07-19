package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Computers ']")
    WebElement computerButton;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space() = 'Electronics']")
    WebElement electronicButton;
    @CacheLookup
    @FindBy(xpath = "//a[text() = 'Cell phones ']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;


    public void clickOnLoginLink() {
        Reporter.log("Click on Login Button " + loginLink.toString());
        CustomListeners.test.log(Status.PASS,"Click on Login Button" + loginLink);
        clickOnElement(loginLink);
    }
    public void clickOnComputer() {
        Reporter.log("Click on Computer Button " + computerButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Computer Button" + computerButton);
        clickOnElement(computerButton);
    }
    public void moveToElementToAnotherAndCLick(){
        Reporter.log("Hover to electronic tab  " + electronicButton.toString());
        Reporter.log("Click on cell Phone option " + cellPhone.toString());
        CustomListeners.test.log(Status.PASS,"Hover to electronic tab  " + computerButton);
        CustomListeners.test.log(Status.PASS,"Click on cell Phone option" + cellPhone);
        mouseHoverFromOneElementToAnotherAndClick(electronicButton,cellPhone);
    }
    public void clickOnLogOut(){
        Reporter.log("Click on Logout Button " + logOutButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Logout Button" + logOutButton);
        clickOnElement(logOutButton);
    }

}


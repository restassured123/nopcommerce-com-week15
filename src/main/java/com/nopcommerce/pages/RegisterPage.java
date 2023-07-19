package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderTab;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;


    public void selectGender() {
        Reporter.log("select Gender " + genderTab.toString());
        CustomListeners.test.log(Status.PASS,"select Gender " + genderTab);
        clickOnElement(genderTab);
    }
    public void enterFirstName(String text) {
        Reporter.log("enter First Name" + firstName.toString());
        CustomListeners.test.log(Status.PASS,"enter First Name " + firstName);
        sendTextToElement(firstName, text);
    }
    public void enterLastName(String text) {
        Reporter.log("enter last Name" + lastName.toString());
        CustomListeners.test.log(Status.PASS,"enter last Name " + lastName);
        sendTextToElement(lastName, text);
    }
    public void enterEmail(String text){
        Reporter.log("enter email" + emailId.toString());
        CustomListeners.test.log(Status.PASS,"enter email " + emailId);
        sendTextToElement(emailId,text);

    }
    public void enterPassword(String text){
        Reporter.log("enter password" + password.toString());
        CustomListeners.test.log(Status.PASS,"enter password " + password);
        sendTextToElement(password,text);
    }
    public void confirmPassword(String text){
        Reporter.log("enter Confirm password" + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS,"enter Confirm password " + confirmPassword);
        sendTextToElement(confirmPassword,text);
    }
    public void clickOnRegisterTab(){
        Reporter.log("click On Register Tab" + clickOnRegister.toString());
        CustomListeners.test.log(Status.PASS,"click On Register Tab" + clickOnRegister);
        clickOnElement(clickOnRegister);
    }
    public void clickOnContinueTab(){
        Reporter.log("click On continue Tab" + continueTab.toString());
        CustomListeners.test.log(Status.PASS,"click On continue Tab" + continueTab);
        clickOnElement(continueTab);
    }
}

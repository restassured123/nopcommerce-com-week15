package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement login;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement clickOnLogIn;



    public String getWelcomeText() {
        Reporter.log(" Get Welcome Text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS," Get Welcome Text " + welcomeText);
        return getTextFromElement(welcomeText);
    }
    public void clickOnLogIn(){
        Reporter.log("Click on Login Tab" + login.toString());
        CustomListeners.test.log(Status.PASS," Click on Login Tab " + login);
        clickOnElement(login);
    }
    public void enterEmail(String text){
        Reporter.log("Enter EmailAddress " + email.toString());
        CustomListeners.test.log(Status.PASS," Enter EmailAddress " + email);
        sendTextToElement(email,text);
    }
    public void enterPassword(String text){
        Reporter.log("Enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS," Enter Password " + password);
        sendTextToElement(password,text);
    }
    public void setClickOnLogIn(){
        Reporter.log("Click on Login Button " + clickOnLogIn.toString());
        CustomListeners.test.log(Status.PASS,"Click on Login Button" + clickOnLogIn);
        clickOnElement(clickOnLogIn);
    }

}

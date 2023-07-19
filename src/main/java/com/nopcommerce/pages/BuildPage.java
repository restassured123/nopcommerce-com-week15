package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement software;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement software1;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkOnTermsCondition;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@name = 'save']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement checkNextDayAirButton;
    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue'][@class = 'button-1 shipping-method-next-step-button']")
    WebElement continueShippingButton;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[text()='Continue']")
    WebElement continueCreditCardButton;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement cardExpirationMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement getCardExpirationYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']//button[text()='Continue']")
    WebElement continueButtonPaymentCard;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmOrder;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonAfterOrderPlaced;

    public void selectProcessor(String text) {
        Reporter.log("select Processor " + processor.toString());
        CustomListeners.test.log(Status.PASS, "select Processor "+ processor);
        selectByValueFromDropDown(processor, text);

    }

    public void selectRam(String text) {
        Reporter.log("select Ram " + ram.toString());
        CustomListeners.test.log(Status.PASS, "select Ram "+ ram);
        selectByValueFromDropDown(ram, text);
    }

    public void clickHdd() {
        Reporter.log("select Hdd " + hdd.toString());
        CustomListeners.test.log(Status.PASS, "select Hdd "+ hdd);
        clickOnElement(hdd);
    }

    public void clickOs() {
        Reporter.log("select OS" + os.toString());
        CustomListeners.test.log(Status.PASS, "select OS "+ os);
        clickOnElement(os);
    }

    public void clickSoftware() {
        Reporter.log("select Microsoft Office" + software.toString());
        CustomListeners.test.log(Status.PASS, "select Microsoft Office"+ software);
        clickOnElement(software);
    }

    public void clickSoftwareTwo() {
        Reporter.log("select Total Commander " + software1.toString());
        CustomListeners.test.log(Status.PASS, "select Total Commander "+ software1);
        clickOnElement(software1);
    }

    public void clickAddToCart() {
        Reporter.log("Click on Add to cart  " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Click on Add to cart "+ addToCart);
        clickOnElement(addToCart);
    }

    public void clickOnCloseBar() {
        Reporter.log("Click to close Bar " + closeBar.toString());
        CustomListeners.test.log(Status.PASS, "Click to close Bar"+ closeBar);
        clickOnElement(closeBar);
    }

    public void hoverOnShoppingCart() {
        Reporter.log("Hover Mouse to shopping cart " + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Hover Mouse to shopping cart"+ shoppingCart);
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCart() {
        Reporter.log("Hover Mouse to Go To Cart and Click" + goToCart.toString());
        CustomListeners.test.log(Status.PASS, "Hover Mouse to Go To Cart and Click" + goToCart);
        mouseHoverToElementAndClick(goToCart);
    }

    public void changeQuantity() {
        WebElement element = driver.findElement(By.xpath("//input[@class = 'qty-input']"));
        element.clear();
        sendTextToElement(By.xpath("//input[@class = 'qty-input']"), "2");
    }

    public void termsAndCondition() {
        Reporter.log("Select terms & Conditions" + checkOnTermsCondition.toString());
        CustomListeners.test.log(Status.PASS, "Select terms & Conditions"+ checkOnTermsCondition);
        clickOnElement(checkOnTermsCondition);
    }

    public void enterFirstName(String text) {
        Reporter.log("Enter FirstName" + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Enter FirstName"+ firstName);
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {
        Reporter.log("Enter LastName" + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Enter LastName"+ lastName);
        sendTextToElement(lastName, text);
    }

    public void enterEmailAddress(String text) {
        Reporter.log("Enter Email" + email.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email"+ email);
        sendTextToElement(email, text);
    }

    public void selectCountryFromList(String text) {
        Reporter.log("Select Country from list" + selectCountry.toString());
        CustomListeners.test.log(Status.PASS, "Select Country from list" + selectCountry);
        selectByVisibleTextFromDropDown(selectCountry, text);
    }

    public void setCity(String text) {
        Reporter.log("Select city" + city.toString());
        CustomListeners.test.log(Status.PASS, "Select city"+ city);
        sendTextToElement(city, text);
    }

    public void setAddress(String text) {
        Reporter.log("Set Address" + address.toString());
        CustomListeners.test.log(Status.PASS, "Set Address" + address);
        sendTextToElement(address, text);
    }

    public void setPostalCode(String text) {
        Reporter.log(postalCode.toString());
        CustomListeners.test.log(Status.PASS, "Set Address "+ postalCode);
        sendTextToElement(postalCode, text);
    }

    public void setPhoneNumber(String text) {
        Reporter.log(phoneNumber.toString());
        CustomListeners.test.log(Status.PASS, "Set phoneNumber" + phoneNumber);
        sendTextToElement(phoneNumber, text);
    }

    public void clickContinue() {
        Reporter.log(continueButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue" + continueButton);
        clickOnElement(continueButton);

    }

    public void clickOnNextDayButton() {
        Reporter.log(checkNextDayAirButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on nest day air option" + checkNextDayAirButton);
        clickOnElement(checkNextDayAirButton);
    }

    public void clickOnContinueShippingButton() {
        Reporter.log(continueShippingButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue Shipping" + continueShippingButton);
        clickOnElement(continueShippingButton);
    }

    public void selectCreditCard() {
        Reporter.log(creditCard.toString());
        CustomListeners.test.log(Status.PASS, "Click on Credit Card Option" + creditCard);
        clickOnElement(creditCard);
    }

    public void clickOnContinueCreditCardButton() {
        Reporter.log(continueCreditCardButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on continue with credit card" + continueCreditCardButton);
        clickOnElement(continueCreditCardButton);
    }

    public void selectMasterCardFomDropDown(String text) {
        Reporter.log(masterCard.toString());
        CustomListeners.test.log(Status.PASS, "select Master Card Fom DropDown" + masterCard);
        selectByValueFromDropDown(masterCard, text);
    }

    public void enterCardHolderName(String text) {
        Reporter.log(cardHolderName.toString());
        CustomListeners.test.log(Status.PASS, "enter Card Holder Name" + cardHolderName);
        sendTextToElement(cardHolderName, text);
    }

    public void enterCardNumber(String text) {
        Reporter.log(cardNumber.toString());
        CustomListeners.test.log(Status.PASS, "enter Card Number" + cardNumber);
        sendTextToElement(cardNumber, text);
    }

    public void selectExpireMonth(String text) {
        Reporter.log(cardExpirationMonth.toString());
        CustomListeners.test.log(Status.PASS, "select Expire Month" + cardExpirationMonth);
        selectByValueFromDropDown(cardExpirationMonth, text);
    }

    public void selectExpireYear(String text) {
        Reporter.log(getCardExpirationYear.toString());
        CustomListeners.test.log(Status.PASS, "select Expire year" + getCardExpirationYear);
        selectByValueFromDropDown(getCardExpirationYear, text);
    }

    public void enterCardCode(String text) {
        Reporter.log(cardCode.toString());
        CustomListeners.test.log(Status.PASS, "enter Card Code" + cardCode);
        sendTextToElement(cardCode, text);
    }

    public void clickOnContinueButtonOfPaymentCard() {
        Reporter.log(continueButtonPaymentCard.toString());
        CustomListeners.test.log(Status.PASS, "click On Continue Button Of PaymentCard" + continueButtonPaymentCard);
        clickOnElement(continueButtonPaymentCard);
    }

    public void clickOnConfirmOrder() {
        Reporter.log(confirmOrder.toString());
        CustomListeners.test.log(Status.PASS, "click On Confirm Order" + confirmOrder);
        clickOnElement(confirmOrder);
    }

    public void continueButtonAfterOrderPlacedSuccessfully() {
        Reporter.log(continueButtonAfterOrderPlaced.toString());
        CustomListeners.test.log(Status.PASS, "continue Button After Order Placed Successfully" + continueButtonAfterOrderPlaced);
        clickOnElement(continueButtonAfterOrderPlaced);
    }

}


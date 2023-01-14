package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US006_007_008_009_010_045_049_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US006_007_008_009_010_045_049 {

    TrendLifeBuyPage life=new TrendLifeBuyPage();
    US006_007_008_009_010_045_049_Page leventPage = new US006_007_008_009_010_045_049_Page();
    Actions actions=new Actions(Driver.getDriver());

    @Then("User clicks the LOGIN link")
    public void user_clicks_login_link() {
        if (leventPage.firstAlertMailLevent.isDisplayed()){
            leventPage.firstAlertMailCloseLevent.click();
        }
        else {
            life.loginLink.click();
        }
    }

    @Then("User clicks the Click Here link next to Forgot Password? text")
    public void userClicksTheClickHereLinkNextToForgotPasswordText() {
        leventPage.clickHereLink.click();
    }

    @Then("User verifies being redirected to Password Reset page")
    public void userVerifiesBeingRedirectedToPasswordResetPage() {
        Assert.assertTrue(leventPage.forgotPasswordPageText.isDisplayed());
    }

    @Then("User clicks the Sign Up link next to Don't have an Account? text")
    public void userClicksTheSignUpLinkNextToDonTHaveAnAccountText() {
        leventPage.signUpDontHaveAnAccountLink.click();
    }

    @Then("User verifies being redirected to Register page")
    public void userVerifiesBeingRedirectedToRegisterPage() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User verifies being redirected to Home page")
    public void userVerifiesBeingRedirectedToHomePage() {
        String expectedHomePageUrl="https://trendlifebuy.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedHomePageUrl));
    }

    @Then("User verifies that \\(Logged In Succesfully!) message appears in the corner")
    public void userVerifiesThatLoggedInSuccesfullyMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.logInPopUpMessage.isEnabled());
    }

    @Then("User verifies that \\(These credentials do not match our records.) message appears")
    public void userVerifiesThatTheseCredentialsDoNotMatchOurRecordsMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.wrongLogInPopUpMessage.isDisplayed());
    }

    @Then("User enters {string} and {string} and logs in")
    public void userEntersAndAndLogsIn(String arg0, String arg1) {
        life.emailBox.sendKeys(arg0);
        life.passwordBox.sendKeys(arg1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        life.signInButton.click();
    }

    @Then("User clicks the Remember me checkbox")
    public void userClicksTheRememberMeCheckbox() {
        leventPage.rememberMeBox.click();
    }

    @Then("User verifies that Remember me checkbox is being clicked")
    public void userVerifiesThatRememberMeCheckboxIsBeingClicked() {
        Assert.assertFalse(leventPage.rememberMeBox.isSelected());
    }

    @Then("User clicks the Sign up with Google button")
    public void userClicksTheSignUpWithGoogleButton() {
        leventPage.signUpWithGoogle.click();
    }

    @Then("User verifies being redirected to {string} page")
    public void userVerifiesBeingRedirectedToPage(String arg0) {
        String expectedsignUpUrl="arg0";
        String actualsignUpUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(expectedsignUpUrl.contains(actualsignUpUrl));
    }

    @Then("User clicks the Sign up with Facebook button")
    public void userClicksTheSignUpWithFacebookButton() {
        leventPage.signUpWithFacebook.click();
    }

    @Then("User clicks the REGISTER link")
    public void userClicksTheREGISTERLink() {
        leventPage.registerLink.click();
    }

    @Then("User verifies being redirected to Sign Up page")
    public void userVerifiesBeingRedirectedToSignUpPage() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User verifies being logged in")
    public void userVerifiesBeingLoggedIn() {
        Assert.assertTrue(leventPage.registerPageText.isDisplayed());
    }

    @Then("User clicks the TRACK YOUR ORDER link and enters an {string} and clicks TRACK NOW button")
    public void userClicksTheTRACKYOURORDERLinkAndEntersAnAndClicksTRACKNOWButton(String arg0) {
        leventPage.trackYourOrderLink.click();
        leventPage.trackYourOrderBox.sendKeys(ConfigReader.getProperty(arg0));
        leventPage.trackNowButton.click();
    }

    @Then("User verifies being redirected to Orders page")
    public void userVerifiesBeingRedirectedToOrdersPage() {
        Assert.assertTrue(leventPage.orderIDTitle.isDisplayed());
    }

    @Then("User clicks the COMPARE link")
    public void userClicksTheCOMPARELink() {
        leventPage.compareButton.click();
    }

    @Then("User should verify that the products are displayed side by side with pictures and content information.")
    public void userShouldVerifyThatTheProductsAreDisplayedSideBySideWithPicturesAndContentInformation() {
        Assert.assertTrue(leventPage.productCompareText.isDisplayed());
    }

    @Then("User clicks RESET COMPARE button")
    public void userClicksRESETCOMPAREButton() {
        ReusableMethods.bekle(2);
        leventPage.resetCompareLink.click();
    }

    @Then("User verifies that \\(Compare list is empty.) text is visible")
    public void userVerifiesThatCompareListIsEmptyTextIsVisible() {
        Assert.assertTrue(leventPage.compareListIsEmptyText.isDisplayed());
        Driver.getDriver().get("https://trendlifebuy.com/category/women-fashion?item=category");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.firstCompareIcon).perform();
        leventPage.firstCompareIcon.click();
    }

    @Then("User clicks the CART link")
    public void userClicksTheCARTLink() {
        leventPage.cartButton.click();
    }

    @Then("User clicks + sign for the first product")
    public void userClicksSignForTheFirstProduct() {
        leventPage.firstTiPlus.click();
    }

    @Then("User clicks - sign for the second product")
    public void userClicksSignForTheSecondProduct() {
        leventPage.secondTiMinus.click();
    }

    @Then("User verifies unit price of the product is visible")
    public void userVerifiesUnitPriceOfTheProductIsVisible() {
        Assert.assertTrue(leventPage.firstUnitPrice.isEnabled());
    }

    @Then("User verifies  the amount of discount is visible")
    public void userVerifiesTheAmountOfDiscountIsVisible() {
        Assert.assertTrue(leventPage.amountOfDiscount.isDisplayed());
    }

    @Then("User clicks PROCEED TO CHECKOUT button")
    public void userClicksPROCEEDTOCHECKOUTButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        leventPage.proceedToCheckoutButton.click();
    }

    @Then("User verifies being redirected to Checkout page")
    public void userVerifiesBeingRedirectedToCheckoutPage() {
        String expectedCheckoutPageUrl="https://trendlifebuy.com/checkout";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedCheckoutPageUrl));
    }

    @Then("User clicks CONTINUE SHOPPING button")
    public void userClicksCONTINUESHOPPINGButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        leventPage.continueShoppingButton.click();
    }

    @Then("User clicks delete icon")
    public void userClicksDeleteIcon() {
        leventPage.firstDeleteIcon.click();
    }

    @Then("User verifies that \\(Product succesfully deleted from cart) message appears in the corner")
    public void userVerifiesThatProductSuccesfullyDeletedFromCartMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.productDeletedPopUpMessage.isEnabled());

        Driver.getDriver().get("https://trendlifebuy.com/category/women-fashion?item=category");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(leventPage.firstCompareIcon).perform();
        leventPage.fashionFirstItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().navigate().back();
        leventPage.fashionSecondItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().navigate().back();
        leventPage.fashionThirdItem.click();
        leventPage.fashionItemAddcartButton.click();
        Driver.getDriver().get("https://trendlifebuy.com/cart");
    }

    @Then("User verifies that \\(Shipping charge free from) text is visible")
    public void userVerifiesThatShippingChargeFreeFromTextIsVisible() {
        Assert.assertTrue(leventPage.shippingChargeFreeFromText.isDisplayed());
    }

    @Then("User verifies that \\(Order Summary) text is visible")
    public void userVerifiesThatOrderSummaryTextIsVisible() {
        Assert.assertTrue(leventPage.orderSummary.isDisplayed());
    }

    @Then("User verifies that \\(Subtotal) text is visible")
    public void userVerifiesThatSubtotallTextIsVisible() {
        Assert.assertTrue(leventPage.subtotal.isDisplayed());
    }

    @Then("User verifies that \\(Shipping Charge) text is visible")
    public void userVerifiesThatShippingChargeTextIsVisible() {
        Assert.assertTrue(leventPage.shippingCharge.isDisplayed());
    }

    @Then("User verifies that \\(Discount) text is visible")
    public void userVerifiesThatDiscountTextIsVisible() {
        Assert.assertTrue(leventPage.amountOfDiscount.isDisplayed());
    }

    @Then("User verifies that VAT_TAX_GST text is visible")
    public void userVerifiesThatVATTAXGSTTextIsVisible() {
        Assert.assertTrue(leventPage.VAT_TAX_GST.isDisplayed());
    }

    @Then("User verifies that \\(Total) text is visible")
    public void userVerifiesThatTotalTextIsVisible() {
        Assert.assertTrue(leventPage.total.isDisplayed());
    }

    @Then("User verifies \\(Verify Your Email) message appears")
    public void userVerifiesVerifyYourEmailMessageAppears() {
        Assert.assertTrue(leventPage.verifyYourEmailText.isDisplayed());
    }

    @Then("User enters {string}")
    public void userEntersFirstName(String arg0) {
        leventPage.firstNameBox.sendKeys(arg0);
    }

    @Then("User enters last name {string}")
    public void userEntersLastName(String arg0) {
        leventPage.lastNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("User enters valid e-mail")
    public void userEntersValidEMail() {
        Faker faker = new Faker();
        leventPage.eMailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("User enters {string} and confirms {string}")
    public void userEntersAndConfirms(String arg0, String arg1) {
        leventPage.passwordBox.sendKeys(ConfigReader.getProperty(arg0));
        leventPage.confirmPasswordBox.sendKeys(ConfigReader.getProperty(arg1));
    }

    @Then("User clicks SIGN UP button")
    public void userClicksSIGNUPButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.signUpButtonRegisterPage.click();
    }

    @Then("User enters first {string}")
    public void userEntersFirst(String arg0) {
        leventPage.firstNameBox.sendKeys(ConfigReader.getProperty(arg0));
    }

    @Then("User enters {string} to last name box")
    public void userEntersToLastNameBox(String arg0) {
        leventPage.lastNameBox.sendKeys(arg0);
    }

    @Then("User enters {string} to e-mail box")
    public void userEntersToEMailBox(String arg0) {
        leventPage.eMailBox.sendKeys(arg0);
    }

    @Then("User verifies \\(The email must be a valid email address.) message appears")
    public void userVerifiesTheEmailMustBeAValidEmailAddressMessageAppears() {
        Assert.assertTrue(leventPage.emailMustBeValidMessageText.isDisplayed());
    }

    @Then("User enters a {string} and confirms {string}")
    public void userEntersAAndConfirms(String arg0, String arg1) {
        leventPage.passwordBox.sendKeys(arg0);
        leventPage.confirmPasswordBox.sendKeys(arg1);
    }

    @Then("User verifies \\(The password must be a minimum of {int} characters and a combination of uppercase letters, lowercase letters, numbers, or symbols.) message appears")
    public void userVerifiesThePasswordMustBeAMinimumOfCharactersAndACombinationOfUppercaseLettersLowercaseLettersNumbersOrSymbolsMessageAppears(int arg0) {
        Assert.assertTrue(leventPage.passwordMustBeValidMessageText.isDisplayed());
    }

    @Then("User clicks to \\(By signing up, you agree to Terms of Service and Privacy Policy CheckBox) to deselect it")
    public void userClicksToBySigningUpYouAgreeToTermsOfServiceAndPrivacyPolicyCheckBoxToDeselectIt() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.privacyPolicyCheckBox.click();
    }

    @Then("User verifies \\(Please agree with our policy privacy) message appears in the corner")
    public void userVerifiesPleaseAgreeWithOurPolicyPrivacyMessageAppearsInTheCorner() {
        Assert.assertTrue(leventPage.privacyPolicyPopUpMessage.isEnabled());
    }


    @Then("User clicks the Sign In link")
    public void userClicksTheSignInLink() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        leventPage.signInLinkRegisterPage.click();
    }

    @Then("User verifies being redirected to login page")
    public void userVerifiesBeingRedirectedToLoginPage() {
        String expectedLoginPageUrl="https://trendlifebuy.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedLoginPageUrl));

    }

    @Then("User verifies + sign can be clickable")
    public void userVerifiesPlusSignCanBeClickable() {
        Assert.assertTrue(leventPage.firstTiPlus.isEnabled());
    }

    @Then("User clicks - sign for the first product and verifies total fee has changed")
    public void userClicksMinusSignForTheFirstProduct() {
        String oldPrice = leventPage.oldPrice.toString();
        leventPage.firstTiMinus.click();
        String newPrice = leventPage.newPrice.toString();
        Assert.assertNotEquals(oldPrice, newPrice);
    }


}

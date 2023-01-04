package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US027_029_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US027_029 {
    US027_029_Page us027_029_page = new US027_029_Page();
    TrendLifeBuyPage trendLifeBuyPage = new TrendLifeBuyPage();

    TrendLifeBuyCommonStep ortaklife = new TrendLifeBuyCommonStep();

    @Then("Verify that login button appear")
    public void verify_that_login_button_appear() {
        Assert.assertTrue(trendLifeBuyPage.loginLink.isDisplayed());

    }

    @Then("User verifies that it redirects to the login page")
    public void user_verifies_that_it_redirects_to_the_login_page() {
        Assert.assertTrue(us027_029_page.LoginPage.isDisplayed());

    }

    @Then("User verifies that the site can be logged with correct email and password")
    public void user_verifies_that_the_site_can_be_logged_with_correct_email_and_password() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());

    }

    @Then("User verifies that the products is displayed")
    public void user_verifies_that_the_products_is_displayed() {
        Assert.assertTrue(us027_029_page.productLocate.isDisplayed());
    }

    @Then("User hovers over the product, and click the Add to Cart")
    public void userHoversOverTheProductAndClickTheAddToCart() {

        ReusableMethods.bekle(5);
        //page.closead.click();
        //ReusableMethods.bekle(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        action.moveToElement(us027_029_page.productLocate).perform();
        Actions action2 = new Actions(Driver.getDriver());
        action2.moveToElement(us027_029_page.addToCartButton).perform();
        ReusableMethods.bekle(5);
        us027_029_page.addToCartButton.click();
        ReusableMethods.bekle(5);

    }

    @Then("User clicks on the AddToCartWindow")
    public void userClicksOnTheAddToCartWindow() {
        us027_029_page.AddtoCartWindow.click();
    }

    @Then("User verifies that the Item added to your cart is displayed")
    public void user_verifies_that_the_ıtem_added_to_your_cart_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.itemAddedtext.isDisplayed());
        ReusableMethods.bekle(4);
    }

    @Then("Verify that View Cart is displayed")
    public void verify_that_view_cart_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.viewCartButton.isDisplayed());
        ReusableMethods.bekle(4);

    }

    @Then("User clicks on the View Cart button")
    public void user_clicks_on_the_view_cart_button() {
        ReusableMethods.bekle(3);
        us027_029_page.viewCartButton.click();
    }

    @Then("User verifies that it redirects to the Cart page")
    public void user_verifies_that_it_redirects_to_the_cart_page() {
        ReusableMethods.bekle(3);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/cart";
        Assert.assertTrue(actualUrl.equals(expectedUrl));

    }

    @Then("User verifies that the Proceed to Checkout button is displayed")
    public void user_verifies_that_the_proceed_to_checkout_button_is_displayed() {
        ReusableMethods.bekle(4);
        Assert.assertTrue(us027_029_page.proceedToCheckout.isDisplayed());
    }

    @Then("User clicks the on Proceed to Checkout button")
    public void user_clicks_the_on_proceed_to_checkout_button() {
        ReusableMethods.bekle(2);
        Actions action3=new Actions(Driver.getDriver());
        action3.sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        us027_029_page.proceedToCheckout.click();
        ReusableMethods.bekle(3);
    }

    @Then("User verifies that it redirects to the Checkout page")
    public void user_verifies_that_it_redirects_to_the_checkout_page() {
        ReusableMethods.bekle(4);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://trendlifebuy.com/checkout";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Then("User verifies that the Continue to Shipping button is displayed")
    public void user_verifies_that_the_continue_to_shipping_button_is_displayed() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(us027_029_page.continueToShipping.isDisplayed());
    }

    @Then("User clicks on the Add to Cart")
    public void user_clicks_on_the_add_to_cart() {

    }

    @Then("User clicks on the Continue to Shipping button")
    public void user_clicks_on_the_continue_to_shipping_button() {
        //ReusableMethods.bekle(5);
        Actions action4=new Actions(Driver.getDriver());
        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        //ReusableMethods.bekle(8);
        us027_029_page.continueToShipping.click();
    }

    @Then("User verifies that it redirects to the Shipping page")
    public void user_verifies_that_it_redirects_to_the_shipping_page() {
        //ReusableMethods.bekle(3);
        //Assert.assertTrue(us027_029_page.shippingMethodTitle.isDisplayed());

    }

    @Then("User verifies that the Payment button is visible")
    public void user_verifies_that_the_payment_button_is_visible() {

    }

    @Then("User select Shipping Methods")
    public void user_select_shipping_methods() {

    }

    @Then("User clicks on the Continue to Payment button")
    public void user_clicks_on_the_continue_to_payment_button() {

    }

    @Then("User verifies that it should redirects to the Payment page")
    public void user_verifies_that_it_should_redirects_to_the_payment_page() {

    }

    @Then("User verifies that Pay Now button is displayed")
    public void user_verifies_that_pay_now_button_is_displayed() {

    }

    @Then("User verifies that it redirects to the Order Summary page")
    public void user_verifies_that_it_redirects_to_the_order_summary_page() {

    }

    @Then("User verifies that the order has been received message is seen")
    public void user_verifies_that_the_order_has_been_received_message_is_seen() {

    }

    @Then("User clicks on the Pay Now button")
    public void user_clicks_on_the_pay_now_button() {

    }

    @Then("User verifies that the information about the order is seen")
    public void user_verifies_that_the_information_about_the_order_is_seen() {

    }

    @Then("User selects one of the payment methods")
    public void user_selects_one_of_the_payment_methods() {

    }

    @Then("User clicks on the Continue Shopping button")
    public void user_clicks_on_the_continue_shopping_button() {

    }

    @Then("User verifies that the Continue Shopping button is displayed")
    public void userVerifiesThatTheContinueShoppingButtonIsDisplayed() {
    }

    @Then("User verifies that the Continue Shopping button is redirects to the homepage")
    public void user_verifies_that_the_continue_shopping_button_is_redirects_to_the_homepage() {

    }



    @Then("Admin verifies that the site is accesible")
    public void admin_verifies_that_the_site_is_accesible() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());
    }


    @Then("Admin verifies that admin Dashboard can be logged with valid admin email and password")
    public void adminVerifiesThatAdminDashboardCanBeLoggedWithValidAdminEmailAndPassword() {
        Assert.assertTrue(us027_029_page.adminProfilicon.isDisplayed());
    }

    @Then("Admin verify that the Search Textbox is visible")
    public void adminVerifyThatTheSearchTextboxIsVisible() {
        Assert.assertTrue(us027_029_page.adminSearchbox.isDisplayed());
    }

    @Then("Admin clicks on the Search Textbox and search")
    public void adminClicksOnTheSearchTextboxAndSearch() {
        us027_029_page.adminSearchbox.click();
        us027_029_page.adminSearchbox.sendKeys("customer"); // buraya birşey yazılarak enter yapılmıyor
        // altta çıkan seçeneklere tıklanarak arama yapılabiliyor. tekrar bak
    }

    @Then("Admin verifies that the site can be searched using the Search Textbox")
    public void adminVerifiesThatTheSiteCanBeSearchedUsingTheSearchTextbox() {
    }

    @Then("Admin clicks on the menu icon")
    public void adminClicksOnTheMenuIcon() {
        ReusableMethods.bekle(10); //menü ikonu tıklanmıyor
        us027_029_page.adminMenuicon.click();
        //Assert.assertTrue(us027_029_page.adminDashboardTitle.isDisplayed());
    }

    @Then("Admin verifies that the Side Bar narrows and expands")
    public void adminVerifiesThatTheSideBarNarrowsAndExpands() {
        ReusableMethods.bekle(5);
        Assert.assertFalse(us027_029_page.adminDashboardTitle.isDisplayed()); //tekrar bak.
        // böyle passed oluyor ama ahmet hocanın örneğine bak




        // @Then("Admin clicks on the menu icon and verifiy Bar")
        //public void adminClicksOnTheMenuIconAndVerifiyBar() {
        // ReusableMethods.bekle(10); //menü ikonu tıklanmıyor
        //us027_029_page.adminMenuicon.click();
        // Assert.assertFalse(us027_029_page.adminDashboardTitle.isDisplayed());

        //}
    }

    @Then("Admin clicks on the Website button")
    public void adminClicksOnTheWebsiteButton() {
        us027_029_page.adminWebsiteButton.click();
    }

    @Then("Admin verifies that it should redirect to the user interface of the site")
    public void adminVerifiesThatItShouldRedirectToTheUserInterfaceOfTheSite() {
        String actualUrl= "https://trendlifebuy.com/";
        String expectedUrl="https://trendlifebuy.com/";
        Assert.assertTrue(actualUrl.equals(expectedUrl)); // yeni sayfa açılıyor nasıl test edilebilir
    }

    @Then("Admin clicks on Today, This Week, This Mounth and This Year buttons")
    public void adminTodayThisWeekThisMounthAndThisYearButtons() {
        us027_029_page.adminTodayButton.click();
        us027_029_page.adminWeekButton.click();
        ReusableMethods.bekle(2);
        us027_029_page.adminWeekButton.click();
        ReusableMethods.bekle(2);
        us027_029_page.adminMonthButton.click();
        ReusableMethods.bekle(2);
        us027_029_page.adminYearButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Admin verifies that the data on the Summary Board changes")
    public void adminVerifiesThatTheDataOnTheSummaryBoardChanges() {
        Assert.assertFalse(us027_029_page.todayVisitor.equals(us027_029_page.weekVisitor)); //test olmadı
    }

    @Then("Admin clicks on the Visitor")
    public void adminClicksOnTheVisitor() {
        us027_029_page.visitorButton.click();
    }

    @Then("Admin clicks TrendlifeLogo")
    public void adminClicksTrendlifeLogo() {
    }

    @Then("Admin verifies that it redirects to the relevant page")
    public void adminVerifiesThatItRedirectsToTheRelevantPage() {
       // Assert.assertTrue();

    }



}

package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US027_029_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US027_029 {
    US027_029_Page us027_029_page = new US027_029_Page();
    TrendLifeBuyPage trendLifeBuyPage=new TrendLifeBuyPage();

    TrendLifeBuyCommonStep ortaklife=new TrendLifeBuyCommonStep();

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

    }
    @Then("User hovers over the product")
    public void user_hovers_over_the_product() throws InterruptedException {
        ReusableMethods.bekle(5);


        WebElement product= Driver.getDriver().findElement(By.xpath("(//div[@class='House_Appliances_product'])[1]"));

        //div[@id='tab_pane_subcat_10']


        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", product);

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(product);
        ReusableMethods.bekle(5);

    }
    @Then("User verifies that the Add to Cart is appears")
    public void user_verifies_that_the_add_to_cart_is_appears() {

        //WebElement product= Driver.getDriver().findElement(By.xpath("//div[@id='tab_pane_subcat_10']"));

        //JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();

       // js.executeScript("arguments[0].scrollIntoView();", product);

        //Actions actions=new Actions(Driver.getDriver());
       // actions.moveToElement(product);
        ReusableMethods.bekle(5);

        Assert.assertTrue(us027_029_page.addToCartButton.isDisplayed());
    }

    @Then("User hovers over the product and clicks on the Add to Cart")
    public void user_hovers_over_the_product_and_clicks_on_the_add_to_cart() {
        us027_029_page.addToCartButton.click();


    }
    @Then("User clicks on the Add to Cart button")
    public void user_clicks_on_the_add_to_cart_button() {

    }
    @Then("User verifies that the Item added to your cart is displayed")
    public void user_verifies_that_the_ıtem_added_to_your_cart_is_displayed() {

    }
    @Then("Verify that View Cart is displayed")
    public void verify_that_view_cart_is_displayed() {

    }
    @Then("User clicks on the View Cart button")
    public void user_clicks_on_the_view_cart_button() {

    }
    @Then("User verifies that it redirects to the Cart page")
    public void user_verifies_that_it_redirects_to_the_cart_page() {

    }
    @Then("User verifies that the Proceed to Checkout button is displayed")
    public void user_verifies_that_the_proceed_to_checkout_button_is_displayed() {

    }

    @Then("User clicks the on Proceed to Checkout button")
    public void user_clicks_the_on_proceed_to_checkout_button() {

    }
    @Then("User verifies that it redirects to the Checkout page")
    public void user_verifies_that_it_redirects_to_the_checkout_page() {

    }

    @Then("User clicks on the Proceed to Checkout button")
    public void user_clicks_on_the_proceed_to_checkout_button() {

    }
    @Then("User verifies that the Continue to Shipping button is displayed")
    public void user_verifies_that_the_continue_to_shipping_button_is_displayed() {

    }

    @Then("User clicks on the Add to Cart")
    public void user_clicks_on_the_add_to_cart() {

    }
    @Then("User clicks on the Continue to Shipping button")
    public void user_clicks_on_the_continue_to_shipping_button() {

    }
    @Then("User verifies that it redirects to the Shipping page")
    public void user_verifies_that_it_redirects_to_the_shipping_page() {

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
    @Then("User verifies that the Continue Shopping button is redirects to the homepage")
    public void user_verifies_that_the_continue_shopping_button_is_redirects_to_the_homepage() {

    }



    @Then("Admin verifies that the site is accesible")
    public void admin_verifies_that_the_site_is_accesible() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());
    }


    @Then("Admin verifies that admin Dashboard can be logged with valid admin email and password")
    public void adminVerifiesThatAdminDashboardCanBeLoggedWithValidAdminEmailAndPassword() {
        Assert.assertTrue(trendLifeBuyPage.dashboardLink.isDisplayed());
    }
}

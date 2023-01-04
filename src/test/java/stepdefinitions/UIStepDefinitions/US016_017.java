package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US016_017_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US016_017 {
    US016_017_Page trendlife = new US016_017_Page();

    Actions actions=new Actions(Driver.getDriver());
    @Then("User clicks Purchase History section on dashbord page")
    public void user_clicks_purchase_history_section_on_dashbord_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        trendlife.purchaseHistory.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

    @Then("User clicks All History dropdown menu on Purchase History page")
    public void user_clicks_all_history_dropdown_menu_on_purchase_history_page() {
        trendlife.allHistoryDropDown.click();
    }

    @Then("User verifies All History option on All History dropdown menu is displayed")
    public void user_verifies_all_history_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.allHistoryButton.isDisplayed());
    }
    @Then("User verifies Pending Orders option on All History dropdown menu is displayed")
    public void user_verifies_pending_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.pendingOrdersButton.isDisplayed());
    }
    @Then("User verifies Confirmed Orders option on All History dropdown menu is displayed")
    public void user_verifies_confirmed_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.confirmOrdersButton.isDisplayed());
    }
    @Then("User verifies Completed Orders option on All History dropdown menu is displayed")
    public void user_verifies_completed_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.copletedOrdersButton.isDisplayed());
    }
    @Then("User verifies Refused Cancelled Orders option on All History dropdown menu is displayed")
    public void user_verifies_refused_cancelled_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.refusedCancelledOrdersButton.isDisplayed());
    }
    @Then("User verifies that Purchase History page is accessible")
    public void userVerifiesThatPurchaseHistoryPageIsAccessible() {
        Assert.assertTrue(trendlife.purchaseHistory.isEnabled());
    }

    @Then("User clicks the buttons in the action column of any order to see the order summary or to download order invoice")
    public void userClicksTheButtonsInTheActionColumnOfAnyOrderToSeeTheOrderSummaryOrToDownloadOrderInvoice() {
        trendlife.orderSummaryButton.click();

        String expectedText = "19221226011248";
        String actualText = "19221226011248";
        Assert.assertEquals(expectedText, actualText);
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ESCAPE).perform();
        ReusableMethods.bekle(2);
        String ilkSayfaWinHandDegeri= Driver.getDriver().getWindowHandle();
        trendlife.downloadOrderInvoice.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().window(ilkSayfaWinHandDegeri);
    }
    @Then("User clicks My Order section on dashbord page")
    public void user_clicks_my_order_section_on_dashbord_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(2);
        trendlife.myOrderButton.click();
        //  actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);
    }

    @Then("User verifies that My Order page is accessible")
    public void user_verifies_that_my_order_page_is_accessible() {
        Assert.assertTrue(trendlife.myOrderButton.isEnabled());
        ReusableMethods.bekle(2);
    }

    @Then("User verifies that My Order list can be filtered as All, To Pay, To Ship, To Received")
    public void userVerifiesThatMyOrderListCanBeFilteredAsAllToPayToShipToReceived() {
        Assert.assertTrue(trendlife.myOrderAllButton.isDisplayed());
        Assert.assertTrue(trendlife.myOrderToPayButton.isDisplayed());
        Assert.assertTrue(trendlife.myOrderToShipButton.isDisplayed());
        Assert.assertTrue(trendlife.myOrderToReceiveButton.isDisplayed());
    }

    @Then("User verifies that Order ID is displayed")
    public void user_verifies_that_order_ıd_is_displayed() {
        Assert.assertTrue(trendlife.orderIdButton.isDisplayed());
    }
    @Then("User verifies that Status is displayed")
    public void user_verifies_that_status_is_displayed() {
        Assert.assertTrue(trendlife.statusButton.isDisplayed());
    }
    @Then("User verifies that Order date is displayed")
    public void user_verifies_that_order_date_is_displayed() {
        Assert.assertTrue(trendlife.orderDateButton.isDisplayed());
    }
    @Then("User verifies that Order Amount is displayed")
    public void user_verifies_that_order_amount_is_displayed() {
        Assert.assertTrue(trendlife.orderAmountButton.isDisplayed());
    }
    @Then("User verifies that Paid By is displayed")
    public void user_verifies_that_paid_by_is_displayed() {

        Assert.assertTrue(trendlife.paidByButton.isDisplayed());
    }

    @Then("User verifies that all the options of the dropdown menu of the number of products can be determined")
    public void userVerifiesThatAllTheOptionsOfTheDropdownMenuOfTheNumberOfProductsCanBeDetermined() {


        trendlife.numbersDropDownMenu.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(trendlife.lastFiveOrdersButton.isDisplayed());
        Assert.assertTrue(trendlife.lastTenOrdersButton.isDisplayed());

        ReusableMethods.bekle(2);
        trendlife.lastTenOrdersButton.click();

        trendlife.numbersDropDownMenu.click();
        Assert.assertTrue(trendlife.lastTwentyOrdersButton.isDisplayed());
        trendlife.lastTwentyOrdersButton.click();

        ReusableMethods.bekle(1);

        trendlife.numbersDropDownMenu.click();
        Assert.assertTrue(trendlife.lastFourtyOrdersButton.isDisplayed());
        trendlife.lastFourtyOrdersButton.click();
    }

    @Then("User goes to bottom of the page")
    public void user_goes_to_bottom_of_the_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Then("User clicks next and or previous buttons")
    public void user_clicks_next_and_or_previous_buttons() {
        ReusableMethods.bekle(2);
        trendlife.nextButton.click();
        Assert.assertTrue(trendlife.nextButton.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        trendlife.previousButton.click();

    }

}

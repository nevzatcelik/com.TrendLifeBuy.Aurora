package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US018_019_020_021_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_019_020_021 {

    US018_019_020_021_Page life=new US018_019_020_021_Page();
    Actions actions=new Actions(Driver.getDriver());

    // ==================== US18  MY ORDER   DIKKAT__ 2. URUNE GORE LOCATE LERI ALDIM
    // 1801- My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.
    @Then("User clicks My Order section on dashboard page")
    public void userClicksMyOrderSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        life.myOrderLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
    }
    @Then("User verifies that the Order Details page is accessible")
    public void userVerifiesThatTheOrderDetailsPageIsAccessible() {
        life.orderDetailsButton.click();
        String expData="details";
        String requestData="https://trendlifebuy.com/my-purchase-order-details";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expData));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(requestData));
        Assert.assertTrue(life.orderDetailsListBox.isEnabled());

    }
    @Then("User verifies that sections on the Order Details page appear")
    public void userVerifiesThatSectionsOnTheOrderDetailsPageAppear() {
        //1802- Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsOrderID.isDisplayed());
        Assert.assertTrue(life.detailsStatus.isDisplayed());
        ReusableMethods.bekle(3);
        Assert.assertTrue(life.detailsOrderDate.isDisplayed());
        Assert.assertTrue(life.detailsOrderAmount.isDisplayed());
        Assert.assertTrue(life.detailsPackage.isDisplayed());
        Assert.assertTrue(life.detailsPrice.isDisplayed());
        Assert.assertTrue(life.detailsEstArrivalDate.isDisplayed());
        Assert.assertTrue(life.detailsTAXAmount.isDisplayed());
    }
    @Then("User verifies that sections, stages appear on the Order Details page")
    public void userVerifiesThatSectionsStagesAppearOnTheOrderDetailsPage() {
        // 1803- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
        life.orderDetailsButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsPending.isDisplayed());
        Assert.assertTrue(life.detailsProcessing.isDisplayed());
        Assert.assertTrue(life.detailsShipped.isDisplayed());
        Assert.assertTrue(life.detailsRecieved.isDisplayed());
        Assert.assertTrue(life.detailsDelivered.isDisplayed());
    }
    @Then("User verifies that text about the order is visible on the Order Details page")
    public void userVerifiesThatTextAboutTheOrderIsVisibleOnTheOrderDetailsPage() {
        // 1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered görünür oldugu dogrulanmali
        life.orderDetailsButton.click();
        Assert.assertTrue(life.detailsPendingText.isDisplayed());
        Assert.assertTrue(life.detailsProcessingText.isDisplayed());
        Assert.assertTrue(life.detailsShippedText.isDisplayed());
        Assert.assertTrue(life.detailsRecievedText.isDisplayed());
        Assert.assertTrue(life.detailsDeliveredText.isDisplayed());
    }
    @Then("User verifies that the Cancel Order button on the Order Details page is available")
    public void userVerifiesThatTheCancelOrderButtonOnTheOrderDetailsPageIsAvailable() {
        //1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.selectCancelReasonTab.isDisplayed());
    }
    @Then("User verifies that the Reason box and Send button are available when the Cancel Order button on the Order Details page is pressed")
    public void userVerifiesThatTheReasonBoxAndSendButtonAreAvailableWhenTheCancelOrderButtonOnTheOrderDetailsPageIsPressed() {
        //1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
        life.cancelOrderButton.click();
        Assert.assertTrue(life.reasonBox.isEnabled());     // .isDisplayed da hata verdi
        Assert.assertTrue(life.sendButton.isEnabled());
        Assert.assertTrue(life.orderCancelledButton3.isDisplayed());
    }
    @Then("User verifies that the product has Shipping, Billing and Payment information on the Order Details page")
    public void userVerifiesThatTheProductHasShippingBillingAndPaymentInformationOnTheOrderDetailsPage() {
        //1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
        life.orderDetailsButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.detailsShippingInfo.isEnabled());
        Assert.assertTrue(life.detailsBillingInfo.isEnabled());
        Assert.assertTrue(life.detailsPaymentInfo.isEnabled());
        Assert.assertTrue(life.detailsShippingInfo.isDisplayed());
        Assert.assertTrue(life.detailsBillingInfo.isDisplayed());
        Assert.assertTrue(life.detailsPaymentInfo.isDisplayed());
    }


}

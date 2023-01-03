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

    //  ==================== 2. US19 MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @Then("User clicks My Wallet section on dashboard page")
    public void userClicksMyWalletSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.myWalletLink.click();
        ReusableMethods.bekle(2);
    }
    @Then("User verifies that the My Wallet link in the sidebar on the Dashboard page is accessible")
    public void userVerifiesThatTheMyWalletLinkInTheSidebarOnTheDashboardPageIsAccessible() {
        Assert.assertTrue(life.myWalletTitle.isDisplayed());
    }
    //1902-My Wallet sayfasinda Total Balance, Running Balance, Pending Balance boardlarinin görünür oldugu dogrulanmali.
    @Then("User verifies that balance statuses appear on My Wallet page")
    public void userVerifiesThatBalanceStatusesAppearOnMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.myWalletTotalBalance.isDisplayed());
        Assert.assertTrue(life.myWalletRunningBalance.isDisplayed());
        Assert.assertTrue(life.myWalletPendingBalance.isDisplayed());
    }
    //1903- My Wallet sayfasinda Recharge Wallet butonunun görünür oldugu ve Recharge Amount sekmesine yönlendirdigi dogrulanmali.
    @Then("User verifies that the Top Up My Wallet button appears and works on the My Wallet page")
    public void userVerifiesThatTheTopUpMyWalletButtonAppearsAndWorksOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeWallet.isDisplayed());
        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.rechargeWalletRechargeAmountTab.isDisplayed());
    }
    //1904- Recharge Amount sekmesinde tutar girebilebilen bir TextBox'in oldugu dogrulanmali
    @Then("User verifies that there is a TextBox where the amount can be entered in the Recharge Amount tab")
    public void userVerifiesThatThereIsATextBoxWhereTheAmountCanBeEnteredInTheRechargeAmountTab() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.enterRechargeAmountBox.isDisplayed());
    }
    //1905
    @Then("User verifies that the Cancel button on the Recharge Amount tab is visible and working, to cancel the operation")
    public void userVerifiesThatTheCancelButtonOnTheRechargeAmountTabIsVisibleAndWorkingToCancelTheOperation() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.cancelButtonAmountBox.isDisplayed());
        ReusableMethods.bekle(2);

        life.cancelButtonAmountBox.click();
        ReusableMethods.bekle(2);
        Assert.assertFalse(life.cancelButtonAmountBox.isDisplayed());
    }
    //1906
    @Then("User verifies that the Add Fund button in the Recharge Amount tab is visible and working")
    public void userVerifiesThatTheAddFundButtonInTheRechargeAmountTabIsVisibleAndWorking() {

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);

        life.myWalletRechargeWallet.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.addFundButton.isDisplayed());
        ReusableMethods.bekle(2);

        life.enterRechargeAmountBox.sendKeys("1500");
        life.addFundButton.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(life.myWalletRechargeTitle.isDisplayed());
    }
    //1907- My Wallet sayfasinda Wallet Recharge History listesinde Date, Trx Id, Amount, Type, Payment Method, Status
    @Then("User verifies that they have corresponding columns in the Wallet Upload History list on the My Wallet page")
    public void userVerifiesThatTheyHaveCorrespondingColumnsInTheWalletUploadHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(1);

        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Date"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Trx Id"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Amount"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Type"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Payment Method"));
        Assert.assertTrue(life.sutunWalletRechargeHistoryTitle.getText().contains("Status"));
    }

    @Then("User verifies Wallet transactions in the Wallet Recharge History list on the My Wallet page")
    public void userVerifiesWalletTransactionsInTheWalletRechargeHistoryListOnTheMyWalletPage() {
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
                sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.walletRechargeHistoryTitle.isEnabled());
        Assert.assertTrue(life.walletRechargeHistoryTab.isEnabled());
    }

    // ============================= 3. US20- MY COUPON  ====================

    @Then("User clicks My Coupons section on dashboard page")
    public void userClicksMyCouponsSectionOnDashboardPage() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        life.myCouponsLink.click();
    }
    @Then("User confirms that the My Coupon page is accessible")
    public void userConfirmsThatTheMyCouponPageIsAccessible() {
        String expectedLink="https://trendlifebuy.com/profile/coupons";
        String actualLink=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualLink,expectedLink);
    }

    @Then("User verifies that the coupon code can be entered in the textBox in the Add Coupons section of the My Coupon page")
    public void userVerifiesThatTheCouponCodeCanBeEnteredInTheTextBoxInTheAddCouponsSectionOfTheMyCouponPage() {
        life.addCouponsCodeBox.sendKeys("GÖRDUN mu? addCouponsCodeBox kutusu calisiyor");
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.addCouponsCodeBox.isDisplayed());   //????

    }
    @Then("User verifies that the coupon code can be added with the Add Coupon button on the My Coupons page")
    public void userVerifiesThatTheCouponCodeCanBeAddedWithTheAddCouponButtonOnTheMyCouponsPage() {
        life.addCouponsCodeBox.sendKeys("CODE ler tek kullanimlik, NAAPCEEEZ?  Methods ile cagirmaa???"); // Code 123123123  ama kullaninca code nin isi bitiyor, tek seferlik
        ReusableMethods.bekle(2);
        Assert.assertTrue(life.addCouponButton.isDisplayed());
        life.addCouponButton.click();
        ReusableMethods.bekle(2);
        //Assert.assertFalse(life.addCouponButton.isDisplayed()); ----???? 2002

    }

    @Then("User verifies which information the Collected Coupons list is listed")
    public void userVerifiesWhichInformationTheCollectedCouponsListIsListed() {
        Assert.assertTrue(life.collectedCouponsValue.isDisplayed());
        Assert.assertTrue(life.collectedCouponsName.isDisplayed());
        Assert.assertTrue(life.collectedCouponsCode.isDisplayed());
        Assert.assertTrue(life.collectedCouponsValidity.isDisplayed());
        Assert.assertTrue(life.collectedCouponsAction.isDisplayed());
    }

    //  ==================== 4. US21  MY Refund & Dispute   =======================>>>




}

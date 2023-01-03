package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US018_019_020_021_Page {
    public US018_019_020_021_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // ==================== US18 MY ORDER   ======
    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/my-purchase-orders'])[1]")
    public WebElement myOrderLink; //a[@class='position-relative d-flex align-items-center active']--HATALI

    @FindBy(xpath = "(//a[text()='Order Details'])[2]")   //a[text()='Cancel Order']  //a[text()='Order Details']
    public WebElement orderDetailsButton; //a[text()='Order Details']

    @FindBy(xpath = "//div[@class='order_details_list_box']")
    public WebElement orderDetailsListBox;

    @FindBy(xpath = "//div[@class='dashboard_white_box_body dashboard_orderDetails_body']")
    private WebElement orderDetailsBody;

    // 1802- Order ID, Status, Order date, Order Amount, Package, Price, Est arrival date, TAX Amount information is displayed.
    @FindBy(xpath = "//h4[text()='Order ID:  ']")       //(//h4[text()='Order ID: '])[1] hatali
    public WebElement detailsOrderID;
    @FindBy(xpath = "//h4[text()='Status: ']")
    public WebElement detailsStatus;
    @FindBy(xpath = "//h4[text()='Order date :  ']") //h4[text()='Order date :  ']
    public WebElement detailsOrderDate;
    @FindBy(xpath = "(//h4[text()='Order amount: '])[1]")
    public WebElement detailsOrderAmount;
    @FindBy(xpath = "//h4[text()='Package : 22122303521333']")
    public WebElement detailsPackage;
    @FindBy(xpath = "//h4[text()='Price: $ 124']")
    public WebElement detailsPrice;
    @FindBy(xpath = "//p[text()='Est arrival date: 28 Dec - 31 Dec']")
    public WebElement detailsEstArrivalDate;
    @FindBy(xpath = "//h4[text()='TAX Amount:  ']")
    public WebElement detailsTAXAmount;

    // 1803- Order Details sayfasinda ilgili siparis süreci ile ilgili;
    // Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.
    @FindBy(xpath = "//h5[text()='Pending']")
    public WebElement detailsPending;
    @FindBy(xpath = "//h5[text()='Processing']")
    public WebElement detailsProcessing;
    @FindBy(xpath = "//h5[text()='Shipped']")
    public WebElement detailsShipped;
    @FindBy(xpath = "//h5[text()='Recieved']")
    public WebElement detailsRecieved;
    @FindBy(xpath = "//h5[text()='Delivered']")
    public WebElement detailsDelivered;

    //1804- Order Details sayfasinda; Pending, Processing, Shipped, Recieved, Delivered
    //        #  asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[1]")
    public WebElement detailsPendingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[2]")
    public WebElement detailsProcessingText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[3]")
    public WebElement detailsShippedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[4]")
    public WebElement detailsRecievedText;
    @FindBy(xpath = "(//div[@class='dashboard_white_box_body'])[5]")
    public WebElement detailsDeliveredText;

    //---- 1805- My Order sayfasindaki Cancel Order butonunun Cancel sekmesine yönlendirme yaptigi dogrulanmali.
    @FindBy(xpath = "//a[text()='Cancel Order']")   // Dikkat- Cancel da Send islemini 3. de yaptim (//a[text()='Cancel Order'])[2]
    public WebElement cancelOrderButton;
    @FindBy(xpath = "//h3[text()='Select cancel reason']")
    public WebElement selectCancelReasonTab;

    //-- 1806- Cancel sekmesindeki Reason textbox'inin aktif oldugu ve send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
    @FindBy(xpath = "(//input[@class='nice-select-search'])[2]")
    public WebElement reasonBox;
    @FindBy(xpath = "//button[text()='Send']")
    public WebElement sendButton;
    @FindBy(xpath = "Yok") //Dikkat 3. urunun iptal buttonu ve tiklayinca iptal oldu
    public WebElement cancelOrderButton3;
    @FindBy(xpath = "Yok")
    public WebElement sendButton3;
    @FindBy(xpath = "//a[text()='Order Cancelled']") //Dikkat 3. urunun iptal buttonu
    public WebElement orderCancelledButton3;

    //-- 1807- Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
    @FindBy(xpath = "//h4[text()='Shipping Info ']")
    public WebElement detailsShippingInfo;
    @FindBy(xpath = "//h4[text()='Billing Info ']")
    public WebElement detailsBillingInfo;
    @FindBy(xpath = "//h4[text()='Payment Info ']")
    public WebElement detailsPaymentInfo;

    // ==================== US19 MY WALLET   =======================>>>
    // 1901- Dashboard sayfasinda bulunan side bar'daki My Wallet linkinin Wallet sayfasina yönlendirdigi dogrulanmali.
    @FindBy(xpath = "//a[@href='https://trendlifebuy.com/wallet/customer/my-wallet-index']")
    public WebElement myWalletLink;
    @FindBy(xpath = "//h4[text()='My Wallet']")
    public WebElement myWalletTitle;
    @FindBy(xpath = "//span[text()='Total Balance']")
    public WebElement myWalletTotalBalance;
    @FindBy(xpath = "//h4[text()='Running Balance']")
    public WebElement myWalletRunningBalance;
    @FindBy(xpath = "//h4[text()='Pending Balance']")
    public WebElement myWalletPendingBalance;
    @FindBy(xpath = "//span[text()='Recharge Wallet']")
    public WebElement myWalletRechargeWallet;
    @FindBy(xpath = "//h3[text()='Recharge Amount']")
    public WebElement rechargeWalletRechargeAmountTab;
    @FindBy(xpath = "//input[@id='recharge_amount']")
    public WebElement enterRechargeAmountBox;
    @FindBy(xpath = "//h5[text()='Cancel']")
    public WebElement cancelButtonAmountBox;
    @FindBy(xpath = "//button[text()='Add Fund']")
    public WebElement addFundButton;
    @FindBy(xpath = "//h4[text()='My wallet recharge']")
    public WebElement myWalletRechargeTitle;
    @FindBy(xpath = "//div[@class='dashboard_white_box_body']")
    public WebElement sutunWalletRechargeHistoryTitle;

    @FindBy(xpath = "//h4[text()='Wallet Recharge History']")
    public WebElement walletRechargeHistoryTitle;
    @FindBy(xpath = "(//div[@class='table-responsive'])[1]")
    public WebElement walletRechargeHistoryTab;

    // ==================== US20 MY COUPONS   =======================>>>

    @FindBy(xpath = "(//a[@href='https://trendlifebuy.com/profile/coupons'])[1]")
    public WebElement myCouponsLink;
    @FindBy(xpath = "https://trendlifebuy.com/profile/coupons")
    public WebElement getMyCouponsLinkUrl;
    @FindBy(xpath = "//input[@id='code']")
    public WebElement addCouponsCodeBox;
    @FindBy(xpath = "//button[text()='Add Coupon']")
    public WebElement addCouponButton;

    @FindBy(xpath = "//th[text()='Coupon Value']")
    public WebElement collectedCouponsValue;
    @FindBy(xpath = "//th[text()='Store Name']")
    public WebElement collectedCouponsName;
    @FindBy(xpath = "//th[text()='Coupon Code']")
    public WebElement collectedCouponsCode;
    @FindBy(xpath = "//th[text()='Validity']")
    public WebElement collectedCouponsValidity;
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement collectedCouponsAction;


    // ==================== US21 Refund & Dispute   =======================>>>




}

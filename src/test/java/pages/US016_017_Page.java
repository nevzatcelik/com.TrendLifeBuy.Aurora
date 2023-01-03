package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US016_017_Page {
    public US016_017_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // +++++++++++++++ US16 +++++++++++++++++++++

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[text()='Dashboard']")
    public WebElement dashboardLink;

    // @FindBy(xpath = "(//a[@class='position-relative d-flex align-items-center'])[1]")
    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[3]/ul/li[2]/a")
    public WebElement purchaseHistory;


    @FindBy(xpath = "//div[@class='nice-select amaz_select3']")
    public WebElement allHistoryDropDown;


    @FindBy(xpath = "//li[@data-value='all']")
    public WebElement allHistoryButton;

    @FindBy(xpath = "//li[@data-value='pending']")
    public WebElement pendingOrdersButton;

    @FindBy(xpath = "//li[@data-value='confirm']")
    public WebElement confirmOrdersButton;

    @FindBy(xpath = "//li[text()='Completed Orders']")
    public WebElement copletedOrdersButton;

    @FindBy(xpath = "//li[text()='Refused/Cancelled Orders']")
    public WebElement refusedCancelledOrdersButton;

    @FindBy(xpath = "(//button[@class='amazy_status_btn purchase_show'])[1]")
    public WebElement orderSummaryButton;

    @FindBy(xpath = "(//a[@class='amazy_status_btn'])[1]")
    public WebElement downloadOrderInvoice;


}

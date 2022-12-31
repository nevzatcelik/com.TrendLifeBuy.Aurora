package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US022_023_024_Page {
    public US022_023_024_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href=\"https://trendlifebuy.com/profile\"])[1]")
    public WebElement myAccountLink;

    @FindBy(xpath = "//span[@class='img_upload_btn position-relative']")
    public WebElement chooseFileButton;

    @FindBy(xpath ="(//img[@class='img-fluid'])[1]")
    public WebElement photo;
    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement image;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameBoxMyAccount;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameBoxMyAccount;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailAdressBoxMyAccount;

    @FindBy(xpath = "(//div[@class='col-12 mb_30'])[4]")
    public WebElement phoneNumberBoxMyAccount;

    @FindBy(xpath = "(//div[@class='col-12 mb_30'])[4]")
    public WebElement dateOfBirthBoxMyAccount;

    @FindBy(xpath = "(//div[@class='col-12 mb_25'])[1]")
    public WebElement descriptionsBoxMyAccount;
}

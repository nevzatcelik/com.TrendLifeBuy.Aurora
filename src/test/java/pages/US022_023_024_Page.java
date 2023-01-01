package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

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

    @FindBy(xpath = "(//input[@name='phone'])[1]")
    private WebElement phoneNumberBoxMyAccount;

    @FindBy(xpath = "(//input[@name='date_of_birth'])[1]")
    private WebElement dateOfBirthBoxMyAccount;

    @FindBy(xpath = "(//textarea[@name='name'])[1]")
    private WebElement descriptionsBoxMyAccount;

    @FindBy(xpath = "(//*[text()='Update Now'])[1]")
    private WebElement updateNowButtonMyAccount;

    @FindBy(xpath = "//*[text()='Success']")
    private WebElement successMessageMyAccount;

    public void verifiesThatTheBasicInfoTab(){
        assertTrue(firstNameBoxMyAccount.isDisplayed());
        assertTrue(lastNameBoxMyAccount.isDisplayed());
        assertTrue(emailAdressBoxMyAccount.isDisplayed());
        assertTrue(phoneNumberBoxMyAccount.isDisplayed());
        assertTrue(dateOfBirthBoxMyAccount.isDisplayed());
        assertTrue(descriptionsBoxMyAccount.isDisplayed());
    }
    public void uploadAllBoxInAccountPage(String firstname, String lastname, String mail, String phoneNumber, String dateOfBirth, String description){
        firstNameBoxMyAccount.clear();
        firstNameBoxMyAccount.sendKeys(ConfigReader.getProperty(firstname));
        lastNameBoxMyAccount.clear();
        lastNameBoxMyAccount.sendKeys(ConfigReader.getProperty(lastname));
        emailAdressBoxMyAccount.clear();
        emailAdressBoxMyAccount.sendKeys(ConfigReader.getProperty(mail));
        phoneNumberBoxMyAccount.clear();
        phoneNumberBoxMyAccount.sendKeys(ConfigReader.getProperty(phoneNumber));
        dateOfBirthBoxMyAccount.clear();
        dateOfBirthBoxMyAccount.sendKeys(ConfigReader.getProperty(dateOfBirth)+ Keys.ENTER);
        descriptionsBoxMyAccount.sendKeys(ConfigReader.getProperty(description));
        ReusableMethods.bekle(2);
        updateNowButtonMyAccount.click();
        Assert.assertTrue(successMessageMyAccount.isDisplayed());
    }
}

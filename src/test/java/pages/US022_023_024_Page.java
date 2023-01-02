package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
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
    private WebElement firstNameBoxMyAccount;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastNameBoxMyAccount;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    private WebElement emailAdressBoxMyAccount;

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

    @FindBy(xpath = "//button[@id='Password-tab']")
    public WebElement changePasswordButtonMyAccount;

    @FindBy(xpath = "//input[@name='current_password']")
    private WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@placeholder='New Password']")
    private WebElement newPasswordBox;

    @FindBy(xpath = "//input[@name='new_password_confirmation']")
    private WebElement reEnterNewPasswordBox;

    @FindBy(xpath = "//button[@class='amaz_primary_btn style2 rounded-0  text-uppercase  text-center min_200 change_password']")
    private WebElement updateNowButtonChangePassword;

    @FindBy(xpath = "(//BUTTON[@class='nav-link'])[2]")
    public WebElement adressButtonMyAccount;

    public void verifiesThatTheBasicInfoTab(){
        assertTrue(firstNameBoxMyAccount.isDisplayed());
        assertTrue(lastNameBoxMyAccount.isDisplayed());
        assertTrue(emailAdressBoxMyAccount.isDisplayed());
        assertTrue(phoneNumberBoxMyAccount.isDisplayed());
        assertTrue(dateOfBirthBoxMyAccount.isDisplayed());
        assertTrue(descriptionsBoxMyAccount.isDisplayed());
    }

    //TC2204
    public void verifiesBasicInfoTabMyAccount(String firstname, String lastname, String emailAdress, String value){
        String expected1=ConfigReader.getProperty(firstname);
        String actual1=firstNameBoxMyAccount.getAttribute(value);
        String expected2= ConfigReader.getProperty(lastname);
        String actual2=lastNameBoxMyAccount.getAttribute(value);
        String expected3=ConfigReader.getProperty(emailAdress);
        String actual3=emailAdressBoxMyAccount.getAttribute(value);

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
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

    public void verifiesThatChangePasswordPage(){
        currentPasswordBox.isDisplayed();
        newPasswordBox.isDisplayed();
        reEnterNewPasswordBox.isDisplayed();
    }
    public void changePassword(String current, String newPassword, String reNewPassword){
        currentPasswordBox.sendKeys(ConfigReader.getProperty(current));
        newPasswordBox.sendKeys(ConfigReader.getProperty(newPassword));
        reEnterNewPasswordBox.sendKeys(ConfigReader.getProperty(reNewPassword));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertFalse(successMessageMyAccount.isDisplayed());
    }
}

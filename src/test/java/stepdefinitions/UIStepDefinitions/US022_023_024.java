package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;
import pages.US022_023_024_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US022_023_024 {


    TrendLifeBuyPage life=new TrendLifeBuyPage();
    US022_023_024_Page nevzat=new US022_023_024_Page();
    Actions actions=new Actions(Driver.getDriver());




    @Then("User clicks My Account section on dashboard page")
    public void user_clicks_my_account_section_on_dashbord_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        nevzat.myAccountLink.click();
    }


    @Then("User verifies that the page is {string} accessible")
    public void userVerifiesThatThePageIsAccessible(String expectedurl) {
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(ConfigReader.getProperty(expectedurl),actual);
    }

    @Then("User clicks Choose File button on My Profile page and {string} Photo")
    public void user_clicks_choose_file_button_on_my_profil_page_and_photo(String photo) {
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(5);
       // nevzat.chooseFileButton.click();
        actions.sendKeys(ConfigReader.getProperty(photo)).perform();
        ReusableMethods.bekle(1);



    }
    @Then("User verifies that the photo  is uploaded")
    public void user_verifies_that_the_photo_is_uploaded() {
     Assert.assertTrue(nevzat.image.isDisplayed());
    }


    @Then("Verifies that the Basic Info tab contains First Name, Last Name,Email Address, Phone Number, Date of Birth, Description,Text Box")
    public void verifiesThatTheBasicInfoTabContainsFirstNameLastNameEmailAddressPhoneNumberDateOfBirthDescriptionTextBox() {
        nevzat.verifiesThatTheBasicInfoTab();
    }

    @Then("User verifies that the information in the Basic Info tab \\({string},{string}, {string} {string}) is the user's information.")
    public void userVerifiesThatTheInformationInTheBasicInfoTabIsTheUserSInformation(String firstname, String lastname, String emailAdress, String value) {
        String expected1=ConfigReader.getProperty(firstname);
        String actual1=nevzat.firstNameBoxMyAccount.getAttribute(value);
        String expected2= ConfigReader.getProperty(lastname);
        String actual2=nevzat.lastNameBoxMyAccount.getAttribute(value);
        String expected3=ConfigReader.getProperty(emailAdress);
        String actual3=nevzat.emailAdressBoxMyAccount.getAttribute(value);

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);

    }

    @Then("User enters {string} {string} {string} {string} {string} {string} in textboxes and confirms that it is updateable")
    public void userEntersInTextboxesAndConfirmsThatItIsUpdateable(String firstname, String lastname, String mail, String phoneNumber, String dateOfBirth, String description) {
        nevzat.uploadAllBoxInAccountPage(firstname,lastname,mail,phoneNumber,dateOfBirth,description);
    }


    @Then("User clicks Change Password button on My Account page")
    public void userClicksChangePasswordButtonOnMyAccountPage() {
        nevzat.changePasswordButtonMyAccount.click();
    }

    @Then("User verifies that the text boxes in the {string} {string} {string} Change Password tab")
    public void userVerifiesThatTheTextBoxesInTheChangePasswordTab(String current, String newPassword, String reNewPassword) {
       nevzat.changePassword(current,newPassword,reNewPassword);
    }

    @Then("User verifies that the text boxes in the Change Password tab")
    public void userVerifiesThatTheTextBoxesInTheChangePasswordTab() {
      nevzat.verifiesThatChangePasswordPage();
    }
}

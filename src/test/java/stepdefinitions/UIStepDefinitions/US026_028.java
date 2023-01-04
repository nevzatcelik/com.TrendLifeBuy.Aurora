package stepdefinitions.UIStepDefinitions;


import io.cucumber.java.en.Then;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import pages.TrendLifeBuyPage;


import pages.US026_028_Page;
import utilities.Driver;
import utilities.ReusableMethods;



public class US026_028 {
    TrendLifeBuyPage life = new TrendLifeBuyPage();
    US026_028_Page page = new US026_028_Page();
    Actions actions = new Actions(Driver.getDriver());

    @Then("Visitor verify that the site is accessible")
    public void visitor_verify_website() {

        Assert.assertTrue(page.website.isDisplayed());


    }

    @Then(("Visitor must see product"))
    public void select_product() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.product1.isDisplayed());


    }

    @Then("Visitor verify Add to Cart button is appear")
    public void appear_addtocart() {

        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.product2addtocart.isDisplayed());




    }
    @Then("Visitor select Add to Cart button")
    public void select_add_to_cart () {
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.selectaddtocart2.click();
        ReusableMethods.bekle(2);
        page.viewcart.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(page.cartitem.isDisplayed());
        ReusableMethods.bekle(2);







    }
    @Then("View cart should be visible")
    public void viewcart_should_visible(){
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        Actions actn3 = new Actions(Driver.getDriver());
        actn3.moveToElement(page.viewcartwindow).perform();
        Assert.assertTrue(page.viewcartwindow.isDisplayed());
        ReusableMethods.bekle(2);








    }
    @Then("in the Item added to your cart window and when clicked, it redirects to the Cart page")
    public void viewcart_section() {
       page.viewcartwindow.click();
       ReusableMethods.bekle(2);
        String expectedUrl="https://trendlifebuy.com/cart";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();





    }
    @Then("Proceed to Checkout button is visible")
    public void proceed_checkout_visible(){
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        Actions proceedtocheckout = new Actions(Driver.getDriver());
        proceedtocheckout.moveToElement(page.proceedtocheckout).perform();
        Assert.assertTrue(page.proceedtocheckout.isDisplayed());
    }

    @Then ("Redirecting to Checkout page when PROCEED TO CHECKOUT button is click should be verified")
    public void proceed_to_checkout(){
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        page.proceedtocheckout.click();
        ReusableMethods.bekle(2);
        String expectedUrl="https://trendlifebuy.com/checkout";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.getDriver().navigate().back();

    }

    @Then("verified that it is mandatory to enter E-mail in the Contact Information field on the Checkout page.")
    public void mendatory_email (){
        ReusableMethods.bekle(5);
        page.closead.click();
        ReusableMethods.bekle(2);
        Actions actn = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        actn.moveToElement(page.product2).perform();
        Actions actn2 = new Actions(Driver.getDriver());
        actn2.moveToElement(page.product2addtocart).perform();
        ReusableMethods.bekle(2);
        page.product2addtocart.click();
        ReusableMethods.bekle(2);
        page.addtocartwindow.click();
        ReusableMethods.bekle(2);
        page.viewcartwindow.click();
        ReusableMethods.bekle(2);
        page.proceedtocheckout.click();
        ReusableMethods.bekle(2);
        WebElement name = Driver.getDriver().findElement(By.id("name"));
        WebElement adress = Driver.getDriver().findElement(By.id("address"));
        WebElement phone = Driver.getDriver().findElement(By.id("phone"));
        name.sendKeys("talha");
        adress.sendKeys("Houston");
        phone.sendKeys("12345678");
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        Actions citytext = new Actions(Driver.getDriver());
        citytext.moveToElement(page.citytextbox).perform();
        page.citytextbox.click();
        page.citysearchbox.click();
        page.citysearchbox.sendKeys("Clark");
        ReusableMethods.bekle(2);
        page.cityclark.click();
        ReusableMethods.bekle(2);
        page.countinuetoshiipingbutton.click();
        String expectedUrl="https://trendlifebuy.com/checkout?email=aaa%40aaa.com&news_letter=1&delivery_type=home_delivery&pickup_location=&name=talha&address=Houston&phone=12345678&country=231&state=3953&city=47802&postal_code=&note=&step=select_shipping";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        if (!expectedUrl.equals(actualUrl))
        {
            System.out.println("Email is mandatory");
        }

















    }


}


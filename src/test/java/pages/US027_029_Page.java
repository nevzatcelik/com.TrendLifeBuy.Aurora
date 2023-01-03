package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US027_029_Page {
    public US027_029_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//img[@title='Trendlifebuy | Online Shopping'])[1]")
    public WebElement trendlifeLogo;

    @FindBy(xpath = "//h3[text()='Sign In']")
    public WebElement LoginPage;

    @FindBy(xpath = "//div[@id='tab_pane_subcat_10']")
    public WebElement Product;

    @FindBy(xpath = "//a[text()='Add to Cart']")
    public WebElement addToCartButton;





    @FindBy(xpath = "//input[@id='text']")
    public WebElement adminEmailbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminPasswordBox;







}

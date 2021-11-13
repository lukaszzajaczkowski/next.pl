package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Piłka do masażu M.Life")
    private WebElement firstProduct;

    public void clickFirstProduct() {
        firstProduct.click();
    }

    @FindBy(css = "h1")
    private WebElement productTitle;

    public String getProductTitle() {
        return productTitle.getText();
    }

    @FindBy(css = ".addToBagCTA")
    private WebElement addToCart;

    public void clickAddToCart() {
        addToCart.click();
    }

    @FindBy(css = "[data-ga-v1='Quick Links'][type='button'] > i")
    private WebElement cart;









}

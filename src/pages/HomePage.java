package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;


    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    @FindBy(css = ".component__Username-sc-4hkj4z-0")
    private WebElement myAccount;

    public void openMyAccount() {
        myAccount.click();
    }

    @FindBy (css = "#header-big-screen-search-box")
    private WebElement searchBar;

    public void fillSearchBar(String searchPhrase) {
        searchBar.sendKeys(searchPhrase);
    }

    @FindBy (css = ".component__BigScreenContainer-oey5um-0 [alt='Ikona wyszukiwania']")
    private WebElement search;


    public void clickSearch() {
        search.click();
    }

    @FindBy (css = ".search-phrase")
    private WebElement searchResult;

    public String getActualResult() {
        return searchResult.getText();
    }

    public void checkSearchResults(String searchPhrase) {
        Assert.assertEquals(getActualResult(), searchPhrase);
    }


    @FindBy (css = "[data-ga-v1='Quick Links'][type='button'] > i")
    private WebElement cart;

    public void clickOnCart() {
        cart.click();
    }

    @FindBy (css = "[data-testid='header-mini-shopping-bag-item-description']")
    private WebElement productInCart;

    public String formatProductName() {
        return  productInCart.getText().substring(10, 32);
    }

    @FindBy (css = ".gMYjQW > .header84")
    private WebElement seeCartBtn;

    public void seeCart() {
        seeCartBtn.click();
    }






}

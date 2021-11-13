import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.SearchResultsPage;


public class BuyingProcessTests extends BaseTest {

    @Test
    @Parameters({"productToBuy", "priceOfItem"})

    public void CartTest(String productToBuy, String priceOfItem) {

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        CartPage cartPage = new CartPage(driver);

        String emptyCartInfo = "Twój koszyk jest pusty.";


        homePage.acceptCookies();

        homePage.fillSearchBar(productToBuy);

        homePage.clickSearch();

        searchResultsPage.clickFirstProduct();

        searchResultsPage.getProductTitle();

        searchResultsPage.clickAddToCart();

        homePage.clickOnCart();

        Assert.assertEquals(homePage.formatProductName(), searchResultsPage.getProductTitle());

        homePage.seeCart();

        cartPage.dropDownClick();
        
        cartPage.chooseTwo();

        cartPage.waitForTotalPrice();

        Assert.assertEquals(cartPage.getTotalPrice(), priceOfItem );

        cartPage.clickCancelBtn();

        homePage.clickOnCart();

        Assert.assertEquals(cartPage.getEmptyCarttext(), emptyCartInfo);




    }
}

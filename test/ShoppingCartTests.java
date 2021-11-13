import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;


public class ShoppingCartTests extends BaseTest {


    @Test
    @Parameters({"productToBuy"})

    public void CartTest(String productToBuy) {

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.acceptCookies();

        homePage.fillSearchBar(productToBuy);

        homePage.clickSearch();

        searchResultsPage.clickFirstProduct();

        searchResultsPage.getProductTitle();

        searchResultsPage.clickAddToCart();

        homePage.clickOnCart();

        Assert.assertEquals(homePage.formatProductName(), searchResultsPage.getProductTitle());
    }
}



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchingTests extends BaseTest {

    @Test
    @Parameters ({"searchPhrase"})

    public void SearchingTest(String searchPhrase) {

        HomePage homePage = new HomePage(driver);

        homePage.acceptCookies();

        homePage.fillSearchBar(searchPhrase);

        homePage.clickSearch();

        homePage.getActualResult();

        homePage.checkSearchResults(searchPhrase);
    }
}
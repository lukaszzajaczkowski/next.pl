import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;


public class LoggingTests extends BaseTest {


    @Test
    @Parameters({"email", "password"})

    public void LoggingTest(String email, String password) {

        HomePage homePage = new HomePage(driver);

        MyAccountPage myAccountPage = new MyAccountPage(driver);

        homePage.acceptCookies();

        homePage.openMyAccount();

        myAccountPage.fillEmail(email);

        myAccountPage.fillPassoword(password);

        myAccountPage.logIn();

        myAccountPage.getMyAccText();

        Assert.assertEquals(myAccountPage.getMyAccText(), email);

    }
}


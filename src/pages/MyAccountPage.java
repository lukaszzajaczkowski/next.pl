package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#EmailOrAccountNumber")
    private WebElement emailAdd;

    public void fillEmail(String email) {
        emailAdd.sendKeys(email);
    }

    @FindBy(css = "#Password")
    private WebElement myPassword;

    public void fillPassoword(String password) {
        myPassword.sendKeys(password);
    }

    @FindBy(css = "#SignInNow")
    private WebElement signInBtn;

    public void logIn() {
        signInBtn.click();
    }

    @FindBy (css = ".textEllipsis")
    private WebElement myAccountHead;

    public String getMyAccText() {
        return myAccountHead.getText();
    }


}

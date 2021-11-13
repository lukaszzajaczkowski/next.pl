package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dk_container_Qty_1")
    private WebElement dropDown;

    public void dropDownClick() {
        dropDown.click();
    }

    @FindBy(linkText = "2")
    private WebElement two;

    public void chooseTwo() {
        two.click();
    }

    public void waitForTotalPrice() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sbtotals")));
    }

    @FindBy(className = "price")
    private WebElement totalCost;

    public String getTotalPrice() {
        return totalCost.getText();
    }

    @FindBy(css = ".DeleteButton")
    private WebElement cancelBtn;

    public void clickCancelBtn() {
        cancelBtn.click();
    }

    @FindBy(css = "[data-testid='header-mini-shopping-bag-empty']")
    private WebElement emptyCart;

    public String getEmptyCarttext() {
        return emptyCart.getText();
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {


    @FindBy(css = "p a[title='Proceed to checkout']")
    WebElement proceedToCheckoutButton;

    @FindBy(css = "td>p[class='product-name'] a")
    WebElement productName;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public void verifyItemInTheCartAndCheckout() {

        proceedToCheckoutButton.click();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(css = "img[alt='Printed Chiffon Dress']")
    WebElement selectedItemLink;

    @FindBy(css = "p[id='add_to_cart'] > button[type='submit")
    WebElement addToCartButton;

    @FindBy(css = "div[class^='layer_cart_product col'] h2")
    WebElement itemAddedToCartMessage;

    @FindBy(css = "a[title='Proceed to checkout']")
    WebElement proceedToCheckoutInPopScreen;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectItemAndToCart(String selectedItem) {
        selectedItemLink.click();
        addToCartButton.click(); }

    public String verifyItemAddedToCart() {
        waitForVisibility(itemAddedToCartMessage);
        return itemAddedToCartMessage.getAttribute("innerText"); }

    public void proceedToCheckOut() {
        proceedToCheckoutInPopScreen.click(); }
}

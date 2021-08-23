package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStorePage extends BasePage {


    @FindBy(id = "search_query_top")
    WebElement searchTextBox;

    @FindBy(css = "button[name='submit_search']")
    WebElement searchButton;


    By addToCart = By.id("add-to-cart-button");


    public MyStorePage(WebDriver driver) {
        super(driver);
    }


    public void searchAnItem(String itemName) {
        searchTextBox.sendKeys(itemName);
        searchButton.click();

    }

    public void addItemToCart() {
        waitAndGetElementBy(addToCart).click();
    }
}

package glue;


import componentFactory.PageObjects;
import cucumberHelper.ITestContext;
import io.cucumber.java8.En;
import org.junit.Assert;
import pages.CheckoutPage;
import pages.MyStorePage;
import pages.SearchPage;
import pages.SignInPage;

public class StepDefinitions implements En {

    private final PageObjects pageObjects;
    private final MyStorePage myStorePage;
    private final CheckoutPage checkoutPage;
    private final SearchPage searchPage;
    private final SignInPage signInPage;


    public StepDefinitions(ITestContext testContext) {

        this.pageObjects = testContext.getPageObjectManager();
        this.myStorePage = pageObjects.getHomePage();
        this.checkoutPage = pageObjects.getCheckoutPage();
        this.searchPage = pageObjects.getPaymentsPage();
        this.signInPage = pageObjects.getSignInPage();

        Given("I search for product {string}", (String itemName) -> {
            myStorePage.searchAnItem(itemName);
        });


        And("I add item {string} to the cart", (String selectedItem) -> {
            searchPage.selectItemAndToCart(selectedItem);
            Assert.assertEquals("Product successfully added to your shopping cart", searchPage.verifyItemAddedToCart());
        });

        And("^I proceed to checkout$", () -> {
            searchPage.proceedToCheckOut();
            checkoutPage.verifyItemInTheCartAndCheckout();
        });

        Then("I should be on the {string} page", (String currentTab) -> {
            Assert.assertEquals("Login - My Store", signInPage.verifyPageTitle());
            Assert.assertEquals("02. " + currentTab, signInPage.getCurrentTabName());

        });


        After(() -> {
            testContext.tearDown();
        });

    }
}
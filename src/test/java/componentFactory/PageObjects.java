package componentFactory;


import org.openqa.selenium.WebDriver;
import pages.*;

public class PageObjects {

    private WebDriver driver;

    private MyStorePage myStorePage;


    public PageObjects(WebDriver driver) {

        this.driver = driver;
    }

    public MyStorePage getHomePage() {

        return new MyStorePage(driver);
    }

    public SearchPage getPaymentsPage() {

        return new SearchPage(driver);
    }

    public CheckoutPage getCheckoutPage() {
        return new CheckoutPage(driver);
    }



    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

}

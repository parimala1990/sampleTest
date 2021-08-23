package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignInPage extends BasePage{

    @FindBy(css = "img[alt='Printed Chiffon Dress']")
    WebElement pageTitle;

    @FindBy(css = "li[class='step_current second']>span")
    WebElement currentTab;



    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public String verifyPageTitle()
    {
        return driver.getTitle(); }

    public String getCurrentTabName()
    {
        return currentTab.getText(); }


}

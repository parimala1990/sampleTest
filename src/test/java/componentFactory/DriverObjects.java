package componentFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverObjects{

    WebDriver driver;

    public WebDriver getDriver() {
        driver = createDriver();
        return driver;
    }

    private WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        return driver;
    }

    public void quitDriver()
    {
        driver.quit();
    }

}

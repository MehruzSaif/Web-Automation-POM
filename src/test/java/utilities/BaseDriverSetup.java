package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverSetup {
    private static String browserName = System.getProperty("browser", "edge");
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        BaseDriverSetup.LOCAL_DRIVER.set(driver);
    }
    public static WebDriver getDriver() {
        return LOCAL_DRIVER.get();
    }

    public static WebDriver getBrowser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--remote-allow-origins*");
                return new EdgeDriver(edgeOptions);

            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            default:
                throw new RuntimeException("Browser not Found! using given name: " + browserName);
        }
    }

    @BeforeTest
    public static synchronized void setBrowser() {
        WebDriver webDriver = getBrowser(browserName);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.manage().window().maximize();
        setDriver(webDriver);
    }

    @AfterTest
    public static synchronized void quitBrowser() {
        getDriver().quit();
    }

    /* Assertions  */
        assertEquals(getDriver().getTitle(), darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        darazHelpCenterPage.takeScrreenShot("Help Center Page");
    }
}

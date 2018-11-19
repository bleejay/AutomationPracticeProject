package AutomationPracticeProject.Selenium_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriverConfig {

    private WebDriver driver;
    private SeleniumProperties seleniumProperties = new SeleniumProperties();

    public SeleniumDriverConfig(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getChromeDriverPath());
            this.driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(seleniumProperties.getWaitTime(), TimeUnit.SECONDS);
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getGeckoDriverPath());
            this.driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(seleniumProperties.getWaitTime(), TimeUnit.SECONDS);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

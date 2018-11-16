package AutomationPracticeProject.Selenium_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriverConfig {

    public WebDriver driver;
    private SeleniumProperties seleniumProperties = new SeleniumProperties();

    public SeleniumDriverConfig(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getChromeDriverPath());
            this.driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", seleniumProperties.getGeckoDriverPath());
            this.driver = new FirefoxDriver();
        }
        this.driver.manage().timeouts().implicitlyWait(seleniumProperties.getImplicitWaitTime(), TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }
}

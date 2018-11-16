package AutomationPracticeProject.Selenium_Config;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumProperties {
    private String chromeDriverPath;
    private String geckoDriverPath;
    private String waitTime;
    public SeleniumProperties(){

        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader("C:\\Users\\TECH-W112\\IdeaProjects\\AutomationPracticeProject\\src\\test\\java\\AutomationPracticeProject\\Selenium_Config\\selenium.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        chromeDriverPath = seleniumProperties.getProperty("chrome_driver_path");
        geckoDriverPath = seleniumProperties.getProperty("gecko_driver_path");
        waitTime = seleniumProperties.getProperty("implicit_wait_time");



    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getGeckoDriverPath() {
        return geckoDriverPath;
    }

    public String getWaitTime() {
        return waitTime;
    }
}

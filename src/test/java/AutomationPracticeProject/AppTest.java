package AutomationPracticeProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class AppTest
{
    String path;
    String user_name;
    @Test
    public void test() {

        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader("C:\\Users\\" + user_name + "\\IdeaProjects\\Cucumber_Example\\src\\test\\java\\com\\sparta\\owh\\Selenium_Config\\selenium.properties"));
            path = seleniumProperties.getProperty("chrome_driver_path");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

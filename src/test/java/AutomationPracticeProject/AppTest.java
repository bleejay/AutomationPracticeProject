package AutomationPracticeProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        String path;
        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader("C:\\Users\\TECH-W112\\IdeaProjects\\Cucumber_Example\\src\\test\\java\\com\\sparta\\owh\\Selenium_Config\\selenium.properties"));
            path = seleniumProperties.getProperty("chrome_driver_path");
            System.out.println(path);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

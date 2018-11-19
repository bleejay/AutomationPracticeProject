package AutomationPracticeProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class AppTest
{
    String path;
    String propertiesFileLocation = "";
    @Test
    public void test() {

        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader(propertiesFileLocation));
            path = seleniumProperties.getProperty("chrome_driver_path");
        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }

}

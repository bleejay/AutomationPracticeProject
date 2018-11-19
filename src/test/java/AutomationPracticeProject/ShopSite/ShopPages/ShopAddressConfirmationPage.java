package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopAddressConfirmationPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?controller=order&step=1";
    private By processAddressButtonName = By.name("processAddress");

    public ShopAddressConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void processAddress(){driver.findElement(processAddressButtonName).click();}
}

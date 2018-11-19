package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopShippingConfirmationPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?controller=order";
    private By processShippingButtonName = By.name("processCarrier");
    private By acceptConditionsTickBoxID = By.id("cgv");

    public ShopShippingConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void tickAcceptTermsBox(){driver.findElement(acceptConditionsTickBoxID).click();}
    public void processShipping(){driver.findElement(processShippingButtonName).click();}
}

package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopOrderConfirmationPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?controller=order&step=1";
    private By goToOrderHistoryButton = By.xpath("//*[@id=\"cart_navigation\"]/a");

    public ShopOrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void goToOrderHistory(){driver.findElement(goToOrderHistoryButton).click();}
}

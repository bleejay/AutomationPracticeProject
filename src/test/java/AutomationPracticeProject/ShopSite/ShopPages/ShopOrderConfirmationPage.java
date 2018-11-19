package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopOrderConfirmationPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?controller=order-confirmation&id_cart=812389&id_module=3&id_order=83613&key=0a7492dbc79a24e970227910745f5825";
    private By goToOrderHistoryButton = By.xpath("//*[@id=\"center_column\"]/p/a");
    private By totalPriceClassName = By.className("price");

    public ShopOrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void goToOrderHistory(){driver.findElement(goToOrderHistoryButton).click();}

    public String getTotalPrice(){
        return driver.findElement(totalPriceClassName).getText();
    }
}

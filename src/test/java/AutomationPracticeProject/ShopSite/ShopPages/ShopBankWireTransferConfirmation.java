package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopBankWireTransferConfirmation {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment";
    private By confirmOrderButton = By.className("button btn btn-default button-medium");
    private By selectAlternatePaymentMethod = By.className("button-exclusive btn btn-default");

    public ShopBankWireTransferConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void processAddress(){driver.findElement(confirmOrderButton).click();}

    public void goToPaymentSelectionPage(){driver.findElement(selectAlternatePaymentMethod).click();}

}

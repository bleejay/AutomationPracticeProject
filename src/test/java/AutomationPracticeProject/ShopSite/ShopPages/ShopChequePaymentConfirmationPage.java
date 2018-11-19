package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopChequePaymentConfirmationPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?fc=module&module=cheque&controller=payment";
    private By confirmOrderButton = By.className("button btn btn-default button-medium");
    private By selectAlternatePaymentMethod = By.className("button-exclusive btn btn-default");
    private By totalPriceID = By.id("amount");

    public ShopChequePaymentConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void processAddress(){driver.findElement(confirmOrderButton).click();}

    public void goToPaymentSelectionPage(){driver.findElement(selectAlternatePaymentMethod).click();}

    public String getTotalAmountOfOrder(){return driver.findElement(totalPriceID).getText();}
}

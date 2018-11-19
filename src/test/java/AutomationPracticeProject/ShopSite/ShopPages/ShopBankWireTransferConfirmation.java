package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopBankWireTransferConfirmation {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment";
    private By confirmOrderButton = By.xpath("//*[@id=\"cart_navigation\"]/button");
    private By selectAlternatePaymentMethod = By.xpath("//*[@id=\"cart_navigation\"]/a");
    private By totalPriceID = By.id("amount");

    public ShopBankWireTransferConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void processPayment(){driver.findElement(confirmOrderButton).click();}

    public void goToPaymentSelectionPage(){driver.findElement(selectAlternatePaymentMethod).click();}
    public Double getTotalAmountOfOrder(){
       String price = driver.findElement(totalPriceID).getText();
        Double totalPrice = Double.parseDouble(price.replace ("$",""));
        return totalPrice;
    }

}

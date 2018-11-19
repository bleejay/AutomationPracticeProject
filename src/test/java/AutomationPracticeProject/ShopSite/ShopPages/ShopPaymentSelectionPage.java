package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPaymentSelectionPage {

    private WebDriver driver;
    private String pageURL = "http://automationpractice.com/index.php?controller=order";
    private By payByCardButtonClassName = By.className("bankwire");
    private By payByChequeButtonClassName = By.className("cheque");
    private By totalPrice = By.xpath("//*[@id=\"total_price\"]");

    public ShopPaymentSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageURL() {
        return pageURL;
    }

    public void payByCard(){driver.findElement(payByCardButtonClassName).click();}
    public void payByCheque(){driver.findElement(payByChequeButtonClassName).click();}

    public Double totalPrice(){

    String price = driver.findElement(totalPrice).getText();
    Double totalPrice = Double.parseDouble(price.replace ("$",""));
    return totalPrice;
    }
}

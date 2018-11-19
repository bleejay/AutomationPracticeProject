package AutomationPracticeProject.ShopSite.ShopPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShopOrderHistoryPage {
    private String pageURL = "http://automationpractice.com/index.php?controller=history";
    private WebDriver driver;

    private By orderHistoryPrice = By.className("history_price");
    private By orderReference = By.className("color-myaccount");
    private By orderDate = By.className("history_date");

    public ShopOrderHistoryPage(WebDriver driver){
        this.driver = driver;
    }
    public void goToOrderHistoryPage(){
        driver.navigate().to(pageURL);
    }
    public Double getOrderPrice(){
       String total = driver.findElement(orderHistoryPrice).getAttribute("data-value");
        Double totalPrice = Double.parseDouble(total.replace ("$",""));
        return totalPrice;
    }
    public String getOrderReference(){
        return driver.findElement(orderReference).getText();
    }
    public String getOrderDate(){
        return driver.findElement(orderDate).getText();
    }
    public String getPageURL(){
        return pageURL;
    }
}

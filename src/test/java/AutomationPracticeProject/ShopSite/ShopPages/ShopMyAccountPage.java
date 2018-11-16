package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopMyAccountPage {

    private WebDriver driver;
    private String myAccountPageUrl = "http://automationpractice.com/index.php?controller=my-account";
    private By orderHistoryAndDetailsButtonClass = By.className("icon-list-ol");
    private By myCreditSlipsButtonClass = By.className("icon-ban-circle");
    private By myAddressesButtonClass = By.className("icon-building");
    private By myPersonalInformationButtonClass = By.className("icon-user");
    private By myWishlistsButtonClass = By.className("icon-heart");
    private By homeButtonClass = By.className("btn btn-default button button-small");
    private By searchProductField = By.id("search_query_top");
    private By searchProductButton = By.className("btn btn-default button-search");
    private By checkoutButtonId = By.id("button_order_cart");
    private By signOutButtonClass = By.className("logout");

    public ShopMyAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getMyAccountPageUrl() {
        return myAccountPageUrl;
    }
    public void goTomyAccountPage(){
        driver.navigate().to(myAccountPageUrl);
    }
    public void inputSearch(String product){
        driver.findElement(searchProductField).sendKeys(product);
        driver.findElement(searchProductButton).click();
    }
    public void clickSignOutButton(){
        driver.findElement(signOutButtonClass).click();
    }
    public void goToCheckout(){
        driver.findElement(checkoutButtonId).click();
    }
    public void goToHome(){
        driver.findElement(homeButtonClass).click();
    }
    public void goToOrderHistoryAndDetails(){
        driver.findElement(orderHistoryAndDetailsButtonClass).click();
    }
    public void goToMyCreditSlips(){
        driver.findElement(myCreditSlipsButtonClass).click();
    }
    public void goToMyAddresses(){
        driver.findElement(myAddressesButtonClass).click();
    }
    public void goToMyPersonalInformation(){
        driver.findElement(myPersonalInformationButtonClass).click();
    }
    public void goToMyWishlist(){
        driver.findElement(myWishlistsButtonClass).click();
    }
}

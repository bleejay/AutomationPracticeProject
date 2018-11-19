package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage {

    private WebDriver driver;

    //URLs
    private String cartUrl = "http://automationpractice.com/index.php?controller=order";
    private String checkoutAuthenticationURL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
    private String homePageURL = "http://automationpractice.com/index.php";
    private String signInPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    //Buttons
    private By proceedToCheckoutButton = By.className("button btn btn-default standard-checkout button-medium");
    private By logoButton = By.className("logo img-responsive");
    private By signInButton = By.className("login");
    private By increaseQuantityOfFirstItemButton = By.id("cart_quantity_up_1_1_0_0");
    private By decreaseQuantityOfFirstItemButton = By.id("cart_quantity_down_1_1_0_0");
    private By firstItemQuantity = By.className("quantity_2_7_0_0");
    private By productsTotalPrice = By.id("total_product");

    //Page Actions
    public void clickProceedToCheckoutButton(){
        driver.findElement(proceedToCheckoutButton).click();
    }
    public void clickLogoButton(){
        driver.findElement(logoButton).click();
    }
    public void clickSignInButton(){
        driver.findElement(signInButton);
    }
    public void increaseFirstItemQuantity(){
        driver.findElement(increaseQuantityOfFirstItemButton).click();
    }
    public void decreaseFirstItemQuantity(){
        driver.findElement(decreaseQuantityOfFirstItemButton).click();
    }
    private Integer getFirstItemQuantity(){
        return Integer.parseInt(driver.findElement(firstItemQuantity).getAttribute("value"));
    }


    //Page Accessors
    public void goToHomePage(){
        driver.navigate().to(homePageURL);
    }
    public void goToCheckoutProcess(){
        driver.navigate().to(checkoutAuthenticationURL);
    }
    public void goToSignInPage(){
        driver.navigate().to(signInPageURL);
    }




}

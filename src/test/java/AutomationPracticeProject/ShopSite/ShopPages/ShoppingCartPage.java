package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShoppingCartPage {

    private WebDriver driver;

    //Constructor
    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    //URLs
    private String cartUrl = "http://automationpractice.com/index.php?controller=order";
    private String checkoutAuthenticationURL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";
    private String homePageURL = "http://automationpractice.com/index.php";
    private String signInPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    //Buttons
    private By proceedToCheckoutButton = By.className("standard-checkout");
    private By logoButton = By.className("logo img-responsive");
    private By signInButton = By.className("login");
    private By increaseQuantityOfFirstItemButton = By.id("cart_quantity_up_1_1_0_0");
    private By decreaseQuantityOfFirstItemButton = By.id("cart_quantity_down_1_1_0_0");

    //Item Quantity
    private By firstItemQuantity = By.className("quantity_2_7_0_0");
    private By secondItemQuantity = By.className("quantity_3_13_0_0");

    //Prices
    private By firstItemUnitPrice = By.id("product_price_2_7_0");
    private By secondItemUnitPrice = By.id("product_price_3_13_0");
    private By productsTotalPrice = By.id("total_price");

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

    //Cart data accessors
    public Integer getFirstItemQuantity(){
        return Integer.parseInt(driver.findElement(firstItemQuantity).getAttribute("value"));
    }
    public Double getTotalBasketQuantity(){
        String totalPriceString = driver.findElement (productsTotalPrice).getText();
        Double totalPrice = Double.parseDouble(totalPriceString.replace ("$",""));
        return totalPrice;
    }
    public Double getFirstItemPrice(){
        String firstItemPriceString = driver.findElement(firstItemUnitPrice).getAttribute ("price");
        Double firstItemPrice = Double.parseDouble(firstItemPriceString.replace ("$",""));
        return firstItemPrice;
    }
    public Double getSecondItemPrice(){
        String seccondItemPriceString = driver.findElement(secondItemUnitPrice).getAttribute("price");
        Double secondItemPrice = Double.parseDouble (seccondItemPriceString.replace ("$",""));
        return secondItemPrice;
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

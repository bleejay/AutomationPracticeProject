package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopHomePage {

    private WebDriver driver;
    private Actions actions;

    private String HomePageURL = "http://automationpractice.com/index.php";
    private By signInLink = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private By addToBasketLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
//    private By quickViewLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[2]");
//    private By quickViewMobile = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/div[1]/a");
//    private By qvAddToBasketLink = By.name("Submit");
    private By productPageLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]");
    private By toCheckoutLink = By.xpath("//*[@id=\"button_order_cart\"]/span");
    private By toCheckoutFromAddLink = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    private By cartItem = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a");
    private By continueShoppingLink = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span");
//    private By quickViewWrapper = By.xpath("//*[@id=\"product\"]/div/div/div[1]");


    public ShopHomePage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(this.driver);
    }

    public void goToHomePage(){
        driver.navigate().to(HomePageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInLink).click();
    }

    public void clickAddToBasket(){
        driver.findElement(addToBasketLink).click();
    }

//    public void clickQuickView(){
//        if (driver.manage().window().getSize().width >1198){
//            driver.findElement(quickViewLink).click();
//        } else {
//            driver.findElement(quickViewMobile).click();
//        }
//    }

//    public void clickQuickViewAddToCart(){
////        actions.moveToElement(driver.findElement(quickViewWrapper)).perform();
//        driver.findElement(qvAddToBasketLink).click();
//    }

    public void getGoToProduct(){
        driver.findElement(productPageLink).click();
    }

    public void toCheckout(){
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))).perform();
        driver.findElement(toCheckoutLink).click();
    }

    public void toCheckoutFromAdd(){
        driver.findElement(toCheckoutFromAddLink).click();
    }

    public String checkCartItem(){
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))).perform();
        return driver.findElement(cartItem).getText();
    }

    public void continueShopping(){
        driver.findElement(continueShoppingLink).click();
    }
}

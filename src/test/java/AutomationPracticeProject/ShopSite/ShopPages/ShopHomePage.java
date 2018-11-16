package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopHomePage {

    private WebDriver driver;
    private String HomePageURL = "http://automationpractice.com/index.php";
    private By signInLink = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private By addToBasketLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
    private By quickViewLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[2]");
    private By qvAddToBasketLink = By.xpath("//*[@id=\"add_to_cart\"]/button");
    private By productPageLink = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]");
    private By categoryLink = By.xpath("");


    public ShopHomePage(WebDriver driver){
        this.driver = driver;
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

    public void clickQuickView(){
        driver.findElement(quickViewLink).click();
    }

    public void clickQuickViewAddToCart(){
        driver.findElement(qvAddToBasketLink).click();
    }

    public void getGoToProduct(){
        driver.findElement(productPageLink).click();
    }

    public void goToCategory(){
//        driver.findElement().click();
    }

    public void searchBar(){

    }
}

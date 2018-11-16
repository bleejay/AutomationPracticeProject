package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopHomePage {

    private WebDriver driver;
    private String HomePageURL = "http://automationpractice.com/index.php";
    private By signInLink = By.id("idcta-link");
    private By addToBasketLink = By.id("");
    private By quickViewLink = By.id("");
    private By qvAddToBasketLink = By.id("");
    private By productPageLink = By.id("");
    private By categoryLink = By.id("");



    public ShopHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.navigate().to(HomePageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInLink).click();
    }

    public void clickAddToBasket(){}

    public void clickQuickView(){}

    public void clickQuickViewAddToCart(){}

    public void getGoToProduct(){}

    public void goToCategory(){}

    public void searchBar(){}




}

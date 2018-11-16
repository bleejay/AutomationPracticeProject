package AutomationPracticeProject.ShopSite;

import AutomationPracticeProject.ShopSite.ShopPages.ShopHomePage;
import AutomationPracticeProject.ShopSite.ShopPages.ShopSignInPage;

import org.openqa.selenium.WebDriver;

public class ShopSite {

    private WebDriver driver;
    private ShopHomePage shopHomePage;
    private ShopSignInPage shopSignInPage;


    public ShopSite(WebDriver driver) {
        this.driver = driver;
        shopHomePage = new ShopHomePage(driver);
        shopSignInPage = new ShopSignInPage(driver);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }

    public ShopHomePage shopHomePage(){
        return shopHomePage;
    }

    public ShopSignInPage shopSignInPage(){
        return shopSignInPage;
    }

}

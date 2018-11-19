package AutomationPracticeProject.ShopSite;

import AutomationPracticeProject.ShopSite.ShopPages.ShopHomePage;
import AutomationPracticeProject.ShopSite.ShopPages.ShopOrderHistoryPage;
import AutomationPracticeProject.ShopSite.ShopPages.ShopSignInPage;

import org.openqa.selenium.WebDriver;

public class ShopSite {

    private WebDriver driver;
    ShopHomePage shopHomePage;
    ShopSignInPage shopSignInPage;
    ShopOrderHistoryPage orderHistoryPage;



    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }


    public ShopSite(WebDriver driver) {
        this.driver = driver;
    }

    public ShopHomePage shopHomePage(){
        return new ShopHomePage( driver );
    }

    public ShopSignInPage shopSignInPage(){
        return new ShopSignInPage(driver);
    }

    public ShopOrderHistoryPage shopOrderHistoryPage(){return new ShopOrderHistoryPage(driver);}

}

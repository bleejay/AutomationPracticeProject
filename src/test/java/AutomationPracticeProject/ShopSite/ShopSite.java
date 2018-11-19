package AutomationPracticeProject.ShopSite;


import AutomationPracticeProject.ShopSite.ShopPages.*;

import org.openqa.selenium.WebDriver;

public class ShopSite {

    private WebDriver driver;
    ShopHomePage shopHomePage;
    ShopSignInPage shopSignInPage;
    ShopOrderHistoryPage orderHistoryPage;
    ShopAddressConfirmationPage shopAddressConfirmationPage;
    ShopShippingConfirmationPage shopShippingConfirmationPage;
    ShopPaymentSelectionPage shopPaymentSelectionPage;
    ShopBankWireTransferConfirmation shopBankWireTransferConfirmation;
    ShopChequePaymentConfirmationPage shopChequePaymentConfirmationPage;
    ShopMyAccountPage shopMyAccountPage;

    public ShopSite(WebDriver driver) {
        this.driver = driver;
        shopHomePage = new ShopHomePage(driver);
        shopSignInPage = new ShopSignInPage(driver);
        shopMyAccountPage = new ShopMyAccountPage(driver);
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

    public ShopOrderHistoryPage shopOrderHistoryPage(){return new ShopOrderHistoryPage(driver);}
    public ShopMyAccountPage shopMyAccountPage() {
        return shopMyAccountPage;
    }
}

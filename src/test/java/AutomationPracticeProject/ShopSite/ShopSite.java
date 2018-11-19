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

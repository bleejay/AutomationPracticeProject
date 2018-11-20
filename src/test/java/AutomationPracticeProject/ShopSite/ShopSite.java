package AutomationPracticeProject.ShopSite;


import AutomationPracticeProject.ShopSite.ShopPages.*;

import org.openqa.selenium.WebDriver;

public class ShopSite {

    private WebDriver driver;
    ShopHomePage shopHomePage;
    ShopSignInPage shopSignInPage;
    ShopOrderHistoryPage shopOrderHistoryPage;
    ShopAddressConfirmationPage shopAddressConfirmationPage;
    ShopShippingConfirmationPage shopShippingConfirmationPage;
    ShopPaymentSelectionPage shopPaymentSelectionPage;
    ShopBankWireTransferConfirmation shopBankWireTransferConfirmation;
    ShopChequePaymentConfirmationPage shopChequePaymentConfirmationPage;
    ShoppingCartPage shoppingCartPage;
    ShopOrderConfirmationPage shopOrderConfirmationPage;
    ShopMyAccountPage shopMyAccountPage;

    private Double orderPrice;
    private Double cartTotal;
    private Double paymentSelectionTotal;
    private Double homePageTotal;


    public ShopSite(WebDriver driver) {
        this.driver = driver;
        shopHomePage = new ShopHomePage(driver);
        shopSignInPage = new ShopSignInPage(driver);
        shopMyAccountPage = new ShopMyAccountPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        shopSignInPage = new ShopSignInPage(driver);
        shopAddressConfirmationPage = new ShopAddressConfirmationPage(driver);
        shopShippingConfirmationPage = new ShopShippingConfirmationPage(driver);
        shopPaymentSelectionPage = new ShopPaymentSelectionPage(driver);
        shopBankWireTransferConfirmation = new ShopBankWireTransferConfirmation(driver);
        shopOrderConfirmationPage = new ShopOrderConfirmationPage(driver);
        shopOrderHistoryPage = new ShopOrderHistoryPage(driver);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }

    // Page Accessors
    public ShopHomePage shopHomePage() { return shopHomePage; }
    public ShopSignInPage shopSignInPage() { return shopSignInPage; }
    public ShopAddressConfirmationPage shopAddressConfirmationPage() { return shopAddressConfirmationPage; }
    public ShopShippingConfirmationPage shopShippingConfirmationPage() { return shopShippingConfirmationPage; }
    public ShopPaymentSelectionPage shopPaymentSelectionPage() { return shopPaymentSelectionPage; }
    public ShopBankWireTransferConfirmation shopBankWireTransferConfirmation() { return shopBankWireTransferConfirmation; }
    public ShopChequePaymentConfirmationPage shopChequePaymentConfirmationPage() { return shopChequePaymentConfirmationPage; }
    public ShoppingCartPage shoppingCartPage() { return shoppingCartPage; }
    public ShopOrderConfirmationPage shopOrderConfirmationPage() { return shopOrderConfirmationPage; }
    public ShopMyAccountPage shopMyAccountPage() {return shopMyAccountPage();}
    public ShopOrderHistoryPage shopOrderHistoryPage(){return shopOrderHistoryPage();}

    public void placeOrder() {
        shopHomePage.goToHomePage();
        shopHomePage.clickAddToBasket();
//        homePageTotal = shopHomePage.getCartPrice();
        shopHomePage.toCheckoutFromAdd();
        cartTotal = shoppingCartPage.getTotalBasketQuantity();
        shoppingCartPage.clickProceedToCheckoutButton();
        shopSignInPage.inputUserName("samgrill101@gmail.com");
        shopSignInPage.inputPassword("engineering19");
        shopSignInPage.clickSubmitButton();
        shopAddressConfirmationPage.processAddress();
        shopShippingConfirmationPage.tickAcceptTermsBox();
        shopShippingConfirmationPage.processShipping();
        paymentSelectionTotal = shopPaymentSelectionPage.totalPrice();
        shopPaymentSelectionPage.payByCard();
        orderPrice = shopBankWireTransferConfirmation.getTotalAmountOfOrder();
        shopBankWireTransferConfirmation.processPayment();
        shopOrderConfirmationPage.goToOrderHistory();

    }
    public Double getOrderPrice(){
        return orderPrice;
    }
    public Double getCartTotal(){
        return cartTotal;
    }
    public Double getPaymentSelectionTotal(){
        return paymentSelectionTotal;
    }
    public Double getHomePageTotal(){
        return homePageTotal;
    }
}

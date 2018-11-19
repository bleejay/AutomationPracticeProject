package Step_Defs;

import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopPages.ShoppingCartPage;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartStepDefs {
    ChromeDriver chromeDriver;
    ShopSite shopSite;
    ShoppingCartPage shoppingCartPage;

    public cartStepDefs(){
        SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
        shopSite = new ShopSite (driverConfig.getDriver ());
    }

    @Given("^I am on the cart page$")
    public void i_am_on_the_cart_page() throws Throwable {
        Assert.assertEquals(shopSite.shoppingCartPage().getCartUrl (), shopSite.getCurrentUrl());
    }

    @And("^I am signed in as an existing user$")
    public void i_am_signed_in_as_an_existing_user() throws Throwable {
        Assert.assertNotNull(shopSite.shoppingCartPage().getLogoutButton());
    }

    @When("^I click to the proceed to checkout$")
    public void i_click_to_the_proceed_to_checkout() throws Throwable {
        shopSite.shoppingCartPage().clickProceedToCheckoutButton();
    }

    @Then("^I go to the Address confirmation page$")
    public void i_go_to_the_Address_confirmation_page() throws Throwable {
        Assert.assertEquals (shopSite.s);
    }

}

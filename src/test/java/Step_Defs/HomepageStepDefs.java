package Step_Defs;

import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageStepDefs {
    private ShopSite shopSite;

    public HomepageStepDefs(){
        SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
        shopSite = new ShopSite(driverConfig.getDriver());
        shopSite.shopHomePage().goToHomePage();
    }

    @Given("^I am on the Homepage$")
    public void i_am_on_the_Homepage() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php", shopSite.getCurrentUrl());
    }

//    @Given("^I go to quick view$")
//    public void i_go_to_quick_view() throws Throwable {
//        shopSite.shopHomePage().clickQuickView();
//    }

    @Given("^I am on the add item page$")
    public void i_am_on_the_add_item_page() throws Throwable {
        i_click_on_the_button("add item");
    }

    @Given("^I have an item in my cart$")
    public void i_have_an_item_in_my_cart() throws Throwable{
        i_am_on_the_add_item_page();
        return_to_homepage();
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        switch (arg1) {
            case "add item":
                shopSite.shopHomePage().clickAddToBasket();
                break;
//            case "qv add item":
//                shopSite.shopHomePage().clickQuickViewAddToCart();
//                break;
            case "Proceed To Checkout":
                shopSite.shopHomePage().toCheckoutFromAdd();
                break;
            case "Check out":
                shopSite.shopHomePage().toCheckout();
                break;
        }
    }

    @When("^I return to the Homepage$")
    public void return_to_homepage() throws Throwable{
        shopSite.shopHomePage().continueShopping();
    }

    @Then("^That item is added to the cart$")
    public void that_item_is_added_to_the_cart() throws Throwable {
        Assert.assertNotNull(shopSite.shopHomePage().checkCartItem());
        Assert.assertEquals(shopSite.shopHomePage().getPrice(), shopSite.shopHomePage().getCartPrice());
    }

    @Then("^I am taken to the Checkout$")
    public void i_am_taken_to_the_Checkout() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order", shopSite.getCurrentUrl());
    }
    @After
    public void shutDown(){
        shopSite.quit();
    }
}

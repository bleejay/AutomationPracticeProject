package Step_Defs;
import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class TotalStepDefs {

    private ShopSite shopSite;

    public TotalStepDefs(){
        SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
        shopSite = new ShopSite(driverConfig.getDriver());
        shopSite.shopHomePage().goToHomePage();
    }
    @Given("^I am an existing user, I am on the homepage and I would like to purchase one item$")
    public void i_am_an_existing_user_I_am_on_the_homepage_and_I_would_like_to_purchase_one_item() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(shopSite.shopHomePage().getHomePageURL(), shopSite.getCurrentUrl ());
    }

    @When("^I proceed through the transaction process$")
    public void i_proceed_through_the_transaction_process() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        shopSite.placeOrder();
    }

    @Then("^I ensure that all totals much up on each page I visit that lists the total order value$")
    public void i_ensure_that_all_totals_much_up_on_each_page_I_visit_that_lists_the_total_order_value() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(shopSite.getOrderPrice(), shopSite.getCartTotal());
        Assert.assertEquals(shopSite.getOrderPrice(), shopSite.getPaymentSelectionTotal());
//        Assert.assertEquals(shopSite.getOrderPrice(), shopSite.getHomePageTotal());
    }

}

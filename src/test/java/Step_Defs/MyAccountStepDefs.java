package Step_Defs;

import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopPages.ShopSignInPage;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountStepDefs {

    private ChromeDriver chromeDriver;
    private ShopSite shopSite;

    public MyAccountStepDefs(){
        SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
        shopSite = new ShopSite(driverConfig.getDriver());
    }


    @Given("^That I am successfully signed in$")
    public void that_I_am_successfully_signed_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals( shopSite.shopMyAccountPage().checkLoginStatus(), true);
    }

    @And("^I am on the My Account Page$")
    public void i_am_on_the_My_Account_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       shopSite.shopMyAccountPage().goTomyAccountPage();

    }

    @When("^I click on the Order History and Details button$")
    public void i_click_on_the_Order_History_and_Details_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       shopSite.shopMyAccountPage().goToOrderHistoryAndDetails();
    }

    @Then("^I go to the Order History and Details page$")
    public void i_go_to_the_Order_History_and_Details_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals();
    }

    @When("^I click on the My Credit Slips button$")
    public void i_click_on_the_My_Credit_Slips_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the My Credit Slips page$")
    public void i_go_to_the_My_Credit_Slips_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the My Addresses button$")
    public void i_click_on_the_My_Addresses_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the My Addresses page$")
    public void i_go_to_the_My_Addresses_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the My Personal Information button$")
    public void i_click_on_the_My_Personal_Information_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the My Personal Information page$")
    public void i_go_to_the_My_Personal_Information_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the My Wishlists button$")
    public void i_click_on_the_My_Wishlists_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the My Wishlists page$")
    public void i_go_to_the_My_Wishlists_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the Home button$")
    public void i_click_on_the_Home_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the Home page$")
    public void i_go_to_the_Home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the Sign Out button$")
    public void i_click_on_the_Sign_Out_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the Sign In page$")
    public void i_go_to_the_Sign_In_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the Checkout button$")
    public void i_click_on_the_Checkout_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I go to the Checkout page$")
    public void i_go_to_the_Checkout_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

package Step_Defs;

import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopPages.ShopSignInPage;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.PendingException;
import cucumber.api.java.After;
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

    @Given("^I am on the My Account Page$")
    public void i_am_on_the_My_Account_Page() throws Throwable {
        shopSite.shopMyAccountPage().goToMyAccountPage();
    }

    @And("^That I am successfully signed in$")
    public void that_I_am_successfully_signed_in() throws Throwable {
        shopSite.shopSignInPage().inputUserName("samgrill101@gmail.com");
        shopSite.shopSignInPage().inputPassword("engineering19");
        shopSite.shopSignInPage().clickSubmitButton();
        Assert.assertEquals(shopSite.getCurrentUrl(), shopSite.shopMyAccountPage().getMyAccountPageUrl());
        //Assert.assertEquals( shopSite.shopMyAccountPage().checkLoginStatus(), true);
    }

    @When("^I click on the Order History and Details button$")
    public void i_click_on_the_Order_History_and_Details_button() throws Throwable {
       shopSite.shopMyAccountPage().goToOrderHistoryAndDetails();
    }

    @Then("^I go to the Order History and Details page$")
    public void i_go_to_the_Order_History_and_Details_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=history", shopSite.getCurrentUrl());
    }

    @When("^I click on the My Credit Slips button$")
    public void i_click_on_the_My_Credit_Slips_button() throws Throwable {
        shopSite.shopMyAccountPage().goToMyCreditSlips();
    }

    @Then("^I go to the My Credit Slips page$")
    public void i_go_to_the_My_Credit_Slips_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order-slip", shopSite.getCurrentUrl());
    }

    @When("^I click on the My Addresses button$")
    public void i_click_on_the_My_Addresses_button() throws Throwable {
        shopSite.shopMyAccountPage().goToMyAddresses();
    }

    @Then("^I go to the My Addresses page$")
    public void i_go_to_the_My_Addresses_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=addresses", shopSite.getCurrentUrl());
    }

    @When("^I click on the My Personal Information button$")
    public void i_click_on_the_My_Personal_Information_button() throws Throwable {
        shopSite.shopMyAccountPage().goToMyPersonalInformation();
    }

    @Then("^I go to the My Personal Information page$")
    public void i_go_to_the_My_Personal_Information_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=identity", shopSite.getCurrentUrl());
    }

    @When("^I click on the My Wishlists button$")
    public void i_click_on_the_My_Wishlists_button() throws Throwable {
        shopSite.shopMyAccountPage().goToMyWishlist();
    }

    @Then("^I go to the My Wishlists page$")
    public void i_go_to_the_My_Wishlists_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist", shopSite.getCurrentUrl());
    }

    @When("^I click on the Home button$")
    public void i_click_on_the_Home_button() throws Throwable {
        shopSite.shopMyAccountPage().goToHome();
    }

    @Then("^I go to the Home page$")
    public void i_go_to_the_Home_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php", shopSite.getCurrentUrl());
    }

    @When("^I click on the Sign Out button$")
    public void i_click_on_the_Sign_Out_button() throws Throwable {
        shopSite.shopMyAccountPage().clickSignOutButton();
    }

    @Then("^I go to the Sign In page$")
    public void i_go_to_the_Sign_In_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account", shopSite.getCurrentUrl());
    }

    @When("^I click on the Cart button$")
    public void i_click_on_the_Cart_button() throws Throwable {
        shopSite.shopMyAccountPage().goToMyCart();
    }

    @Then("^I go to the Cart page$")
    public void i_go_to_the_Cart_page() throws Throwable {
        Assert.assertEquals("http://automationpractice.com/index.php?controller=order", shopSite.getCurrentUrl());
    }

    @After
    public void shutDown(){
        shopSite.quit();
    }
}

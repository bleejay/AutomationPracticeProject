package Step_Defs;

import AutomationPracticeProject.*;
import AutomationPracticeProject.Selenium_Config.SeleniumDriverConfig;
import AutomationPracticeProject.ShopSite.ShopSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStep_Defs {

    ChromeDriver chromeDriver;
    ShopSite shopSite;

    public loginStep_Defs(){

            SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
            shopSite = new ShopSite(driverConfig.getDriver());
            shopSite.shopSignInPage().goToSignInPage();
    }

    @Given("^I am on the Sign in page$")
    public void i_am_on_the_Sign_in_page() throws Throwable {
        //Assert.assertEquals(shopSite.shopSignInPage().getSignInUrl(),shopSite.getCurrentUrl());
    }


    @When("^I input a valid email address$")
    public void i_input_a_valid_email_address() throws Throwable {
        shopSite.shopSignInPage().inputUserName("oliverwilliamhall@gmail.com");
    }

    @When("^I input an invalid (.*)$")
    public void i_input_an_invalid_(String password) throws Throwable {
        shopSite.shopSignInPage().inputPassword(password);
        shopSite.shopSignInPage().clickSubmitButton();
    }

    @Then("^I receive the corresponding error (.*)$")
    public void iReceiveTheCorrespondingErrorError(String error) throws Throwable {
       // Assert.assertEquals(error, shopSite.shopSignInPage().getPasswordErrorText());
        shopSite.quit();
    }

}
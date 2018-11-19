package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopSignInPage {

    private WebDriver driver;
    private String signInUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String loggedInUrl = "http://automationpractice.com/index.php?controller=my-account";

    private By usernameFieldID = By.id("email");
    private By passwordFieldID =By.id("passwd");
    private By submitButtonID = By.id("SubmitLogin");
    private By createAccountLink = By.id("SubmitCreate");
    private By registerEmailFieldID = By.id("email_create");
    private By loginError = By.className("alert alert-danger").tagName("ol");
    private By incorrectPasswordErrorID = By.className("alert alert-danger");

    //Login Errors errors to test,    no details, no email, no password, incorrect details(authenticationfailed), correct details

//Register Errors to test, Invalid Email, existing email

    public String getPasswordErrorText(){
        return driver.findElement(loginError).getText();
    }

    public ShopSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(signInUrl);
    }

    public void inputUserName(String email){
        driver.findElement(usernameFieldID).sendKeys(email);
    }

    public void inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonID).click();
    }

    public String getSignInUrl() {
        return signInUrl;
    }

    public String getLoggedInUrl() {
        return loggedInUrl;
    }



    public void inputRegistrationEmail(String email){driver.findElement(registerEmailFieldID).sendKeys(email);}

    public void clickCreateAccount(){driver.findElement(createAccountLink).click();}




//    public void assertCurrentURLIsSignInPage(){
//
//       // Assert.assertEquals(driver.getCurrentUrl(), signInUrl);
//
//    }


}

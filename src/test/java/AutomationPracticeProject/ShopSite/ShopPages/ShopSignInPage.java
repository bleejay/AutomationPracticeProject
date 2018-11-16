package AutomationPracticeProject.ShopSite.ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopSignInPage {

    private WebDriver driver;
    private String signInUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";


    private By usernameFieldID = By.id("email");
    private By passwordFieldID =By.id("passwd");
    private By submitButtonID = By.id("SubmitLogin");
    private By incorrectPasswordErrorID = By.className("alert alert-danger");

    public ShopSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(signInUrl);
    }

    public void inputUserName(String name){
        driver.findElement(usernameFieldID).sendKeys(name);
    }

    public void inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonID).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorID).getText();
    }


//    public void assertCurrentURLIsSignInPage(){
//
//       // Assert.assertEquals(driver.getCurrentUrl(), signInUrl);
//
//    }


}

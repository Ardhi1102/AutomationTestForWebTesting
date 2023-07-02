package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class loginSteps {
    public WebDriver webDriver;

    public loginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input {string} as username and input {string} as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        Thread.sleep(2000);
    }

    @Given("User already on login page")
    public void verifyLoginPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
        Thread.sleep(1000);
    }

    @Then("User see {string} as error text on login page")
    public  void verifyErrorText(String A) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals( A , loginPage.textError());
        Thread.sleep(1000);
    }

}

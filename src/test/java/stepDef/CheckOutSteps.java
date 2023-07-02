package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.CheckOutPage;


public class CheckOutSteps {
    public WebDriver webDriver;
    public CheckOutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click checkout")
    public void clickCheckOut() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnCO();
        Thread.sleep(2000);
    }

    @Then("User already on checkout dashboard")
    public void coDashboard() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutDashboard());
        Thread.sleep(1000);

    }

    @When("User input {string} as first name, input {string} as last name, and input {string} as postal code")
    public void inputData(String fName, String lName, String pCode) throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.setFirstName(fName);
        checkOutPage.setLastName(lName);
        checkOutPage.setPostalCode(pCode);
        Thread.sleep(1000);
        checkOutPage.clickbtnContinue();
        Thread.sleep(1000);
    }

    @Then("User already on checkout overview")
    public void resultCO() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutOverview());
        Thread.sleep(1000);

    }

    @And("User click finish")
    public void clickFinish() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnFinish();
        Thread.sleep(2000);
    }

    @Then("User completes checkout")
    public void completeCheckout() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutComplete());
        Thread.sleep(2000);
    }

    @Then("Verify item price equals with item total")
    public void verifyPrice() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.viewItemPrice(),checkOutPage.viewItemTotal(), 0);
        Thread.sleep(1000);
    }

    @Then("Verify item total plus tax equals with total payment")
    public void verifyTotal() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.viewItemTotal() + checkOutPage.viewTax(), checkOutPage.viewTotalPayment(), 0);
        Thread.sleep(1000);
    }

    @And("User Click Burger Button")
    public void clickBurger() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnBurger();
        Thread.sleep(2000);
    }

    @And("User Click Button Log Out")
    public void clickLogOut() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnLogOut();
        Thread.sleep(2000);
    }
}

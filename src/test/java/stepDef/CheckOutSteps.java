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
    public void clickCheckOut() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnCO();
    }

    @Then("User already on checkout dashboard")
    public void coDashboard() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutDashboard());
    }

    @When("User input {string} as first name, input {string} as last name, and input {string} as postal code")
    public void inputData(String fName, String lName, String pCode) {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.setFirstName(fName);
        checkOutPage.setLastName(lName);
        checkOutPage.setPostalCode(pCode);
        checkOutPage.clickbtnContinue();
    }

    @Then("User already on checkout overview")
    public void resultCO() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutOverview());
    }

    @And("User click finish")
    public void clickFinish() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnFinish();
    }

    @Then("User completes checkout")
    public void completeCheckout() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertTrue(checkOutPage.checkOutComplete());
    }

    @Then("Verify item price equals with item total")
    public void verifyPrice() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.viewItemPrice(),checkOutPage.viewItemTotal(), 0);
    }

    @Then("Verify item total plus tax equals with total payment")
    public void verifyTotal() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        Assert.assertEquals(checkOutPage.viewItemTotal() + checkOutPage.viewTax(), checkOutPage.viewTotalPayment(), 0);
    }

    @And("User Click Burger Button")
    public void clickBurger() throws InterruptedException {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnBurger();
        Thread.sleep(1000);
    }

    @And("User Click Button Log Out")
    public void clickLogOut() {
        CheckOutPage checkOutPage = new CheckOutPage(webDriver);
        checkOutPage.clickbtnLogOut();
    }
}
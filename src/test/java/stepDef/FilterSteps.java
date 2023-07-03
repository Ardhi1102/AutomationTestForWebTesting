package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.FilterPage;
import pageObject.LoginPage;

import static stepDef.Hooks.webDriver;

public class FilterSteps {
    public WebDriver webDriver;

    public FilterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User sort product list by {string}")
    public void selectProductSort(String sort) {
        FilterPage filterpage = new FilterPage(webDriver);
        filterpage.selectProductFilter(sort);
    }

    @Then("User already on sales page")
    public void VerifyDashboard() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verDashboard());
    }

    @Then("User already on filter result")
    public void ResultFilter() {
        FilterPage filterpage = new FilterPage(webDriver);
        Assert.assertTrue(filterpage.resultFilter());
    }

}
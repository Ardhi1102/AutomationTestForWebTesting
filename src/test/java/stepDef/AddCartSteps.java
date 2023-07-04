package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.AddCartPage;

public class AddCartSteps {
    public WebDriver webDriver;
    public AddCartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User Click Add T Shirt Red")
    public void clickAddRedShirt() {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickAddCartShirtRed();
    }
    @And("User Click Add Sauce Onesie")
    public void clickAddSauceOnesie() {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickAddCartSauceOnesie();
    }
    @And("User Click Container")
    public void clickContain() {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickContainer();
    }
    @And("User Click Remove T Shirt Red")
    public void clickRemoveSauceOnesie() {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickRemoveTShirtRed();
    }
    @Then("User can view added cart")
    public void resultCart() {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        Assert.assertTrue(addCartPage.containDashboard());
    }
}

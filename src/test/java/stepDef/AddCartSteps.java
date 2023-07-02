package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.AddCartPage;

public class AddCartSteps {
    public WebDriver webDriver;
    public AddCartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User Click Add T Shirt Red")
    public void clickAddRedShirt() throws InterruptedException {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickAddCartShirtRed();
        Thread.sleep(2000);
    }
    @And("User Click Add Sauce Onesie")
    public void clickAddSauceOnesie() throws InterruptedException {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickAddCartSauceOnesie();
        Thread.sleep(2000);
    }
    @And("User Click Container")
    public void clickContain() throws InterruptedException {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickContainer();
        Thread.sleep(2000);
    }
    @And("User Click Remove T Shirt Red")
    public void clickRemoveSauceOnesie() throws InterruptedException {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        addCartPage.clickRemoveTShirtRed();
        Thread.sleep(2000);
    }
    @Then("User can view added cart")
    public void resultCart() throws InterruptedException {
        AddCartPage addCartPage = new AddCartPage(webDriver);
        Assert.assertTrue(addCartPage.containDashboard());
        Thread.sleep(1000);
    }
}

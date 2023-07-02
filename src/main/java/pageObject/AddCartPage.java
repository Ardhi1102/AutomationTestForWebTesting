package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {

    public static WebDriver driver;
    public AddCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement btnAddCartShirtRed;
    public void clickAddCartShirtRed(){
        btnAddCartShirtRed.click();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement btnAddCartSauceOnesie;
    public void clickAddCartSauceOnesie(){
        btnAddCartSauceOnesie.click();
    }

    @FindBy(id = "shopping_cart_container")
    private WebElement btnContainer;
    public void clickContainer(){
        btnContainer.click();
    }

    @FindBy(xpath = "//span[@class='title']")
        private WebElement containerDashboard;
    public boolean containDashboard(){
        return containerDashboard.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeTShirt;
    public void clickRemoveTShirtRed(){
        removeTShirt.click();
    }

}

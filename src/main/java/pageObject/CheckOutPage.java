package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.ArrayList;

public class CheckOutPage {
    public static WebDriver driver;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCO;
    public void clickbtnCO(){
        btnCO.click();
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement coDashboard;
    public boolean checkOutDashboard(){
        return coDashboard.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void setFirstName(String first_name){
        firstName.sendKeys(first_name);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setLastName(String last_name){
        lastName.sendKeys(last_name);
    }

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public void setPostalCode(String postal_code){
        postalCode.sendKeys(postal_code);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;
    public void clickbtnContinue(){
        btnContinue.click();
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement overviewCO;
    public boolean checkOutOverview(){
        return overviewCO.isDisplayed();
    }

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
    public void clickbtnFinish(){
        btnFinish.click();
    }

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement completeCO;
    public boolean checkOutComplete(){
        return completeCO.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement itemPrice;
    public Float viewItemPrice(){
        String str_itemPrice = itemPrice.getText();
        String str_repItemPrice = str_itemPrice.replaceAll("[^0-9.]", "");
        float str_fitemPrice = Float.parseFloat(str_repItemPrice);
        return str_fitemPrice;
    }

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;
    public Float viewItemTotal(){
        String str_itemTotal = itemTotal.getText();
        String str_repItemTotal = str_itemTotal.replaceAll("[^0-9.]", "");
        float str_fItemTotal = Float.parseFloat(str_repItemTotal);
        return str_fItemTotal;
    }

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    public Float viewTax(){
        String str_tax = tax.getText();
        String str_repTax = str_tax.replaceAll("[^0-9.]", "");
        float str_fTax = Float.parseFloat(str_repTax);
        return str_fTax;
    }

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalPayment;
    public Float viewTotalPayment(){
        String str_totalPayment = totalPayment.getText();
        String str_repTotalPayment = str_totalPayment.replaceAll("[^0-9.]", "");
        float str_fTotalPayment = Float.parseFloat(str_repTotalPayment);
        return str_fTotalPayment;
    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement btnBurger;
    public void clickbtnBurger(){
        btnBurger.click();
    }

    @FindBy(xpath = "//*[text() = 'Logout']")
    private WebElement btnLogOut;
    public void clickbtnLogOut(){
        btnLogOut.click();
    }
}

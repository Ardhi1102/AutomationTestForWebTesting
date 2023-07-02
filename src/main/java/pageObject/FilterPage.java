package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
    public static WebDriver driver;

    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;

    public void selectProductFilter(String sort){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sort);
    }

    @FindBy(className = "inventory_item_name")
    private WebElement resFilter;
    public boolean resultFilter(){
        return resFilter.isDisplayed();
    }
}


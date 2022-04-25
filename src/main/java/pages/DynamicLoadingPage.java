package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By exampleOneLink = By.linkText("Example 1: Element on page that is hidden");

    DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicallyLoadedPage clickExample1 (){
        driver.findElement(exampleOneLink).click();
        return new DynamicallyLoadedPage(driver);

    }


}

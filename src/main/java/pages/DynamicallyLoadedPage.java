package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicallyLoadedPage {
    private WebDriver driver;
    private By starButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.xpath("//*[@id=\"finish\"]/h4");


    DynamicallyLoadedPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickStarButton(){
        driver.findElement(starButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}

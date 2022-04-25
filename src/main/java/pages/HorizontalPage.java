package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalPage {
    private WebDriver driver;
    private By rangeTap = By.tagName("input");
    private By rangData = By.id("range");

    HorizontalPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveTheBar (){
       driver.findElement(rangeTap).click();
       driver.findElement(rangeTap).sendKeys(Keys.chord
               (Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT));
    }
    public String getRang (){
        return driver.findElement(rangData).getText();
    }
}

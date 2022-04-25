package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");
    KeyPressesPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterShiftAndOne (){
        enterText(Keys.chord(Keys.SHIFT, "1")+ " =!");
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }


}

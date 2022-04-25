package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By retrieveButton = By.id("form_submit");
    private By emailField = By.id("email");

    ForgetPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    public void setEmail (String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }


}

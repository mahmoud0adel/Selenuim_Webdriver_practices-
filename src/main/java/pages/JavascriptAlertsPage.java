package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By confirmAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By prompetAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By alertResult = By.id("result");

    JavascriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert (){
        driver.findElement(triggerAlertButton).click();
    }
    public void alerts_ClickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
       return driver.findElement(alertResult).getText();
    }
    public void clickConfirmButton(){
        driver.findElement(confirmAlertButton).click();
    }
    public void alerts_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alerts_ClickPrompet(){
        driver.findElement(prompetAlertButton).click();
    }
    public void enterTextAndClickOk(){
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;


    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage ClickFormAuthentication (){
        clickLink("Form Authentication");

        return  new LoginPage(driver);

    }

    public DropdownPage ClickDropdown (){
        clickLink("Dropdown");

        return  new DropdownPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public KeyPressesPage ClickKeyPresses (){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalPage ClickHorizontal (){
        clickLink("Horizontal Slider");
        return new HorizontalPage(driver);
    }

    public JavascriptAlertsPage clickAlerts (){
        clickLink("JavaScript Alerts");
        return new JavascriptAlertsPage(driver);
    }

    public FileUploaderPage clickFileUpload (){
        clickLink("File Upload");
        return new FileUploaderPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading (){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargAndDeepDom (){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }


    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}

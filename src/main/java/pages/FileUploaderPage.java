package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    FileUploaderPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton (){
        driver.findElement(uploadButton).click();
    }

    public void UploadFile (String absoulutePathOfFile){
        driver.findElement(inputField).sendKeys(absoulutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFiles (){
        return driver.findElement(uploadedFile).getText();
    }
}

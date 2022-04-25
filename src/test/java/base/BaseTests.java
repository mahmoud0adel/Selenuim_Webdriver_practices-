package base;

import com.google.common.io.Files;
import navigation.WindowsNavigation;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
   @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void teardown (){
        driver.quit();
    }
    @AfterMethod
    public void recordFilure (ITestResult result){
       if (ITestResult.FAILURE == result.getStatus()) {
           var camera = (TakesScreenshot) driver;
           File screenShot = camera.getScreenshotAs(OutputType.FILE);
           try {
               Files.move(screenShot, new File("C:\\Users\\Mahmoud Adel\\IdeaProjects\\webdriver_java\\Screenshots\\"+result.getName()+".png"));
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
    }

    public WindowsNavigation windowsNavigation (){
        return new WindowsNavigation(driver);
    }

}


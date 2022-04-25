package navigation;

import org.openqa.selenium.WebDriver;

public class WindowsNavigation {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsNavigation(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.forward();
    }
    public void goToUrl(String url){
          navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number Of Tabs :" + windows.size());
        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("switching to window:" + window);
            driver.switchTo().window(window);
            System.out.println("current window title:" + driver.getTitle());
        }
    }
}

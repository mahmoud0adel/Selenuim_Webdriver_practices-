package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTest extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        windowsNavigation().goBack();
        windowsNavigation().goForward();
        windowsNavigation().refreshPage();
        windowsNavigation().goToUrl("http://google.com.eg/");
    }
}

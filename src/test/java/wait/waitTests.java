package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTests extends BaseTests {

    @Test
    public void testWaiteUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStarButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "there's a mistake");

    }
}

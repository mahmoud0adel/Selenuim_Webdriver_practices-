package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {
    @Test
    public void TestBackspace (){
        var keyPage = homePage.ClickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals (keyPage.getResult(), "You entered: BACK_SPACE");
    }
    @Test
    public void TestShiftandOneKeys(){
        var keyPage = homePage.ClickKeyPresses();
        keyPage.enterShiftAndOne();
    }
}

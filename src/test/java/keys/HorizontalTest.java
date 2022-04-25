package keys;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HorizontalTest extends BaseTests {
   @Test
   public void TestHorizontalPage() {
       var horizontaPage = homePage.ClickHorizontal();
       horizontaPage.moveTheBar();
       assertEquals(horizontaPage.getRang(), "4");
   }
}

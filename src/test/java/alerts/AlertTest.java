package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alerts = homePage.clickAlerts();
        alerts.triggerAlert();
        alerts.alerts_ClickToAccept();
        assertEquals(alerts.getResult(),"You successfuly clicked an alert", "there's Error");
    }
    @Test
    public void testCancelAlert(){
        var alerts = homePage.clickAlerts();
        alerts.clickConfirmButton();
        alerts.alerts_ClickToDismiss();
        assertEquals(alerts.getResult(), "You clicked: Cancel" ,"there's mistake");
    }
    @Test
    public void testPrompetAlert (){
        var alert = homePage.clickAlerts();
        alert.alerts_ClickPrompet();
        alert.enterTextAndClickOk();
        assertEquals(alert.getResult(), "You entered: Hello", "there's mistake");
    }
}

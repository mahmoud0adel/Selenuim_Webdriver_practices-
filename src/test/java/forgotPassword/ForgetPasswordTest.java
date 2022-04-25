package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgetPasswordPage;
import static org.testng.Assert.*;



public class ForgetPasswordTest extends BaseTests {
    @Test
    public void testEmailWasSent (){
        ForgetPasswordPage forgetPasswordPage = homePage.clickForgetPassword();
        forgetPasswordPage.setEmail("maly@gmail.com");
        EmailSentPage emailSentPage = forgetPasswordPage.clickRetrieveButton();
        assertTrue(emailSentPage.getAlerttext().contains("Your e-mail's been sent!")
                , "Alert Text is incorrect");

    }
}

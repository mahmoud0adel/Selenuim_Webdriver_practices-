package uploadFile;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class uploadFileTest extends BaseTests {

    @Test
    public void fileUploadTest(){
        var fileUpload = homePage.clickFileUpload();
        fileUpload.UploadFile("C:\\Users\\Mahmoud Adel\\Pictures\\Capture.PNG");
        assertEquals(fileUpload.getUploadedFiles(),"Capture.PNG", "incorrec tPath");



    }
}

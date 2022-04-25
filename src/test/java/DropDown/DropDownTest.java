package DropDown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests {
    @Test
    public void testSelectOption (){
       var dropDownPage =  homePage.ClickDropdown();
       String option = "Option 1";
       dropDownPage.selectFromDropdown(option);
       var SelectedOptions = dropDownPage.getSelectedOption();
       assertEquals(SelectedOptions.size(), 1, "Incorrect number of Selections");
       assertTrue(SelectedOptions.contains(option) , "option not Selected");
    }

}

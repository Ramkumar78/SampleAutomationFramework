package com.spookytester;

import org.junit.Test;

public class DropDownListTest {

    DropDownValuesSelect dropDownValuesSelect = new DropDownValuesSelect();
    DriverPropertySetUP driverPropertySetUP=new DriverPropertySetUP();
    @Test
    public void dropDownValuesNavigationTest() {
        driverPropertySetUP.driverPropertySetup();
        dropDownValuesSelect.navigateToDropDownPage("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
    }
}

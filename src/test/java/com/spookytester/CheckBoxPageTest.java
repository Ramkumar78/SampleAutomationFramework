package com.spookytester;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CheckBoxPageTest {
    CheckBoxNavigation checkBoxNavigation = new CheckBoxNavigation();
    DriverPropertySetUP driverPropertySetUP = new DriverPropertySetUP();

    @Test
    public void checkBoxNavigationTest() {
        driverPropertySetUP.driverPropertySetup();
        System.out.println(checkBoxNavigation.navigatetoCheckBoxPage("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_checkbox"));


    }

}

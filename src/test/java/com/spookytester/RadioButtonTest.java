package com.spookytester;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

    NavigateAndSelectRadioButton navigateAndSelectRadioButton = new NavigateAndSelectRadioButton();
    DriverPropertySetUP driverPropertySetUP=new DriverPropertySetUP();


    @Test
    public void radioButtonSelected() {
        driverPropertySetUP.driverPropertySetup();

        String URL="https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio";
        navigateAndSelectRadioButton.navigateToRadioButtonW3Schhols(URL);

    }

}

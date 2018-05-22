package com.spookytester;

public class DriverPropertySetUP {

    public void driverPropertySetup() {
        System.setProperty("webdriver.gecko.driver", "./src/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");
    }

}

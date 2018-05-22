package com.spookytester;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckHomePageTest {

    PageSetup pageSetup=new PageSetup();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./src/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");


//        WebDriver driver = new FirefoxDriver();
//        driver = new FirefoxDriver();
        ChromeDriver driver1 = new ChromeDriver();
        driver1.switchTo().defaultContent();
        String S=driver1.getTitle();
        System.out.println(S);
        driver1.quit();

//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @Test
    public void checkPageTitleTest() {

        String Expected = "IPL 2018, Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
//        Assert.assertEquals(pageSetup.navigate_to_Page_Test(), Expected);

    }


}

package com.spookytester;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class PageSetup {

    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "./src/resources/drivers/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    @After
    public void tearDown() {
        driver.quit();
    }


    public String navigate_to_Page_Test() {

        driver.get("http://www.cricbuzz.com");
        String s = driver.getTitle();
        System.out.println("Page Title is ===>" + s);
        return s;
    }

    public String findLiveMatches(){
//        driver.get();

        return "2";
    }

    @Test
    public void checkPageTitleTest(){

        String Expected="IPL 2018, Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
        Assert.assertEquals(navigate_to_Page_Test(),Expected);
    }

}

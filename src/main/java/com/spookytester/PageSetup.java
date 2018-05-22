package com.spookytester;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.menu;

public class PageSetup {

    public WebDriver driver,driver1;





    public String navigate_to_Page_Test() {
        System.setProperty("webdriver.gecko.driver", "./src/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "./src/resources/drivers/chromedriver.exe");

        driver1= new ChromeDriver();
        driver1.get("http://www.cricbuzz.com");
        String s = driver1.getTitle();
        System.out.println("Page Title is ===>" + s);
        driver1.quit();
        return s;
    }

    @Test
    public void findLiveMatches() {
//        driver.get();

        driver1.get("http://www.cricbuzz.com");
        driver1.findElement(By.linkText("Live Scores")).click();
        System.out.println("current url is " + (driver1.getCurrentUrl()));
        System.out.println("Page title is ==>" + (driver1.getTitle()));
        driver1.quit();
//        driver.findElements(By)

//        return "2";
    }

    @Test
    public void checkPageTitleTest() {

        String Expected = "IPL 2018, Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com";
        Assert.assertEquals(navigate_to_Page_Test(), Expected);
    }

}

package com.spookytester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class NavigateAndSelectRadioButton { List<WebElement> radioGroup;

    public String navigateToRadioButtonW3Schhols(String URL) {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElement(By.xpath("/html/body/form/input[2]")).toString());
        driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();

        radioGroup= driver.findElements(By.name("gender"));
        System.out.println("Number of Radio buttons: " + radioGroup.size());


        if (driver.findElement(By.xpath("(//input[@name='gender'])[3]")).isSelected()){
            System.out.println("radio button selected yay");
        }
        else{
            System.out.println("whatever");
        }
        String x = driver.getTitle();
        System.out.println(x);
        driver.quit();
        return "Radio Button Selected";
    }

}

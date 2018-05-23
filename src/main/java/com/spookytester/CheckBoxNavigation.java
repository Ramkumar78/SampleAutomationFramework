package com.spookytester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBoxNavigation {

    List<WebElement> checkBoxGroup;

    public String navigatetoCheckBoxPage(String url){
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("iframeResult");
        WebElement checkbox1 = driver.findElement(By.name("vehicle"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@name='vehicle'])[2]"));
        checkbox2.click();
        boolean isFirstSelected = checkbox1.isSelected();
        assertTrue(isFirstSelected);
        boolean isSecondSelected = checkbox2.isSelected();
        assertTrue(isSecondSelected);

        System.out.println(checkbox1.getAttribute("value") + ": " + isFirstSelected);
        System.out.println(checkbox2.getAttribute("value") + ": " + isSecondSelected);
       String title=driver.getTitle();
        driver.quit();
        return title;
    }


}

package com.spookytester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownValuesSelect {
    List<WebElement> options;
    public String navigateToDropDownPage(String URL){
        WebDriver driver=new ChromeDriver();
        driver.get(URL);
        driver.switchTo().frame("iframeResult");
        Select newDropDownList=new Select(driver.findElement(By.cssSelector("select")));
        driver.findElement(By.cssSelector("select"));
        System.out.println("First selected item: " + newDropDownList.getFirstSelectedOption().getText());
        newDropDownList.selectByValue("Saab");
        options = newDropDownList.getOptions();
        System.out.println("Number of items: " + options.size());
        String title=driver.getTitle();
        driver.quit();
        return title;
    }

}

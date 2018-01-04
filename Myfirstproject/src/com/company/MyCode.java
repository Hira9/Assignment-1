package com.company;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Venturedive on 03/01/2018.
 */
public class MyCode {

   @Test
    public void test ()
   {System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.navigate().to("http://www.practiceselenium.com/practice-form.html");

       driver.findElement(By.name("firstname")).sendKeys ("Hira");
       driver.findElement(By.name("lastname")).sendKeys("Azhar");
       driver.findElement(By.id("sex-1")).click();
       driver.findElement(By.id("exp-3")).click();
       driver.findElement(By.id("datepicker")).sendKeys("04/1/18");
       driver.findElement(By.id("tea3")).click();
       driver.findElement(By.id("tool-2")).click();
       driver.findElement(By.id("continents")).click();
       WebElement mySelectElement = driver.findElement(By.id("continents"));
       Select dropdown= new Select(mySelectElement);
       dropdown.selectByVisibleText("USA");
       WebElement elementselect = driver.findElement(By.id("selenium_commands"));
       Select value = new Select(elementselect);
       value.selectByIndex(2);
       driver.findElement(By.id("submit")).click();
       driver.findElement(By.linkText("Menu")).click();

   }


}

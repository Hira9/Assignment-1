import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Venturedive on 03/01/2018.
 */
public class Myfirstclass {

    @Test

    public  void test ()
    {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.practiceselenium.com/practice-form.html");

        driver.findElement(By.name("firstname")).sendKeys ("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Jay"); //entering data


        WebElement sex = driver.findElement(By.cssSelector("input[value='Male']"));
        if (!sex.isSelected())
        {
            sex.click();
        }
       Assert.assertTrue(sex.isSelected());

        WebElement yocd = driver.findElement(By.cssSelector("input[value='5']"));
        if (!yocd.isSelected())
        {
            yocd.click();
        }
        Assert.assertTrue(yocd.isSelected());

        driver.findElement(By.id("datepicker")).sendKeys("24/5/17");

        WebElement tea = driver.findElement(By.cssSelector("input[value='Black Tea']"));
        if (!tea.isSelected())
        {
            tea.click();
        }
        Assert.assertTrue(tea.isSelected());



        WebElement wimeac = driver.findElement(By.cssSelector("input[value='Harmless Addiction']"));
        if (!wimeac.isSelected())
        {
            wimeac.click();
        }
        Assert.assertTrue(wimeac.isSelected());


        WebElement mySelectElement = driver.findElement(By.id("continents"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByVisibleText("Australia");

        WebElement option = dropdown.getFirstSelectedOption();
        System.out.println(option.getText());


        WebElement elementselect = driver.findElement(By.id("selenium_commands"));
        Select value = new Select(elementselect);
        value.selectByIndex(2);


        WebElement options = value.getFirstSelectedOption();
        System.out.println(options.getText());


        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {

        }


        driver.findElement(By.id("submit")).click();


        Boolean isPresent =  driver.findElement(By.linkText("seleniumframework.com")).isDisplayed();
        Assert.assertTrue("link not present", isPresent);
    }
}

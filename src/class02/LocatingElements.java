package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Go to Facebook

        driver.get("http://www.facebook.com");

        //Wait 1 second

        Thread.sleep(1000);

        //Maximize screen

        driver.manage().window().maximize();

        //Type email

        driver.findElement(By.id("email")).sendKeys("umutduran@hotmail.com");

        //Type password
        driver.findElement(By.name("pass")).sendKeys("123456");

        //Click on Create new account

        //driver.findElement(By.linkText("Create new account")).click();

        //Click on Forgot password?

        //driver.findElement(By.partialLinkText("password?")).click();

        //driver.quit();
    }
}

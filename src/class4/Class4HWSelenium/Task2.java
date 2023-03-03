package class4.Class4HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
        e.g option1 , option2 , option 3, option 4
        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
        */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement option : options) {
            String number = option.getAttribute("value");
            if (number.equalsIgnoreCase("option-4")) {
                option.click();
            }
        }

    }
}

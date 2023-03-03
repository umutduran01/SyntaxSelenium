package class4.Class4HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        /*
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box "click on this check box" is Selected
        if no Select the check box
        check gain if the checkbox is Selected or not
        */

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='myCheck']"));

        System.out.println("Check box is selected " + checkBox.isSelected());

        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        checkBox = driver.findElement(By.xpath("//input[@id='myCheck']"));

        System.out.println("Check box is selected " + checkBox.isSelected());

    }
}

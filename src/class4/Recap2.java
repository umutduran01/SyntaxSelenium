package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Recap2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.w3.org/WAI/UA/TS/html401/cp0101/0101-RADIO.html");

        driver.findElement(By.xpath("//input[@id='button2']")).click();


    }
}

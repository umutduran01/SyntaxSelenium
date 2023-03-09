package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Recap {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String finalLink = link.getAttribute("href");
            System.out.println(finalLink);
        }

    }
}

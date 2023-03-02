package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //goto amazon.com

        driver.get("https://www.amazon.com/");

        //get all links

        /*
        all link are located in <a> tag which is called anchor.
        we can use tagName for this.
        */

        List<WebElement> tags = driver.findElements(By.tagName("a"));

        //in order to print all elemnts, we need an iterator

        for (WebElement tag : tags) {
            String links = tag.getAttribute("href");
            System.out.println(links);
        }
    }
}

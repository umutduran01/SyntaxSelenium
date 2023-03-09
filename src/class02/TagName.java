package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();

        //Printing all link in amazon.com

        driver.findElements(By.tagName("a")); //To find relevant tag on a webpage, we use ctrl+f and search //tag


    }
}

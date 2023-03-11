package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwichTabDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gmail.com");

        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();

        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            driver.switchTo().window(handle); //first we switch to the page.
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                break;
            }

        }
        //verify if the page is has correct title.
        System.out.println(driver.getTitle());


    }
}

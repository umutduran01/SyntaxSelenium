package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSSSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid = 'open-registration-form-button']"));

        createNewAccount.click();

        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.cssSelector("input[name = 'firstname']"));

        firstName.sendKeys("Umut");
    }
}

package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        //click on ok button for prompt alert

        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();

        //We focus on the alert

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Umut");

        Thread.sleep(1000);

        alert.accept();


    }
}

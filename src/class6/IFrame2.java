package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        driver.switchTo().frame("iframe_a");

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));

        textBox.sendKeys("Hello");

        WebElement label = driver.findElement(By.xpath("//label"));

        System.out.println(label.getText()); //Enter your name:

        driver.switchTo().defaultContent();

        //clear what is written in the iframe
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));

        driver.switchTo().frame(frame1);

        textBox.clear();
    }
}

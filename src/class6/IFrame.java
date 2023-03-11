package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //Finding iFrame by Index

        //This will shift the focus to the iFrame.
        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));

        textBox.sendKeys("Umut");

        //go back to the parent contenct

        driver.switchTo().defaultContent();

        //get text

        WebElement text = driver.findElement(By.xpath("//h3"));

        System.out.println(text.getText());

    }
}

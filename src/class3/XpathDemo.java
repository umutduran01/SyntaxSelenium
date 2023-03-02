package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //open broswer and go to the website

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize window

        driver.manage().window().maximize();

        //find username, assign to a variable and send keys

        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));

        username.sendKeys("Tester");

        //find password and sendkeys

        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test");

        //clear username text box

        username.clear();

        //printing username text on console

        WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //printing password text on console

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));

        String passText = passwordText.getText();

        System.out.println(passText);
    }
}

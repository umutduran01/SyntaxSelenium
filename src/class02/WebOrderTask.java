package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Open the website

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Maximize the screen. It is always a good practice because if we don't do that, some of the elements may not be interacteble.

        driver.manage().window().maximize();

        //Sending username.

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester"); //ID is always a better option.

        //Sending password.

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //Clicking on Login.

        driver.findElement(By.className("button")).click();

    }
}

package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //Maximize the website

        driver.manage().window().maximize();

        //Enter username

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //Enter password

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //Click on login

        driver.findElement(By.className("button")).click();

        //Verify that the title is "Web Orders"

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("Title is correct.");
        } else {
            System.out.println("Title is incorrect.");
        }

        //Logout

        driver.findElement(By.linkText("Logout")).click();

        //Close the browser

        driver.quit();


    }
}

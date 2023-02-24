package class02.Class2HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        /*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        */


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button' and @data-testid='cookie-policy-manage-dialog-accept-button']")).click();

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("George");
        driver.findElement(By.name("lastname")).sendKeys("Michael");
        driver.findElement(By.name("reg_email__")).sendKeys("+905551112233");
        driver.findElement(By.name("reg_passwd__")).sendKeys("George123!");
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();

        //driver.findElement(By.name("birthday_year")).click(); --> Opens the dropdown menu.

        Select select = new Select(driver.findElement(By.name("birthday_year")));

        select.selectByValue("1995");

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(2000);

        //I could click on close pop up.

        driver.quit();


    }
}

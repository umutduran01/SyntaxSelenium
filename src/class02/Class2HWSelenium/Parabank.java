package class02.Class2HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) {

        /*
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
        */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("George");
        driver.findElement(By.id("customer.lastName")).sendKeys("Michael");
        driver.findElement(By.name("customer.address.street")).sendKeys("ABC Street No: 0");
        driver.findElement(By.name("customer.address.city")).sendKeys("Dallas");
        driver.findElement(By.name("customer.address.state")).sendKeys("Texas");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+987654321");
        driver.findElement(By.name("customer.ssn")).sendKeys("000111222");
        driver.findElement(By.name("customer.username")).sendKeys("george987");
        driver.findElement(By.name("customer.password")).sendKeys("Georgefromtexas");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Georgefromtexas");
        driver.findElement(By.xpath("//input[@class='button' and @value='Register']")).click();



    }
}

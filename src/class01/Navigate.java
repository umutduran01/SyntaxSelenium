package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        //We connect to WebDriver.

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //Initiate instance of Webdriver

        WebDriver driver = new ChromeDriver();

        //Open Google.

        driver.get("https://www.google.com");

        //We slow down.

        Thread.sleep(2000);

        //From Google, we nagivete our browser to Facebook.

        driver.navigate().to("https://www.facebook.com"); //We used two methods which are navigate() and to().

        //We slow down.

        Thread.sleep(2000);

        //From Facebook, we go back to Google.

        driver.navigate().back();

        //We slow down.

        Thread.sleep(2000);

        //From Google, we go to Facebook again.

        driver.navigate().forward();

        //We slow down.

        Thread.sleep(2000);

        //We refresh Facebook page.

        driver.navigate().refresh();

        //Close the browser.

        driver.close();
    }
}

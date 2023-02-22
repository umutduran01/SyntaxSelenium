package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //We maximize our browser in the screen.

        driver.manage().window().maximize(); //We used three different methods to maximize.

        //We make fullscreen.

        driver.manage().window().fullscreen();

        driver.close();

    }
}

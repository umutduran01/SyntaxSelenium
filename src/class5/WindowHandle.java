package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.gmail.com");

        //We open several tabs.

        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();

        //get window handle (an unique code for tabs). It changes every time.

        String parentWindowHandle = driver.getWindowHandle();

        System.out.println(parentWindowHandle);

        //get all window handles of all opened windows

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            System.out.println(windowHandle);
        }

    }
}

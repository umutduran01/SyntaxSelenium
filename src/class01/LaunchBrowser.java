package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //First we need to tell where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); //The name of the driver and its location. In Mac, we do use .exe in the end.

        //Now we create an instance of the webdriver. So we can use methods with the object.

        WebDriver driver = new ChromeDriver();

        //We open google.com with get() method.

        driver.get("https://www.facebook.com"); //www.facebook.com would also work here.

        //We get the current URL that is there in the browser.

        String URL = driver.getCurrentUrl(); //Stored in a String variable.

        System.out.println(URL); //URL is printed on the screen. - https://www.facebook.com/

        //We get the title of the current webpage.

        String title = driver.getTitle(); //Stored in a String varible.

        System.out.println(title); //Title is printed. - Facebook - log in or sign up

        //Before closing the browser, to observe what is happening, we can make it slower.

        Thread.sleep(3000); //If there is an underline under sleep, press "alt + enter" and "Add exception to method signature". The page will be on screen for 3000 miliseconds.

        //We close the browser.

        driver.quit();
    }
}

package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all age group web elements. we need a code to cover all age group elements but not more.

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for (WebElement radioButton : radioButtons) {
            String age = radioButton.getAttribute("value");
            if (age.equalsIgnoreCase("5 - 15")){
                radioButton.click();
            }
        }
    }
}

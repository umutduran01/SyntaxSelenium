package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //for loop

        for (int i = 0; i < checkBoxes.size(); i++) {
            if (checkBoxes.get(i).getAttribute("value").equalsIgnoreCase("Option-2")) {
                checkBoxes.get(i).click();
            }
        }

        //for each loop

        /*
        for (WebElement checkBox : checkBoxes) {
            String value = checkBox.getAttribute("value");
            if (value.equalsIgnoreCase("Option-2")) {
                checkBox.click();
            }
        }
        */
    }
}

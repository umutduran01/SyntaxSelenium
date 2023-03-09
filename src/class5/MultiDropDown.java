package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //Even if we are dealing with a multi selecet drop down, we are looking for a single element so we do not use find elements.

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select select = new Select(dropDown);

        select.selectByValue("Florida");
        select.selectByVisibleText("Texas");

        Thread.sleep(1000);

        //When we deal with multi select drop down, we can also deselect.

        select.deselectByValue("Florida");

        //We can check if a drop down menu is multi select.

        System.out.println(select.isMultiple());


    }
}

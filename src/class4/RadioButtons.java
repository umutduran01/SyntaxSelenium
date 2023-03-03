package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\umutd\\IdeaProjects\\SeleniumBatch15\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleButton = driver.findElement(By.cssSelector("input[name = 'optradio']"));

        //check if the radio button is enabled

        boolean isEnabledMale = maleButton.isEnabled();

        System.out.println("radio button male is enaabled " + isEnabledMale);

        //check if radio button is diplayed

        boolean isDisplayedMale = maleButton.isDisplayed();

        System.out.println("radio button is displayed " + isDisplayedMale);

        //check if the radio button is selected

        boolean isSelecetedMale = maleButton.isSelected();

        System.out.println("radio button is selected " + isSelecetedMale);

        //if it is not seleceted, click on if

        if (!isSelecetedMale) {
            maleButton.click();
        }

        //check again

        isSelecetedMale = maleButton.isSelected(); //We assign it again otherwise it would print the previous value

        System.out.println("radio button is selected " + isSelecetedMale);

    }
}

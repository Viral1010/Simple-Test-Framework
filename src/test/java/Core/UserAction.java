package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UserAction {


    public WebElement findElementByXpath(WebDriver driver, String elementName) {

        WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver1 -> driver1.findElement(By.xpath(elementName)));
        WebElement element =
                driver.findElement(By.xpath(elementName));


        return element;

    }

    public List<WebElement> findElementListByXpath(WebDriver driver, String[] elementName) {


        List<WebElement> element = driver.findElements(By.xpath(elementName[0]));


        return element;
    }
}

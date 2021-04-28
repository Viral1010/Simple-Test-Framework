package Core;

import Utility.Commons;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Browser {


    public WebDriver driver;


    @BeforeMethod
    public void init() {

        Commons common = new Commons();
        Properties config = common.readConfigFile("runConfig");

        if(config.getProperty("browser").equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            try {
                driver = new ChromeDriver();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.get(config.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();

    }
}

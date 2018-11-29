import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class Web_Driver {
    public static WebDriver driver;
    private static int timeout = 10;

    public static int getTimeout() {
        return timeout;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://blog.csssr.ru/qa-engineer/");

    }


    @AfterClass
    public static void closeDriver(){
        if (driver != null)
        driver.quit();
    }


}

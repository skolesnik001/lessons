package lesson16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by siava on 25.11.2016.
 */
@Listeners({TestListener.class})
public class LoggerTest {
    public WebDriver driver;

    // private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void alal(){
        //logger.info("Jack");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver = new EventFiringWebDriver(driver).register(new DriverListener());
        driver.get("https://www.google.com.ua/");
    }

    @Test
    public void FailedTest(){
        Assert.fail("alalalal");
    }

    @AfterTest
    public void done(){
        driver.quit();
    }
}

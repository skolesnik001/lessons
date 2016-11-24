package lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by siava on 24.10.2016.
 */
public class TestNgBeforeTest {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUpDriver () {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// ожидание страници
        driver.get("http://finance.i.ua/");


    }

}

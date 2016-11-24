package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by siava on 26.09.2016.
 */
public class GoogleSearch {
    @Test
    public void findSomeWords(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // wait some element
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //wait page

        driver.get("http://www.seleniumhq.org/download/maven.jsp");

        driver.close(); // close tab
        driver.quit(); // close connection




    }
}

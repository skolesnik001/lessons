import homeTask.HomeTask1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by siava on 27.09.2016.
 */
public class HomeTask1Test {

    WebDriver driver = new ChromeDriver();
    HomeTask1 homeTask1 = new HomeTask1(driver);

    String URL = "https://www.facebook.com/";
    public static final String MAIL = "kolesnik.911@mail.ru";
    public static final String PASSWORD = "6423416";

    @BeforeClass
    public void before() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }

    @Test
    public void login() throws InterruptedException {
        homeTask1.loginFaceBook(MAIL, PASSWORD);
        String title = driver.getTitle();
        System.out.println(title);
    }



}

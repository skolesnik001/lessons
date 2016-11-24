package lesson12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by siava on 07.11.2016.
 */
public class RegForm implements IRegForm {
    WebDriver driver = new ChromeDriver();

    public void typeName(String name) {

    }

    public void typeEmail(String email) {
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);
    }

    public void typePassword(String password) {

    }

    public void clickSubmit() {

    }
}

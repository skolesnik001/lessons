package homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created fieldQuestion siava on 15.10.2016.
 */

public class HomeTask5Test {

    WebDriver driver = new ChromeDriver();
    HomeTask5 homeTask5 = new HomeTask5(driver);
    public static final String EMAIL = "siava.kolesnikk@gmail.com";
    public static final String PASSWORD = "6423416";

    String URL = "https://kismia.com/";

    @BeforeClass
    public void before() {
        driver.get(URL);
    }


    /*@AfterTest
    public void after(){
        dr.close();
        dr.quit();
    }
*/


    public boolean isPresent(By by) {
        List<WebElement> elements = driver.findElements(by);
        if (elements.size() > 0) {
            return true;
        } else {
            return false;
        }

    }


    public boolean isPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void editNotChosen() {
        homeTask5.waitElement(homeTask5.buttonEditInProfile, 15);
        homeTask5.buttonEditInProfile.click();
        homeTask5.editInfoInProfile(0, 0);
        homeTask5.assertAll("not chosen", homeTask5.fieldEducationValue);
        homeTask5.buttonSave.click();
    }

    public void editEducation() {
        homeTask5.waitElement(homeTask5.buttonEditInProfile, 15);
        homeTask5.buttonEditInProfile.click();
        homeTask5.editInfoInProfile(3, 4);
        homeTask5.buttonSave.click();
        homeTask5.assertAll("higher education", homeTask5.fieldEducationValue);
    }






    @Test(priority = 1)
    @Parameters({"email", "password"})
    public void login(String email, String password) {
        homeTask5.login(email, password);
        homeTask5.assertAll("Edit", homeTask5.buttonEditInProfile);
    }

    @Test(dependsOnMethods = "login", priority = 5)
    public void selectNotChoose() {
        editNotChosen();
    }

    @Test(dependsOnMethods = "login", priority = 4)
    public void editEducationTest() {
        editEducation();
    }

    @Test(priority = 3)
    public void selectEnglishLanguages() {
        homeTask5.waitElement(homeTask5.buttonEnglishLanguages, 15);
        homeTask5.buttonEnglishLanguages.click();
    }

    @Test(dependsOnMethods = "login", priority = 2)
    public void clickButtonEditProfile() {
        homeTask5.waitElement(homeTask5.buttonEditInProfile, 15);
        homeTask5.buttonEditInProfile.click();
    }
}



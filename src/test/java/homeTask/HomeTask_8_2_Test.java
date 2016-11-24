package homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertFalse;

/**
 * Created by siava on 26.10.2016.
 */
public class HomeTask_8_2_Test {

    public static final String URL_KISMIA = "https://kismia.com";
    WebDriver dr = new ChromeDriver();

    By buttonRegister = By.xpath(".//*[@id='form-registration']");

    By buttonMen = By.xpath(".//*[@for='iam-boy']");

    By fieldName = By.xpath(".//*[@id='user-reg-myname']");

    By buttonContinue = By.xpath(".//*[@id='block-first']/button");

    By fieldEmailReg = By.xpath(".//*[@id='user-reg-myemail']");

    By fieldPasswordReg = By.xpath(".//*[@id='user-reg-mypass']");

    By buttonRegisteredUser = By.xpath("//*[@id='block-last']/button");

    @DataProvider
    public Object[][] emails() {
        return new Object[][]{
                {"1@,ua"},
                {"2@,ua"},
                {"3@,ua"},
                {"??@.ua"},
                {"!.@.ua"},
                {"@.ukr.net"},
        };
    }

    public boolean isPsyhologyTestingDisplayed() {
        return "Психологическое тестирование: Kismia".equals(dr.getTitle());
    }

    public void goToRegistrationAndRunTestWithEmails(String emailsInput) throws InterruptedException {
        dr.findElement(buttonRegister).click();
        Thread.sleep(500);
        dr.findElement(buttonMen).click();
        dr.findElement(fieldName).sendKeys("911");
        dr.findElement(buttonContinue).click();
        dr.findElement(fieldEmailReg).sendKeys(emailsInput);
        dr.findElement(fieldPasswordReg).sendKeys("1234567");
        dr.findElement(buttonRegisteredUser).click();
        Thread.sleep(700);
        dr.findElement(fieldEmailReg).clear();
        dr.findElement(fieldPasswordReg).clear();
        Thread.sleep(500);
    }

    @BeforeClass
    public void before() {
        dr.get(URL_KISMIA);
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void after() {
        dr.close();
        dr.quit();
    }

    @Test(dataProvider = "emails")
    public void testEmails(String emailsInput) throws Exception {
        goToRegistrationAndRunTestWithEmails(emailsInput);
        assertFalse(isPsyhologyTestingDisplayed());
    }

}



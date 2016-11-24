package homeTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by siava on 26.09.2016.
 */
public class HomeTask1 {

    WebDriver driver;

    public HomeTask1(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = ".//*[@id='email']")
    public WebElement fieldEmail;

    @FindBy(xpath = ".//*[@id='pass']")
    public WebElement fieldPassword;

    @FindBy(xpath = ".//*[@id='u_0_l']")
    public WebElement buttonEnter;




    protected void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void loginFaceBook(String mail, String password) {
        wait(1000);
        fieldEmail.click();
        wait(1000);
        fieldEmail.sendKeys(mail);
        wait(1000);
        fieldPassword.click();
        fieldPassword.sendKeys(password);
        wait(1900);
        buttonEnter.click();
        wait(1000);
    }

}



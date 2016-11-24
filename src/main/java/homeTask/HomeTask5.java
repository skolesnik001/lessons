package homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by siava on 15.10.2016.
 */
public class HomeTask5 {

    WebDriver driver;

    public HomeTask5(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
// вопрос к вейтерам, драйвер. ... как их использовать, писать метод и т.д.
    public void waitElement(WebElement element, int period){
        new WebDriverWait(driver, period).until(ExpectedConditions.visibilityOf(element));
    }
//....?....
    protected void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = ".//*[@id='user-email']")
    public WebElement fieldEmail;

    @FindBy(xpath = ".//*[@id='user-password']")
    public WebElement fieldPassword;

    @FindBy(xpath = ".//*[@id='sign-in-form']/button")
    public WebElement buttonLogIn;

    @FindBy(xpath = ".//*[@id='user_info_edit']")
    public WebElement buttonEditInProfile;

    @FindBy(xpath = ".//*[@id='user_info_save']")
    public WebElement buttonSave;

    @FindBy(xpath = ".//*[@id='footer']/div/div/ul/li[2]/a")
    public WebElement buttonEnglishLanguages;




    @FindBy(xpath = ".//*[@name='education']")
    public WebElement dropdownEducation;

    @FindBy(xpath = ".//*[@name='position']")
    public WebElement dropdownProfStatus;

    @FindBy(xpath = ".//*[@id='user_info']/table/tbody/tr[1]/td/select/option") //*[@id="user_info"]/table/tbody/tr[1]/td/select/option[1]
    public List<WebElement> listEducation;

    @FindBy(xpath = ".//*[@id='user_info']/table/tbody/tr[2]/td/select/option")
    public List<WebElement> listProfStatus;

    @FindBy(xpath = ".//*[@id='user_info']/table/tbody/tr[1]/td/span")
    public WebElement fieldEducationValue;

    public void assertAll(String expectedError, WebElement element) {
        String errorFieldText = element.getText();
        if (!errorFieldText.contains(expectedError)) {
            String errorMessage = String.format(
                    "Expected result: %s , not found. Actual error: %s",
                    expectedError,
                    errorFieldText);
            throw new AssertionError(errorMessage);
        }
    }


    By krestikPopUpWindows = By.xpath(".//*[@id='user_info_edit']");

    public void selectInDropdownEducation(int number){
        dropdownEducation.click();
        wait(600);
        listEducation.get(number).click();

    }

    public void selectInDropdownProfStatus(int number){
        dropdownProfStatus.click();
        wait(600);
        listProfStatus.get(number).click();

    }

    public void login(String email, String password){
        fieldEmail.click();
        fieldEmail.sendKeys(email);
        wait(600);
        fieldPassword.click();
        fieldPassword.sendKeys(password);
        wait(600);
        buttonLogIn.click();
        wait(1000);
    }

    public void editInfoInProfile(int numberEdu, int numberStatus){
        selectInDropdownEducation(numberEdu);
        wait(800);
        selectInDropdownProfStatus(numberStatus);
        wait(800);
    }





}

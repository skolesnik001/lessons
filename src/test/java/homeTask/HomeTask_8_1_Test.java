package homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;

/**
 * Created fieldQuestion siava on 25.10.2016.
 */
public class HomeTask_8_1_Test {
    private static int scanner() {
        Scanner scann = new Scanner(System.in);
        int a1;
        a1 = scann.nextInt();
        return a1;
    }

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // wait some element
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //wait page

        By fieldQuestion = By.xpath(".//*[@id='bulle-inner']");

        By buttonPlay = By.xpath(".//*[@id='home-link']");
        By fieldAge = By.xpath(".//*[@id='elokence_sitebundle_identification_age']");
        By buttonRealPlay = By.xpath(".//*[@id='infos-area-footer']/input");
        By elementPhoto = By.xpath(".//*[@id='photo']");


        By button1 = By.xpath(".//*[@id='reponse1']");
        By button2 = By.xpath(".//*[@id='reponse2']");
        By button3 = By.xpath(".//*[@id='reponse3']");
        By button4 = By.xpath(".//*[@id='reponse4']");
        By button5 = By.xpath(".//*[@id='reponse5']");

        By[] buttonArray = new By[]{
                button1, button2, button3, button4, button5
        };

        driver.get("http://ru.akinator.com/");
        driver.findElement(buttonPlay).click();
        driver.findElement(fieldAge).sendKeys("99");
        driver.findElement(buttonRealPlay).click();
        while (driver.findElements(button1).size() > 0) {
            Thread.sleep(500);
            String questionText = driver.findElement(fieldQuestion).getText();
            System.out.println(questionText);
            int inputInt = scanner();
            driver.findElement(buttonArray[inputInt -1 ]).click();
            Thread.sleep(300);

        }
    }
}



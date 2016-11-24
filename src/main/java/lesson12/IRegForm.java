package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by siava on 07.11.2016.
 */

    public interface IRegForm {
    void typeName (String name);
    void typeEmail (String email);
    void typePassword (String password);
    void clickSubmit();
}

package lesson12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by siava on 07.11.2016.
 */
public class TestRegForm {

    @Test
    public void regUser() {
        IRegForm regForm = new RegForm();
        regForm.typeEmail("1");
        regForm.typePassword("sss");
        regForm.clickSubmit();
    }
}

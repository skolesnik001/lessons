package lesson8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by siava on 24.10.2016.
 */
public class TesnNgDataProvaider {

    @DataProvider
    public Object[][] emails(){
        return new Object[][]{
                {"1 ", "2 ", "3 "},
                {"4 ", "5 ", "6 "},
                {"7 ", "8 ", "9 "},
        };

    }
    @Test(dataProvider = "emails")
    public void emailValidation (String a, String b, String c){
        System.out.println(a);
        //System.out.print(b);
        //System.out.println(c);

    }
}

package lesson8;

import org.testng.annotations.Test;

/**
 * Created by siava on 24.10.2016.
 */
public class TestNgTestMethod {

    @Test
    public void aTest(){
        System.out.println("a test");
    }

    @Test(dependsOnMethods = "aTest")
    public void bTest(){
        System.out.println("b test");
    }

    @Test
    public void cTest(){
        System.out.println("c test");
    }

    @Test
    public void noTest(){
        System.out.println("no test");
    }



}

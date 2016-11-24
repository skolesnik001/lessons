package homeTask;

import org.testng.annotations.*;

/**
 * Created by siava on 28.10.2016.
 */
public class HomeTask_8_4 {

    @Test
    public void t1(){
        System.out.println("t1");
    }

    @Test
    public void t2(){
        System.out.println("t2");
    }

    @Test

    public void t3(){
        System.out.println("t3");
    }

    @Test
    @Parameters({"par1", "par2", "par3"})
    public void t4(String par1, String par2, String par3){
        System.out.println(par1);
        System.out.println(par2);
        System.out.println(par3);
    }

    @Test
    public void t5(){
        System.out.println("t5");
    }
}

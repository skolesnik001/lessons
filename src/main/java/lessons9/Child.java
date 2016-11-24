package lessons9;

import org.testng.annotations.Test;

/**
 * Created by siava on 28.10.2016.
 */
public class Child extends Parent{

    public Child(String name, String birtday1){
        super(name, birtday1);
    }

    public void cry(){
        makeSomeNoise();
        nameValue = "Sparrov";
    }

    @Test
    @Override
    public void makeSomeNoise(){
        super.makeSomeNoise();
        System.out.println(birthDateValue);
    }


}

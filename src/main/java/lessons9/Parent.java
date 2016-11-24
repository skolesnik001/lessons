package lessons9;

/**
 * Created by siava on 28.10.2016.
 */
public class Parent {



    public Parent(String name, String birthDate){
        this.nameValue = name;
        this.birthDateValue = birthDate;

    }


    public String nameValue = "Dimon";
    public String birthDateValue = "01.01.01";


    public void makeSomeNoise(){
        System.out.println("FI-DA");
    }

    public void sleep() throws  InterruptedException {
        Thread.sleep(5000);
    }






}

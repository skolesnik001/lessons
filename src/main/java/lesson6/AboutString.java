package lesson6;

/**
 * Created by siava on 17.10.2016.
 */
public class AboutString {
    public static void main(String[] args) {
        String myString = "Jack";
        myString.concat(" Sparoow");
        System.out.println(myString);

        myString = myString.concat(" Sparoww");
        System.out.println(myString);
    }
}
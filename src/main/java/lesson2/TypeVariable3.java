package lesson2;

/**
 * Created by siava on 30.09.2016.
 */
public class TypeVariable3 {
    public static void main(String[] args) {
        int i = 605233;
        long lo = i;
        short s = (short) lo;
        System.out.println(s);

        char ch='a';
        int ina = (int)ch;
        System.out.println(ina);


        Integer d = new Integer(100);
        Character c = new Character('c');



    }
}
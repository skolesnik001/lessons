package lesson2;

/**
 * Created by siava on 30.09.2016.
 */
public class JavaWrapper {

    public static void main(String[] args) {
        String s = "5";
        int i = 652;

        int result = Integer.parseInt(s) + i;
        String s1 = Integer.toString(i);

        System.out.println(s1);
    }

}


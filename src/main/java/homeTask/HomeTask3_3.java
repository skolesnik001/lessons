package homeTask;

/**
 * Created by siava on 05.10.2016.
 */
public class HomeTask3_3 {
    public static void main(String[] args) {
        int a = 11;
        int b = 1;
        int c = 8;
        int d = 9;
        int e = 22;

        if (a < b & a < c & a < d & a < e) {
            System.out.println(a + "- a - наименьшее число из представленных");
        }
        if (b < a & b < c & b < d & b < e) {
            System.out.println(b + "- b - наименьшее число из представленных");
        }
        if (c < a & c < b & c < d & c < e) {
            System.out.println(c + "- c - наименьшее число из представленных");
        }
        if (d < a & d < b & d < c & c < e) {
            System.out.println(d + "- d - наименьшее число из представленных");
        }
        if (e < a & e < b & e < c & e < d ){
            System.out.println(e + "- e - наименьшее число из представленных");
                }


        if (a > b & a > c & a > d & a > e) {
            System.out.println(a + "- a - наибольшее число из представленных");
        }
        if (b > a & b > c & b > d & b > e) {
            System.out.println(b + "- b - наибольшее число из представленных");
        }
        if (c > a & c > b & c > d & c > e) {
            System.out.println(c + "- c - наибольшее число из представленных");
        }
        if (d > a & d > b & d > c & c > e) {
            System.out.println(d + "- d - наибольшее число из представленных");
        }
        if (e > a & e > b & e > c & e > d ){
            System.out.println(e + "- e - наибольшее число из представленных");
        }

    }



}


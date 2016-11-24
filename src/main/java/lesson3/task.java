package lesson3;

/**
 * Created by siava on 03.10.2016.
 */
public class task {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int c = 8;
        int d = 9;

        if(a<b & a<c & a<d) {
            System.out.println(a + "- a - наименьшее число из представленных");
        }
        if(b<a & b<c & b<d) {
            System.out.println(b + "- b - наименьшее число из представленных");
        }
        if(c<a & c<b & c<d) {
            System.out.println(c + "- c - наименьшее число из представленных");
        }
        if(d<a & d<b & d<c) {
            System.out.println(d + "- d - наименьшее число из представленных");
        }

    }


    }


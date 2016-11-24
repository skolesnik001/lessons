package lesson3;

import java.util.Scanner;

/**
 * Created by siava on 03.10.2016.
 */
public class Test {

    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Week days: ");
        int input = scaner.nextInt();


        switch (input) {
            case 1:
                System.out.println("Mon");
                break;
        }

        switch (input) {
            case 2:
                System.out.println("Tue");
                break;
            default:
                System.out.println("blalbllbla"); // если ничего не нашло, ввести не 2 и не 1
        }



    }
    }


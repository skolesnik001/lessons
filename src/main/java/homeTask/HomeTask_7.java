package homeTask;

import java.util.Scanner;

/**
 * Created by siava on 23.10.2016.
 */
public class HomeTask_7 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("type some");
        String numberLine = scann.nextLine();

        char firstChar = numberLine.charAt(0);
        char lastChar = numberLine.charAt(numberLine.length() - 1);
        if (isOperation(firstChar) || isOperation(lastChar)) {
            System.out.println("Incorrect format");
            return;
        }

        String result = numberLine;
        result = startCulc(result, '*');
        result = startCulc(result, '/');
        result = startCulc(result, '-');
        result = startCulc(result, '+');
        System.out.println(result);
    }

    private static String startCulc(String string, char symbol) {
        if (string.indexOf(symbol) == -1) {
            return string;
        }
        while (string.indexOf(symbol) != -1 && string.indexOf(symbol) != 0 && string.indexOf(symbol) != string.length() - 1) {
            string = makeOperation(string, symbol);
        }
        System.out.println(string);
        return string;
    }

    private static String makeOperation(String str, char oper) {
        String result = str;

        int i = str.indexOf(oper);

        if (i != -1 && i != 0) {
            int[] a1 = getLeft(str, i);
            int[] a2 = getRight(str, i);

            int r = make(a1[0], a2[0], oper);
            result = result.substring(0, a1[1]) + r + result.substring(a2[1], str.length());
        }

        return result;
    }

    private static Integer make(int a1, int a2, char oper) {
        if (oper == '*') {
            return a1 * a2;
        }
        if (oper == '/') {
            return a1 / a2;
        }
        if (oper == '+') {
            return a1 + a2;
        }
        if (oper == '-') {
            return a1 - a2;
        }
        return null;
    }

    private static int[] getRight(String str, int pos) {
        int[] result = new int[2];
        String res = "";
        int i;
        for (i = pos + 1; i < str.length(); i++) {
            if (!isOperation(str.charAt(i))) {
                res = res + str.charAt(i);
            } else {
                break;
            }
        }
        result[0] = Integer.parseInt(res);
        result[1] = i;
        return result;
    }

    private static int[] getLeft(String str, int pos) {
        int[] result = new int[2];
        String res = "";
        int i;
        for (i = pos - 1; i >= 0; i--) {
            if (!isOperation(str.charAt(i))) {
                res = res + str.charAt(i);
            } else {
                break;
            }
        }
        res = new StringBuilder(res).reverse().toString();
        result[0] = Integer.parseInt(res);
        result[1] = i + 1;
        return result;
    }

    private static boolean isOperation(char symbol) {
        return symbol == '*' || symbol == '/' || symbol == '+' || symbol == '-';
    }
}

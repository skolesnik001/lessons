package questions;

/**
 * Created by siava on 25.11.2016.
 */
public class Question12 {
    public static void main(String[] args) {
        String s = "гж976ти34.рв32";
        String result = s.replaceAll("\\D","");
        System.out.print(result);
    }
}

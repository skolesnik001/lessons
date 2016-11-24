package homeTask;

/**
 * Created by siava on 23.10.2016.
 */
public class ReturnMethod {

    public static void main(String[] args) {
        int pos = getPosition();
        System.out.println(pos);
    }

    private static int getPosition() {
        int position = 10;
        return position;
    }

}

package lesson6;

/**
 * Created by siava on 17.10.2016.
 */
public class User {


    public String name;
    public int age;
    public String city;
    public char gender;



    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "Dima";
        user1.age = 26;

        System.out.println(user1.name +":"+ user1.age);

    }
}

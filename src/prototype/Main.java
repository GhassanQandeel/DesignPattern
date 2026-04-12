package prototype;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ali", 22);

        // clone
        User user2 = (User) user1.clone();
        user2.setName("Ahmad");

        System.out.println(user1);
        System.out.println(user2);
    }
}
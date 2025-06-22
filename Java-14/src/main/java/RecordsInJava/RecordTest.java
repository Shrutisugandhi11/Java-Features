package RecordsInJava;

public class RecordTest {
    public static void main(String[] args) {
        User user = new User("Shruti", "Epam", "India");
        user.greet("Jack");
        System.out.println(user.country());
    }
}

public class RecordWithTypeInference {
    public static void main(String[] args) {
        Object object = new User("Shruti", 99);
        if (object instanceof User(var x, var y)) {
            System.out.println(x);
            System.out.println(y);
        }
    }
}

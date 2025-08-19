public class PatternMatchingForSwitchSecondReview {
    public static void main(String[] args) {
        Object obj = 123;

        switch (obj) {
            case Integer integer -> System.out.println("Integer: " + integer);
            case String string -> System.out.println("String: " + string);
            default -> System.out.println("Unknown type");
        }
    }
}

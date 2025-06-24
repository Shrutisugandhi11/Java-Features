import RecordsInJava.User;

/**
 * More abbreviate way defining NPE were introduced with better messages for debugging
 */
public class NullPointerException {
    public static void main(String[] args) {
        User user = new User("Shruti", null, "India");
        System.out.println(user.company().toUpperCase().repeat(2));
        /**
         * Result: Exactly what method is having null is clearly stated in exception stack trace.
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because the return value
         * of "RecordsInJava.User.company()" is null
         * 	at NullPointerException.main(NullPointerException.java:9)
         */

        /**
         * Previously
         * Exception in thread "main" java.lang.NullPointerException
         *     at Main.main(Main.java:9)
         *     only line number and methods were returned
         */
    }

}

package RecordsInJava;

public record User(String userName, String company, String country) {

    static int phoneCode = 91;
    //Instance variable not allowed
    //int phoneCode=91;

    //Local varibles are allowed
    public void greet(String userName) {
        System.out.println("Hello " + userName);
        System.out.println("Good day! " + this.userName);
    }

    //validation constructor
    public User {
        if (!country.startsWith("I")) {
            throw new RuntimeException("Not a valid country");
        }
    }

    //main method is allowed as it static
    public static void main(String[] args) {
    }
}

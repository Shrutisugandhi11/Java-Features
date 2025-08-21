public class Child extends Parent {
    String name;

    public Child() {
        System.out.println("Test: Called before super");
        super();

    }

    public Child(String name) {
        boolean b = name != null;
        super();
    }
}

void main() {
    Child child = new Child();
    Child child1 = new Child("name");

}
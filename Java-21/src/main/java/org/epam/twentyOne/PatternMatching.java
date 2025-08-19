
void main() {

    System.out.println(getResult("Hello"));
    System.out.println(getResult(100));
    System.out.println(getResult(10.0));
    System.out.println(getResult(null));

}

private static String getResult(Object match) {
    return switch (match) {
        case String string -> "This is a string object" + string;
        case Integer integer -> "This is a integer object" + integer;
        case null -> "Oops, It's a null value!";
        default -> "Running default as no value matched!";

    };
}
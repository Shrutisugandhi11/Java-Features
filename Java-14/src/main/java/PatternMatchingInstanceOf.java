public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        Object object = "Shruti";

//        if (obj instanceof String) {
//            String str = (String) obj;  ⛔ Explicitly casting

        if (object instanceof Integer number)
            System.out.println(number.hashCode());
        else if (object instanceof String stringName)
            System.out.println(stringName.toUpperCase() + " " + object.toString());
    }
}

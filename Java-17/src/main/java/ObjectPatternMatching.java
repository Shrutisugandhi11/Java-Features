import java.util.Scanner;
//Instead of
public class ObjectPatternMatching {
    public static void main(String[] args) {
        Object shape = "Integer.valueOf(1)";
        switch (shape) {
            case String s -> System.out.println(s.toUpperCase() + ":::: string");
            case Integer i -> System.out.println(i + "Integer");
            default -> System.out.println("");
        }
    }
}


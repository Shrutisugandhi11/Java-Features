package org.epam.twenty;

public class PatternMatchingForSwitchPreview {
    public static void main(String[] args) {
        Object obj = "Hello";

        var result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;

            default -> "No Match Found!";
        };
        System.out.println(result);
    }
}

package StringEnhancements;

public class StringMethods {
    public static void main(String[] args) {

        //1.isBlank():Checks if the string is empty or contains only whitespace
        String string = "shruti";
        System.out.println(string.isBlank());
        System.out.println("".isBlank());

        //2.lines():Splits string into lines (as a Stream)
        String paragraph = """
                Java 11 introduced several useful enhancements \nto the String class.
                One such method is lines(), which returns a stream of lines from the string.
                This can be particularly useful for processing \n multi-line input or logs
                For example, reading multi-line strings and analyzing each line separately becomes easier.
                You can also use it to count lines, filter specific content, or apply transformations.""";
        paragraph.lines().forEach(System.out::println);

        /**
         * strip():Removes leading and trailing whitespaces (Unicode-aware)
         * stripLeading():Removes only leading whitespaces
         * stripTrailing():Removes only trailing whitespaces
         */
        String whiteSpace="    shruti   ";
        System.out.println("Original String"+":".repeat(5)+whiteSpace+"end");
        System.out.println("strip()"+":".repeat(5)+whiteSpace.strip()+"end");
        System.out.println("stripLeading()"+":".repeat(5)+whiteSpace.stripLeading()+":end");
        System.out.println("stripTrailing()"+":".repeat(5)+whiteSpace.stripTrailing()+":end");
    }
}

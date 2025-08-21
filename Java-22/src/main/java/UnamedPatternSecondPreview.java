import java.util.List;

public class UnamedPatternSecondPreview {
    public static void main(String[] args) {
        List<String> stringList = List.of("A", "B", "C", "D", "E");


        for (String _:stringList) {
            System.out.println("Looping...");
        }
        stringList.forEach(_ -> System.out.println("Looping again..."));

    }
}

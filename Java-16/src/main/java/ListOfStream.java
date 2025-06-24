import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStream {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Shruti", "Sakshi", "Shivani", "Priya", null);

        List<String> strings = stringList.stream().filter(s -> s.startsWith("S")).toList();

        System.out.println(strings);
    }
}

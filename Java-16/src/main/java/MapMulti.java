import java.util.Arrays;
import java.util.List;

public class MapMulti {
    public static void main(String[] args) {
        List<String> words = List.of("a b", "c d", "e");
        List<String> strings = words.stream().flatMap(str -> Arrays.stream(str.split(" "))).toList();
        List<Object> objectList = words.stream().mapMulti(((string, consumer) -> {
            for (String s : string.split(" "))
                consumer.accept(s);
        })).toList();
        System.out.println(words);
        System.out.println(strings); //processed each elements one by one as stream
        System.out.println(objectList);//Directly takes whatever operation to be performed,consumes and add in the stream
    }
}

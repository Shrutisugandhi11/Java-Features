import java.util.List;
import java.util.stream.LongStream;

public class MapMultiToLong {
    public static void main(String[] args) {
        List<String> words = List.of("aaa bb", "c dddd", "e");
        LongStream longStream = words.stream().mapMultiToLong((word, consume) -> {
            for (String s : word.split(" ")) {
                consume.accept(s.length());
            }
        });
        System.out.println(longStream.boxed().toList());
    }
}

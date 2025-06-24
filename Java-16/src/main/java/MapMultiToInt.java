import java.util.List;
import java.util.stream.IntStream;

public class MapMultiToInt {

    public static void main(String[] args) {
        List<String> words = List.of("aaa bb", "c dddd", "e");
        IntStream intStream = words.stream().mapMultiToInt((word, consume) -> {
            for (String s : word.split(" ")) {
                consume.accept(s.length());
            }
        });
        System.out.println(intStream.boxed().toList());
    }
}

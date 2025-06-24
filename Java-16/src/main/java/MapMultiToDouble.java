import java.util.List;
import java.util.stream.DoubleStream;

public class MapMultiToDouble {
    public static void main(String[] args) {
        List<String> words = List.of("aaa bb", "c dddd", "e");
        DoubleStream doubleStream = words.stream().mapMultiToDouble((word, consume) -> {
            for (String s : word.split(" ")) {
                consume.accept(s.length());
            }
        });
        System.out.println(doubleStream.boxed().toList());
    }
}

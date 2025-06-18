import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectersTeeing {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        var teeingResult = list.stream()
                .collect(Collectors.teeing(Collectors.averagingInt(Integer::intValue), Collectors.maxBy(Integer::compareTo), (sum, max) -> "sum:::" + sum + ",count:::" + max.orElseGet(()->{ System.out.println("No value  present"); return 0;})));
        System.out.println(teeingResult);
    }
}

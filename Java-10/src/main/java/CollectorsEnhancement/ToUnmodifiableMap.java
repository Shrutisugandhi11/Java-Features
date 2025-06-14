package CollectorsEnhancement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

/**
 * returns the unmodifiable map after processing data
 */
public class ToUnmodifiableMap {
    public static void main(String[] args) {
        var numbers = List.of(2, 4, 6);

        var numberMap = numbers.stream()
                .collect(Collectors.toUnmodifiableMap(num -> num, num -> num * num));

        out.println(numberMap);
        // numberMap.put(9, 81);  throws:UnsupportedOperationException

    }
}
